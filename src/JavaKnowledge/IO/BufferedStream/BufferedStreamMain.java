package JavaKnowledge.IO.BufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
     缓冲流
         可分为字节缓冲流 和 字符缓冲流
 */
public class BufferedStreamMain {
    public static void main(String[] args) throws IOException {

        /*
             字符缓冲流输入流：
                   特有的方法：  public string readLine() 读一整行

         */
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\13744\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\IO\\BufferedStream\\tengwanggexu.txt"));
        //问：这里为什么是new 一个FileReader呢？
        //————>BufferedReader是FileReader的包装类，里面的参数Reader类是一个抽象类，需要放继承了Reader抽象类的基本流FileReader
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();

        //注：读取时间多次运行有差别的原因：每次内存运行的程序可能还有其他的，因此处理的速度有些差异，每次运行的时间差
        //    会不太一样
    }
}
