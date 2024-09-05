package top.guyimaple.quick.common.current;

import lombok.Getter;
import top.guyimaple.quick.common.entry.Project;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author guyi
 * @date 2024/8/30
 */
@Getter
public class CurrentContext {

    private static final String PROJECT_KEY = "project";

    /**
     * 当前项目
     */
    private final Map<String, Object> context = new HashMap<>();

    public <T> Optional<T> get(String key, Class<T> type) {
        return Optional.ofNullable(context.get(key))
                .map(type::cast);
    }

    public void set(String key, Object value) {
        context.put(key, value);
    }

    public Optional<Project> getProject() {
        return this.get(PROJECT_KEY, Project.class);
    }
    public void setProject(Project project) {
        this.set(PROJECT_KEY, project);
    }

}
