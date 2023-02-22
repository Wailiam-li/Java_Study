package JavaKnowledge.IO.ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamMain01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
         /*
            反序列化流：   即将序列化的对象读取到程序中
         */

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\13744\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\IO\\ObjectStream\\a.txt"));

        Object o1 = ois.readObject();

//        Student o = (Student) o1;
//
//        System.out.println(o.toString());

        System.out.println(o1);

        ois.close();
    }


}
