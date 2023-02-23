package JavaKnowledge.Commons_io;

/*
    Commons-io一些方法的使用演示
 */


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
      Fileutils类
            static void copyFile( File srcFile，File destFile)    复制文件
            static void copyDirectory(File srcRir, File destDir)    复制文件夹
            static void copyDirectoryToDirectory(File srcDir，File destDir)  复制文件夹
            static void deleteDirectory(File directory)      删除文件夹
            static void cleanDirectory(File directory)    清空文件夹
                                             注：删除和清空的区别：删除是将目标文件夹及里面的内容一块删，清空是将文件夹里面的文件全部删除，不删除文件夹本身
            static string readFileToString(File file，charset encoding)  读取文件中的数据变成成字符串
            static void write(File file，charSequence data，string encoding)  写出数据

    IOutils类
            public static int copy(Inputstream input，outputStream output)  复制文件
            public static int copyLarge( Reader input，writer output)    复制大文件
            public static string readLines(Reader input)    读取数据
            public static void write(string data，outputstream output)   写出数据
                                                                                   */
        /*
           1.  .copyFile()的使用
        */
        File srcFile = new File("src/JavaKnowledge/Commons_io/a.txt");
        File desFile = new File("src/JavaKnowledge/Commons_io/copy.txt");

        FileUtils.copyFile(srcFile, desFile);
    }
}
