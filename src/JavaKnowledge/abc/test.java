package JavaKnowledge.abc;

import java.math.BigDecimal;

public class test {
    public static void main(String[] args) {
        /*
         四舍五入保留两位用法
         */
        double one = 5.26519;
        BigDecimal two = new BigDecimal(one);
        double three = two.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(three);
    }

}
