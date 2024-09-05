package top.guyimaple.quick.common.entry;

import lombok.AllArgsConstructor;
import lombok.Getter;
import top.guyimaple.quick.common.current.CurrentContext;
import top.guyimaple.quick.common.writer.ProjectFileWriter;

/**
 * 项目实体
 * @author guyi
 * @date 2024/8/30
 */
@Getter
@AllArgsConstructor
public class Project {

    /**
     * 项目名称
     */
    private final String name;
    /**
     * 根路径
     */
    private final String base;
    /**
     * 前端目录名称
     */
    private final String web;
    /**
     * 后端目录名称
     */
    private final String service;
    /**
     * 项目文件写出器
     */
    private final ProjectFileWriter writer;

    /**
     * 上下文
     */
    private final CurrentContext context;

}
