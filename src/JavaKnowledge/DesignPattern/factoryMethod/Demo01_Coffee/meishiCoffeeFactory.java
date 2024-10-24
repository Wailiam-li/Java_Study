package JavaKnowledge.DesignPattern.factoryMethod.Demo01_Coffee;

/**
 * @author Liweiwei
 * @Date 2024/10/24 21:12
 * @Description :
 */
public class meishiCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new meishiCoffee();
    }
}
