package JavaKnowledge.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

/*
 *   一些方法的使用练习
 */
public class Main {
    public static void main(String[] args) {
        //知识点：1.数组当中的流使用：Arrays.stram(变量)
        // int[] a={1,2,3,4,5};
        String[] b = {"李威", "李威很帅", "李威真的很帅"};
        Arrays.stream(b).forEach(e -> System.out.println(e));
        System.out.println("-------------------");

        // 2.一堆零散数据中stream（）的使用：Stream.of(诸多数据)+流方法
        Stream.of(3, 2, 1, 0).forEach(e -> System.out.println(e));
        System.out.println("-------------------");

        //3.字符类型 转成 整形类型:使用Integer.parseInt()方法！！
        String a = "123";
        int num = Integer.parseInt(a);
        System.out.println(num);
        System.out.println("-------------------");

        //4.对 分隔开的字符 直接用索引
        String aa = "李威-男-22";
        String aaa = aa.split("-")[1];
        //对字符变量 使用.split()方法后，返回的是一个字符型数组！因此可以直接 接数组的索引下标.
        System.out.println(aaa);
    }
}
