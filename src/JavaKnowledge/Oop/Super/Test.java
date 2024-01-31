package JavaKnowledge.Oop.Super;

/*
    面想对象的一些知识：
               1.关于关键字super的使用
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);


        //想要初始化成员变量，就必须在Student类中利用super关键字调用父类的构造方法
        Student s2 = new Student("李威", 22);
        System.out.println(s2);


        Student s3 = new Student("李威", 22,20181898);
        System.out.println(s3);

    }

}
