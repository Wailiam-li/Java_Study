package JavaKnowledge.IO.ComPractice.Practice02;

/*
    练习：将序列化的文件中的对象读取出来，但不知道里面对象有多少个

        思路：将对象用集合 装起来，直接将集合写入文件中，反序列化集合，遍历出每个对象
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Practice02Main01 {
    public static void main(String[] args) throws IOException {

        Student s1=new Student("李辉",24);
        Student s2=new Student("李威",23);
        Student s3=new Student("李惠",22);

        ArrayList<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src/JavaKnowledge/IO/ComPractice/Practice02/a.txt"));

        oos.writeObject(list);

        oos.close();
    }
}
