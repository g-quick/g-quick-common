package top.guyimaple.quick.common.writer;

import top.guyimaple.quick.common.enums.ProjectType;

import java.io.IOException;

/**
 * @author guyi
 * @date 2024/8/30
 */
public interface ProjectFileWriter {

    void write(ProjectType type, String fileName, byte[] content) throws IOException;

}
