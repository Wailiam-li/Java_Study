package JavaKnowledge.DesignPattern.factoryMethod.Demo01_Coffee;

import java.util.Scanner;

/**
 * @author Liweiwei
 * @Date 2024/10/24 21:04
 * @Description : 演示 工厂方法模式.   创建工厂方法模式需要了解其中都有哪些角色：抽象工厂、具体工厂、抽象产品、具体产品。
 * 对应的将相关的东西带入角色就很简单。工厂一般都是用接口表示的。
 * <p>
 * ps：自己当时没有写出来的点是：不知道咖啡有哪些属性和方法...
 */
public class CoffeeMain {

    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入你要点的咖啡种类：（1.美式咖啡    2.拿铁咖啡）");
            Scanner sc = new Scanner(System.in);
            int type = sc.nextInt();
//        CoffeeFactory factory = new ?;//这里就看你需要什么，就直接new。或者根据下列选项直接选

            CoffeeFactory factory = null;
            if (type == 1) {
                factory = new meishiCoffeeFactory();
            } else if (type == 2) {
                factory = new natieCoffeeFactory();
            } else {
                System.out.println("没有这款咖啡，请重新选择~");
                continue;
            }
            Coffee coffee = factory.createCoffee();
            System.out.println(coffee.getName());
            coffee.addMilk();
            coffee.addSugar();

        }
    }

}
