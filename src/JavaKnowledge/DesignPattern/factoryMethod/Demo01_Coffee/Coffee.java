package JavaKnowledge.DesignPattern.factoryMethod.Demo01_Coffee;

/**
 * @author Liweiwei
 * @Date 2024/10/24 21:06
 * @Description :
 */
public interface Coffee {

    //这里因该是要写具体的方法！ 因为它并不是一个实体类！！
    String getName();


    void addSugar();

    void addMilk();


}
