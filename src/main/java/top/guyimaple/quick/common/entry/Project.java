package top.guyimaple.quick.common.entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import top.guyimaple.quick.common.writer.ProjectFileWriter;

/**
 * 项目实体
 * @author guyi
 * @date 2024/8/30
 */
@Getter
@ToString
@AllArgsConstructor
public class Project {

    /**
     * 项目名称
     */
    private String name;

    /**
     * 前端目录名称
     */
    private String web;

    /**
     * 后端目录名称
     */
    private String service;

    /**
     * 项目文件写出器
     */
    private ProjectFileWriter writer;


}
