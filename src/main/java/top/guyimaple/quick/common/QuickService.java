package top.guyimaple.quick.common;

import top.guyimaple.quick.common.entry.Project;
import top.guyimaple.quick.common.enums.QuickServiceType;

/**
 * 服务入口
 * @author guyi
 * @date 2024/9/4
 */
public interface QuickService {

 /**
  * 类型
  * @return 类型
  */
 QuickServiceType type();

 /**
  * 处理入口
  * @param project 项目实体
  */
 void main(Project project);

}
