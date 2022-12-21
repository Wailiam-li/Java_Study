package JavaKnowledge.Static.Practice2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //集合直接初始化值的函数！！！    ——————>List<String> list = Arrays.asList()
        List<Student> student1 = new ArrayList<>();

        //student1.add('lili', 21, "女");
        student1.add(new Student("Lili", 18, "女"));

        //往集合中添加对象的操作？？————————>
//        ArrayList<Student> student2 = new ArrayList<>("")
//        ArrayList<Student> student2 = new ArrayList<>();
//        ArrayList<Student> student3 = new ArrayList<>();
//        student2.add(new Student("weiwei", 22, "男"));
//        student3.add(new Student("huihui", 22, "女"));

        //注意！！一个集合可以包含多个对象，因此：定义一个集合即可！！
        student1.add(new Student("weiwei", 23, "男"));
        student1.add(new Student("huihui", 22, "女"));

        int maxAge = StudentMaxAge.StudentMaxAge(student1);
        System.out.println("三位同学中最大年龄为：" + maxAge);
    }
}
