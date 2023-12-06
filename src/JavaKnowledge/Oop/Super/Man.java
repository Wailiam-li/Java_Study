package JavaKnowledge.Oop.Super;

public class Man {

    private String name;
    private Integer age;

    public Man() {
        System.out.println("默认调用父类的无参构造方法！");
    }

    public Man(String name, int age) {
        System.out.println("调用父类的有参构造方法！");
        //有参构造方法都没有写对！！！
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Man{" +
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
