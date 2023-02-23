package JavaKnowledge.IO.ObjectStream;

import java.io.Serializable;

/*
   知识： 1.Serializable是序列化接口，里面没有抽象方法，这种接口我们称为“标记接口”；
         实现这个接口相当于给该类的对象打上了一个标记，意为：可序列化
          注：1.若不序列化，则无法写入本地文件中；  2.读回文件的正确内容 只需要反序列化。

          2.如不想将某个属性序列化，可以在成员变量前面加上“transient”关键字。 transient：瞬态关键字
            作用：不会把当前属性序列化到本地文件中。

          3.注：序列号一般在写完标准JavaBean类后在生成，因为序列号是由成员变量、成员方法等一些东西生成的，
               没有标准JavaBean生成就不合理。
 */

public class Student implements Serializable {

    private static final long serialVersionUID = 6115832161017809556L;
    //!!注：要有“static、final”这两个关键字，static表示全局共享，final表示永远不变

    private String name;
    private int age;
   private transient String address;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public Student() {
    }

//    @Override
//    public String toString() {
//        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
//    }

//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }


    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
