package JavaKnowledge.Stream.Test01;

import java.util.Arrays;
import java.util.List;

/*
 *  题目：按要求输出对应的名字
 */
public class Test01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("张无忌", "张三丰", "张天", "张傻", "张二狗", "李慧蠢女人你真是傻狗");

        //题目1：将姓”张“且长度为3的元素存储到集合中并打印
        list.stream()
                .filter(e -> e.startsWith("张"))
                .filter(e -> e.length() == 3)
                .forEach(e -> System.out.println(e));
        //注：filter内部方法返回的是一个boolean类型：返回true，表示当前数据留下；返回false，表示当前数据舍弃不要。
        System.out.println("----------------------");

        //题目2：输出集合中的“张天","张傻” 这两个名字
        //思路1：先获取前面所有的包含这两个名字的长度，再用skip（）前面多余的；
        //思路2：先跳过前面不包含这几个名字的长度，再用limit将名字打出来；本题中采用思路2
        list.stream().skip(2).limit(2).forEach(e -> System.out.println(e));

    }
}
