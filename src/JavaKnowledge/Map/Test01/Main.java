package JavaKnowledge.Map.Test01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *   遍历的使用例子  注：HashMap存储自定义类型（即自己定义的类，new出来的对象）键值，必须重写hashCode方法和equals方法，
 *                     以保证key唯一。
 */
public class Main {
    public static void main(String[] args) {
        HashMap<Student, String> m = new HashMap<>();
        Student s1 = new Student("liwei", 21);
        Student s2 = new Student("lihui", 22);
        Student s3 = new Student("lili", 23);

        m.put(s1, "汉");
        m.put(s2, "满");
        m.put(s3, "回");

        //forEach()遍历
        m.forEach((key, value) -> System.out.println(key + "<->" + value));
        System.out.println("-----------------------------");

        //增强for遍历：
        Set<Student> students = m.keySet();
        for (Student s : students) {
            String value = m.get(s); //注：这里是根据Map集合的get（）方法，（）输入键获取值！！
            System.out.println(s + "->" + value);
        }
        System.out.println("-----------------------------");

        //键值对
        Set<Map.Entry<Student, String>> entries = m.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "--" + value);
        }


    }

}
