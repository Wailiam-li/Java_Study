package JavaKnowledge.IO.Demo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    一次读取多个字节的文件
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {

        //用于读取时间计算。   记：系统当前的时间可以用System.currentTimeMillis()方法得出来！！
        long start = System.currentTimeMillis();

        //创建读取对象
        FileInputStream fis = new FileInputStream("C:\\Users\\13744\\Videos\\23.mp4");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\13744\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\IO\\Demo02\\23.mp4");

        //读取文件

        int len;
        byte[] bytes = new byte[1024 * 1024 * 5]; //以字节(B)为单位，每次读取5M大小
        while ((len = fis.read(bytes)) != -1) {  //去读5M大小，同时将数据赋给这5M
            fos.write(bytes, 0, len);
        }

        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println("花费时间(毫秒)：" + (end - start)); // 46毫秒

    }
}
