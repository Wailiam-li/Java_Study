package JavaKnowledge.Reflection.entity;

public class Student extends Person {
    public Student() {
        this.name = "学生";
    }

    public String getName() {
        System.out.println("?");
        return this.name;
    }

}
