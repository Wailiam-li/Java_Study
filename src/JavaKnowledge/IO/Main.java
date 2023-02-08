package JavaKnowledge.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
  IO流
 */
public class Main {
    public static void main(String[] args) throws IOException {
       /*
          字节输出流FileOutputStream
      实现步骤：
        创建对象；
        写出数据；
        释放资源;
        */
        //创建对象；       相当于建立起来了一条通道路径            //这里用了绝对路径
        FileOutputStream fos = new FileOutputStream("C:\\Users\\李威威\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\IO\\a.txt");
        //写出数据；       相当于程序往这条路径上送东西
        fos.write(97);  //这里会转化成对应的的ASSCI码
        //释放资源;       相当于将这条路径关闭      注：如果不关闭，相当于一直在打开这个文件，占用（内存）资源，这样就删除不了
        fos.close();


    }
}
