package JavaKnowledge.IO.ObjectStream;

import java.io.Serializable;

/*
   知识： Serializable是序列化接口，里面没有抽象方法，这种接口我们称为“标记接口”；
         实现这个接口相当于给该类的对象打上了一个标记，意为：可序列化

         注：1.若不序列化，则无法写入本地文件中；  2.读回文件的正确内容 只需要反序列化
 */

public class Student implements Serializable {

    private static final long serialVersionUID = 6115832161017809556L;  //!!注：要有“static、final”这两个关键字

    private String name;

    private int age;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
