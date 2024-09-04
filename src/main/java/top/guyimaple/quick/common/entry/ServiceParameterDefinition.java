package top.guyimaple.quick.common.entry;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author guyi
 * @date 2024/9/4
 */
@Getter
@AllArgsConstructor
public class ServiceParameterDefinition {

    private final String name;
    private final String detail;
    private final String defaultValue;

}
