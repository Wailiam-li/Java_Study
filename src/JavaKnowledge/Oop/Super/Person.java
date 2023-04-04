package JavaKnowledge.Oop.Super;

public class Person {

    private String name;
    private int age;

    public Person() {
        System.out.println("调用了父类的无参构造方法！");
    }

    public Person(String name, int age) {
        //有参构造方法都没有写对！！！
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
