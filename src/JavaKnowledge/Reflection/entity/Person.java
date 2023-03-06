package JavaKnowledge.Reflection.entity;

public class Person {
    String name;
    private int age;

    //构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    protected Person(int age) {
        this.age = age;
    }

    private Person(String name) {
        this.name = name;
    }


    //成员方法
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat(String something) throws ClassNotFoundException, NoSuchMethodException {
        System.out.println("在吃" + something);
    }

}
