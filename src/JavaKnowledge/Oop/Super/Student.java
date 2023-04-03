package JavaKnowledge.Oop.Super;


//注意：继承只继承父类的 成员变量和成员方法  （详情见QQ邮箱文档）
public class Student extends Person {
    public Student() {
        //这里默认就有个super()方法；且在一定第一行
        super(); //为访问！父类的无参构造方法：有可能使用到父类数据 和 创造数据空间初始化的作用
    }

    public Student(String name, int age) {
        super(name, age);
    }

}
