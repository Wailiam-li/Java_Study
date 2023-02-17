package JavaKnowledge.IO.CharStream.Practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("一次读取一个字符:");

        long starttime =System.currentTimeMillis();
        //创建对象并关联本地文件
        FileReader fr = new FileReader("C:\\Users\\李威威\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\IO\\CharStream\\Practice\\tengwanggexu.txt");

        FileWriter fw =new FileWriter("C:\\Users\\李威威\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\IO\\CharStream\\Practice\\b.txt");
        //读取数据
        int ch;
        while ((ch = (fr.read())) != -1) {
            fw.write(ch);
        }

        //关闭/释放资源
        fr.close();

        long endTime = System.currentTimeMillis();
        System.out.println("一次读取一个字符耗时（毫秒）："+(endTime-starttime));

    /*
    一次都多个字符
     */
        System.out.println("\n一次读取多个字符:");

        long starttime1 =System.currentTimeMillis();
        //创建对象
        FileReader fileReader=new FileReader("C:\\Users\\李威威\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\IO\\CharStream\\a.txt");

        FileWriter fw1 =new FileWriter("C:\\Users\\李威威\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\IO\\CharStream\\Practice\\b.txt");

        //读取文件
        int len;
        char[] ch1=new char[2];
        while ((len=fileReader.read(ch1))!=-1){
            fw1.write(new String(ch1,0,len));   //这个要转成String对象
        }

        //释放资源
        fileReader.close();
        long endTime1 = System.currentTimeMillis();
        System.out.println("一次读取多个字符耗时（毫秒）："+(endTime1-starttime1));
    }



}
