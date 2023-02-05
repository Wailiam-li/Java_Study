package JavaKnowledge.File;

import java.io.File;

/*
  知识记录
 */
public class Main {
    public static void main(String[] args) {
        /*
           常见成员方法：
           1.获取并遍历:  .listFiles()
         */
        File file = new File("C:\\Users\\13744\\dist");  //注：java中由于:\表示转义字符，故盘符路径一般用双反斜杠
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }


    }
}
