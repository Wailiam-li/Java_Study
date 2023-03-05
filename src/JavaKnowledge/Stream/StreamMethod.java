package JavaKnowledge.Stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 *   流中的主要使用方法     注:由于使用到org.junit,所以要导入相应的
 */
public class StreamMethod {

//    public static void main(String[] args) {
//    }     不太懂为什么加了Test之后就不用主函数了？？

    /*
     * filter功能：添加一定的条件，过滤掉部分元素
     */
    @Test
    public void filter() {
        List<String> list = Arrays.asList("abc", "ab", "a", "efg", "bcd");
        List<String> filter = list.stream().filter(str -> str.contains("a")).collect(Collectors.toList());
        System.out.println(filter);
        System.out.println("-------------------");
    }

    /*
     * distinct功能：去重集合中的元素
     */
    @Test
    public void distinct() {
        List<String> list = Arrays.asList("abc", "abc", "abc", "efg", "abcd");
        List<String> distinct = list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);
        System.out.println("-------------------");
    }

    /*
     * limit功能：返回前n个元素
     */
    @Test
    public void limit() {
        List<String> list = Arrays.asList("abc", "ab", "a", "efg", "abcd");
        List<String> limit = list.stream().limit(1).collect(Collectors.toList());
        System.out.println(limit);  //这里为啥没有运行结果？  要在主函数里？
        System.out.println("-------------------");
        //——>添加了Test注解后，可以运行了
    }

    /*
     * skip功能：跳过前n个元素,返回前n的元素
     */
    @Test
    public void skip() {
        List<String> list = Arrays.asList("abc", "ab", "a", "efg", "abcd");
        List<String> skip = list.stream().skip(3).collect(Collectors.toList());
        System.out.println(skip);  //这里为啥没有运行结果？  要在主函数里？
        System.out.println("-------------------");
    }

    /*
     * map功能：对流中所有元素做统一处理---> 一般用于 1.转换流中的数据类型
     */
    @Test  // 所有元素加前缀为例：
    public void mapConcat() {
        List<String> list = Arrays.asList("abc", "ab", "a", "efg", "abcd");
        List<String> map = list.stream().map(str -> str.concat("_liwei")).collect(Collectors.toList());
        System.out.println(map);              //这里的.concat为用于拼接的意思
        System.out.println("-------------------");
    }

    @Test
    public void mapTostring() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 9, 7);
        //或用：str -> String.valueOf(str)
        List<String> map = list.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.println(map);         //这里就已经将集合中的每个整型转换成了字符串类型了，再以集合的方式返回
        System.out.println("-------------------");
    }


    /*
     * sorted功能：对流中所有元素做排序处理，默认是对字母字符串是字典排序、对数字是升序排序；
     */
    @Test
    public void sorted() {
        List<Integer> list = Arrays.asList(2, 1, 4, 3, 5, 6, 9, 7);
        //或用：str -> String.valueOf(str)
        List<Integer> map = list.stream().sorted().collect(Collectors.toList());
        System.out.println(map);
    }

    /*
     * concat功能：合并a和b两个流为一个流
     */
    @Test
    public void concat() {
        List<Integer> list1 = Arrays.asList(2, 1, 4, 3, 5, 6, 9, 7);
        List<String> list2 = Arrays.asList("666", "777", "888");
        //将两个流合并                  再输出
        Stream.concat(list1.stream(), list2.stream())
                .forEach(s -> System.out.println(s));
    }

    //以下是终止操作符!!!!!!!!!!!!

    /*
     * forEach功能：循环遍历
     */
    @Test
    public void forEach() {
        List<String> list = Arrays.asList("abc", "ad", "adc", "ace", "ae", "ae", "io");
        list.stream().forEach(i -> System.out.println(i));   //真的很方便！！连变量都不用写了。
    }

    /*
     * collect功能：收集。  将流转换成其他的形式：list,set,map
     * set集合特性：无序、去重。
     */
    @Test
    public void toMap() {
        List<String> list = Arrays.asList("abc", "ad", "adc", "ace", "ae", "ae", "io");
        Map<String, String> collect = list.stream().collect(Collectors.toMap((v -> "prod_" + v), v -> v, (oldvaule, newvalue) -> newvalue));
        System.out.println(collect);                                                                    //这里表示如果键和值有重复将会采用新的值

    }


}