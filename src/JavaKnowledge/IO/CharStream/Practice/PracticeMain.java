package JavaKnowledge.IO.CharStream.Practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {
    public static void main(String[] args) throws IOException {

        System.out.println("一次读取一个字符:");

        long startTime =System.currentTimeMillis();
        //创建对象并关联本地文件
        FileReader fr = new FileReader("C:\\Users\\李威威\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\IO\\CharStream\\Practice\\tengwanggexu.txt");

        FileWriter fw =new FileWriter("C:\\Users\\李威威\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\IO\\CharStream\\Practice\\b.txt");
        //读取数据
        int ch;
        while ((ch = (fr.read())) != -1) {
            fw.write(ch);
        }

        //关闭/释放资源
        fw.close();
        fr.close();

        long endTime = System.currentTimeMillis();
        System.out.println("一次读取一个字符耗时（毫秒）："+(endTime-startTime));

    /*
    一次都多个字符
     */
        System.out.println("\n一次读取多个字符:");

        long startTime1 =System.currentTimeMillis();
        //创建对象
        FileReader fileReader=new FileReader("C:\\Users\\李威威\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\IO\\CharStream\\Practice\\tengwanggexu.txt");

        FileWriter fw1 =new FileWriter("C:\\Users\\李威威\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\IO\\CharStream\\Practice\\c.txt");

        //读取文件
        int len;
        char[] ch1=new char[2];
        while ((len=fileReader.read(ch1))!=-1){
            fw1.write(new String(ch1,0,len));   //这个要转成String对象
        }

        //释放资源
        fw1.close();
        fileReader.close();


        long endTime1 = System.currentTimeMillis();
        System.out.println("一次读取多个字符耗时（毫秒）："+(endTime1-startTime1));
    }



}
