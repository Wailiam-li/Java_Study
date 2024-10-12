package JavaKnowledge.Abstract;

/**
 * @author Liweiwei
 * @Date 2024/10/11 20:56
 * @Description :
 */
public class Teacher extends Person {


    @Override
    void eat() {
        System.out.println("在教职工食堂吃饭！");
    }

    @Override
    void sleep() {
        System.out.println("在教职工宿舍睡床！");

    }
}
