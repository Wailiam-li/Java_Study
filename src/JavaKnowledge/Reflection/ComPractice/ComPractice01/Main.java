package JavaKnowledge.Reflection.ComPractice.ComPractice01;

import JavaKnowledge.Reflection.entity.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;

/*
   需求：对于任意一个对象，都可以把对象所有的字段名和值，保存到文件中去


 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {

        Student student=new Student("小猴子",17,"男");

        saveToFile(student);
    }

   public static void  saveToFile(Student student) throws IOException, IllegalAccessException {
       BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\李威威\\IdeaProjects\\Java_Study\\src\\JavaKnowledge\\Reflection\\ComPractice\\ComPractice01\\b.txt"));

       //Class aClass = Class.forName("JavaKnowledge.Reflection.entity.Student");  !!!
       Class aClass = student.getClass();

       Field[] declaredFields = aClass.getDeclaredFields();
       for (Field declaredField : declaredFields) {
           declaredField.setAccessible(true);
           Object o = declaredField.get(student);
           String name = declaredField.getName();
           bw.write(""+o);
           bw.newLine();
       }

       bw.close();   //没有把数据写进去的关键！！！ ——————>未关闭IO流,导致一直在写
   }


}
