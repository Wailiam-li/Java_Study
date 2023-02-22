package JavaKnowledge.IO.ObjectStream;

/*
    序列化流：  将对象序列化 写入文件当中
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /*
            序列化流
        */
        Student s = new Student("李威", 23);

        //创建对象
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\13744\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\IO\\ObjectStream\\a.txt"));


        //写入文件中
        objectOutputStream.writeObject(s);

        //关闭资源
        objectOutputStream.close();


    }
}
