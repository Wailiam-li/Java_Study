package JavaKnowledge.a_draft.EqualsAndHashCodeTest;

/**
 * ClassName:EqualsAndHashCodeTest
 * Description:
 *
 * @Date:2024/11/1 10:19
 * @Author: 李威威
 */
public class EqualsAndHashCodeTest {

    public static void main(String[] args) {
        BYD bydBlue = new BYD();
        bydBlue.setPrice(150000);
        bydBlue.setColor("蓝色");
        bydBlue.setEndurance(1200);

        BYD bydWhite = new BYD();
        bydWhite.setPrice(150000);
        bydWhite.setColor("白色");
        bydWhite.setEndurance(1200);

        System.out.println(bydBlue.hashCode());
        System.out.println(bydWhite.hashCode());

        System.out.println("两个对象比较结果:" + bydBlue.equals(bydWhite));
        //这里是true，仅仅是因为子类BYD当中只有color在一个属性，所以只要这个值相同hashCode就相同。
    }

}
