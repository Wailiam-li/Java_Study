package JavaKnowledge.Reflection.entity;

public class Student extends Person {

    private String name;
    private int age;

    public Student() {

    }

    public Student(int age, String name) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

}
