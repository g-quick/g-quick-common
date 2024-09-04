package top.guyimaple.quick.common.executor.template;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.stereotype.Component;
import top.guyimaple.quick.common.current.CurrentContext;

import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.Optional;

/**
 * @author guyi
 * @date 2024/8/30
 */
@Component
public class TemplateExecutor {

    private final CurrentContext current;
    public TemplateExecutor(CurrentContext current) {
        this.current = current;
    }

    private VelocityEngine getEngine(String content) {
        VelocityEngine engine = new VelocityEngine();
        engine.setProperty("resource.loader", "string");
        engine.setProperty("string.resource.loader.instance", new StringResourceLoader(content));
        return engine;
    }

    public String execute(String content, Map<String, Object> params) {
        VelocityEngine engine = this.getEngine(content);

        VelocityContext context = new VelocityContext();
        current.getContext().forEach(context::put);
        Optional.ofNullable(params).ifPresent(ps -> ps.forEach(context::put));

        Writer writer = new StringWriter();
        Template template = engine.getTemplate(StringResourceLoader.KEY);
        template.merge(context, writer);
        return writer.toString();
    }

}
