package JavaKnowledge.DesignPattern.factoryMethod.Demo01_Coffee;

/**
 * @author Liweiwei
 * @Date 2024/10/24 21:10
 * @Description :
 */
public class natieCoffee implements Coffee {

    @Override
    public void addMilk() {
        System.out.println("拿铁加奶");
    }

    @Override
    public void addSugar() {
        System.out.println("拿铁加糖");
    }

    @Override
    public String getName() {
        return "拿铁咖啡来了";
    }
}
