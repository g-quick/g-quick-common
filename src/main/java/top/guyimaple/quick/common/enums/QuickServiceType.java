package top.guyimaple.quick.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 服务类型
 * @author guyi
 * @date 2024/9/4
 */
@Getter
@AllArgsConstructor
public enum QuickServiceType {

 FRAMEWORK("framework", "框架"),
 SERVICE("service", "服务"),
 RUNNER("runner", "执行器");

 private final String code;
 private final String text;

}
