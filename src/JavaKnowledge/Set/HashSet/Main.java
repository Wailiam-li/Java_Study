package JavaKnowledge.Set.HashSet;


import JavaKnowledge.Map.Test01.Student;

/*
    演示hashCode相关的代码
 */
public class Main {
    public static void main(String[] args) {

        //创建对象
        Student a = new Student("李威", 23);
        Student b = new Student("李威", 23);

        //  2.如果在类中 没有重写hashcode方法，不同对象计算出的哈希值是不同的
        //  如果已经重写hashcode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());


    }


}
