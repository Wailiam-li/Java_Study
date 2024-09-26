package JavaKnowledge.Enum;

import java.util.Arrays;

/**
 * 演示枚举类的使用
 */
public class EnumMain {
    public static void main(String[] args) {
        Arrays.asList(Season.values()).forEach(System.out::println);

        System.out.printf(Season.valueOf("AUTUMN").toString());
    }

}
