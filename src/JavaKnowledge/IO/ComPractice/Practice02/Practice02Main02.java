package JavaKnowledge.IO.ComPractice.Practice02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//反序列化：读取多个对象
public class Practice02Main02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/JavaKnowledge/IO/ComPractice/Practice02/a.txt"));

        ArrayList<Student> o = (ArrayList<Student>) ois.readObject();

        for (Student student : o) {
            System.out.println(student);
        }

    }
}
