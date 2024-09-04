package top.guyimaple.quick.common.current;

import org.springframework.stereotype.Component;
import top.guyimaple.quick.common.entry.Project;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author guyi
 * @date 2024/8/30
 */
@Component
public class CurrentContext {

    private static final String PROJECT_KEY = "project";

    /**
     * 当前项目
     */
    private static ThreadLocal<Map<String, Object>> CONTEXT = new ThreadLocal<>();

    public void clear() {
        CONTEXT.remove();
    }

    public Map<String, Object> getContext() {
        return Optional.ofNullable(CONTEXT.get()).orElseGet(Collections::emptyMap);
    }

    public <T> Optional<T> get(String key, Class<T> type) {
        return Optional.ofNullable(CONTEXT.get())
                .map(type::cast);
    }

    public void set(String key, Object value) {
        Map<String, Object> map = Optional.ofNullable(CONTEXT.get()).orElseGet(HashMap::new);
        map.put(key, value);
        CONTEXT.set(map);
    }

    public Optional<Project> getProject() {
        return this.get(PROJECT_KEY, Project.class);
    }
    public void setProject(Project project) {
        this.set(PROJECT_KEY, project);
    }

}
