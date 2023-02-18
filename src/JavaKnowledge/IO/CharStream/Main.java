package JavaKnowledge.IO.CharStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
   字符流
 */
public class Main {
    public static void main(String[] args) throws IOException {

        /*
          一次读一个字符
         */
        System.out.println("一次读取一个字符:");

        //创建对象并关联本地文件
        FileReader fr = new FileReader("C:\\Users\\李威威\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\IO\\CharStream\\a.txt");

        //读取数据
        int ch;
        while ((ch = (fr.read())) != -1) {
            System.out.print((char) ch);
        }

        //关闭/释放资源
        fr.close();


    /*
    一次都多个字符
     */
        System.out.println("\n一次读取多个字符:");

        //创建对象
        FileReader fileReader=new FileReader("C:\\Users\\李威威\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\IO\\CharStream\\a.txt");

       //读取文件
        int len;
        char[] ch1=new char[2];
        while ((len=fileReader.read(ch1))!=-1){
            System.out.print(new String(ch1,0,len));   //这个要转成String对象
        }

      //释放资源
        fileReader.close();
    }
}
