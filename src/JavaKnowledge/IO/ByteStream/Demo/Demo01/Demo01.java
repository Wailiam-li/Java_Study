package JavaKnowledge.IO.ByteStream.Demo.Demo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
       字节输入流与输出流 文件拷贝案例
 */
public class Demo01 {

    public static void main(String[] args) throws IOException {

        //用于读取时间计算
        long start = System.currentTimeMillis();

        //创建读入对象
        FileInputStream fis = new FileInputStream("C:\\Users\\13744\\Videos\\demo01.mp4");
        //写入的位置    注：最后面要写文件的名字，例：23.mp4
        FileOutputStream fos = new FileOutputStream("C:\\Users\\13744\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\IO\\Demo01\\demo.mp4");

        int b;
        //读取文件
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        //关闭资源时：先开的最后关闭
        fos.close();
        fis.read();

        long end = System.currentTimeMillis();
        System.out.println("花费时间(毫秒)：" + (end - start)); // 13587毫秒

    }
}
