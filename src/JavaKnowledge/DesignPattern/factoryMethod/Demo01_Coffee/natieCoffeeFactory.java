package JavaKnowledge.DesignPattern.factoryMethod.Demo01_Coffee;

/**
 * @author Liweiwei
 * @Date 2024/10/24 21:15
 * @Description :
 */
public class natieCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new natieCoffee();
    }
}
