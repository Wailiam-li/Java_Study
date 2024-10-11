package JavaKnowledge.Abstract;

/**
 * @author Liweiwei
 * @Date 2024/10/11 20:51
 * @Description :
 */
public abstract class Person {

    //属性,不适用访问符关键字修饰默认为default
    int age;

    String name;

    float height;

    float weight;

    abstract void eat();

    abstract void sleep();

}
