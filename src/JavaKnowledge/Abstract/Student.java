package JavaKnowledge.Abstract;

/**
 * @author Liweiwei
 * @Date 2024/10/11 20:55
 * @Description :
 */
public class Student extends Person {


    @Override
    void eat() {
        System.out.println("吃食堂的饭！");
    }

    @Override
    void sleep() {
        System.out.println("睡宿舍！");
    }
}
