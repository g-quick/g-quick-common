package top.guyimaple.quick.common.executor.template;

import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.resource.Resource;
import org.apache.velocity.runtime.resource.loader.ResourceLoader;
import org.apache.velocity.util.ExtProperties;

import java.io.Reader;
import java.io.StringReader;

/**
 * @author guyi
 * @date 2024/8/30
 */
public class StringResourceLoader extends ResourceLoader {

    public static final String KEY = "template";

    private final String template;
    public StringResourceLoader(String template) {
        this.template = template;
    }

    @Override
    public void init(ExtProperties extProperties) {

    }

    @Override
    public Reader getResourceReader(String templateName, String encode) throws ResourceNotFoundException {
        if (KEY.equals(templateName)) {
            return new StringReader(this.template);
        }
        return null;
    }

    @Override
    public boolean isSourceModified(Resource resource) {
        return false;
    }

    @Override
    public long getLastModified(Resource resource) {
        return 0;
    }
}
