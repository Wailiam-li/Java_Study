package JavaKnowledge.Enum;

import java.util.Arrays;

/**
 * 演示枚举类的使用
 */
public class EnumMain {
    public static void main(String[] args) {
//        Arrays.asList(Season.values()).forEach(System.out::println);
//        System.out.println(Season2.valueOf(Season2.AUTUMN));

        //这里自定义了枚举类的valueOfs方法，以code值来获取枚举类对象。 而枚举类自带有的valueOf方法是通过枚举值来其中的code和text的
        System.out.printf(Season2.valueOfs("2").toString());



    }

}
