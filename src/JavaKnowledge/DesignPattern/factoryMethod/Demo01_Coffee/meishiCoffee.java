package JavaKnowledge.DesignPattern.factoryMethod.Demo01_Coffee;

/**
 * @author Liweiwei
 * @Date 2024/10/24 21:09
 * @Description :
 */
public class meishiCoffee implements Coffee {


    public void addMilk() {
        System.out.println("美式加奶");
    }

    public void addSugar() {
        System.out.println("美式加糖");
    }

    public String getName() {
        return "美式咖啡来了";
    }
}
