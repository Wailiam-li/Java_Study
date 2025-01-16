package JavaKnowledge.Stream;

import JavaKnowledge.Stream.entity.User;
import JavaKnowledge.a_draft.Per;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 *   演示 Stream流中的主要使用方法               注:由于使用到org.junit,所以要导入相应的
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
        System.out.println(filter);    //这里应该是过滤留下来
        System.out.println("-------------------");
    }

    @Test
    public void filter02() {
        List<String> list = Arrays.asList("abc", "ab", "a", "efg", "bcd","");
        List<String> filter = list.stream().filter(str -> StringUtils.isNotEmpty(str)).collect(Collectors.toList());
        System.out.println(filter);    //这里应该是过滤留下来
        System.out.println("-------------------");
    }



    @Test
    public void filter2() {
        Per p1=new Per("",null);
        Per p2=new Per("q",22);
        Per p3=new Per("w",23);

        List<Per> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        List<String> filter = list.stream().filter(str -> StringUtils.isNotEmpty(str.getName())).map(Per::getName).collect(Collectors.toList());
        System.out.println(filter);    //这里应该是过滤留下来
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
    public void concat() {
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
                 *使用细节：1.如果是针对某个对象中的某项属性排序，需要使用Comparator.comparing(User::getAge)；如果是
                            直接根据该集合的该项属性，直接用.sorted()方法即可；
     */
    @Test
    public void sorted() {
        List<Integer> list = Arrays.asList(2, 1, 4, 3, 5, 6, 9, 7);
        //或用：str -> String.valueOf(str)
        List<Integer> map = list.stream().sorted().collect(Collectors.toList());
        System.out.println(map);
    }

    @Test
    public void sorted01() {
        List<JavaKnowledge.Stream.entity.User> list = new ArrayList<>();
        list.add(new JavaKnowledge.Stream.entity.User("liwei", 23));
        list.add(new JavaKnowledge.Stream.entity.User("lisi", 20));
        list.add(new JavaKnowledge.Stream.entity.User("lihui", 21));
        List<User> collect = list.stream().sorted(Comparator.comparing(User::getAge).reversed()).collect(Collectors.toList());
        System.out.println(collect);
        User user = collect.stream().findFirst().orElse(null);  //就是找的第一个
        User user2 = collect.stream().filter(e->e.getAge().equals(user.getAge()-2)).findFirst().orElse(null);
        System.out.println(user);
        System.out.println(user2);

    }

    /*
     * concat功能：合并a和b两个流为一个流
     */
    @Test
    public void streamConcat() {
        List<Integer> list1 = Arrays.asList(2, 1, 4, 3, 5, 6, 9, 7);
        List<String> list2 = Arrays.asList("666", "777", "888");
        //将两个流合并                  再输出
        Stream.concat(list1.stream(), list2.stream())
                .forEach(s -> System.out.println(s));
    }

    //----------------------------------------------------以下是终止操作符!!!!!!!!!!!!
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
        System.out.println(collect);                                                                    //这里表示如果键和值中的键重复，将会采用新的值还是旧的值

    }


    /*  重点：！！
     *Collectors.groupingBy根据一个或多个属性对集合中的项目进行分组
     */
    @Test
    public void groupBy() throws ParseException {
        List<User> users = Arrays.asList(
                new User("Jack", 9),
                new User("Kreas", 9),
                new User("Marry", 13),
                new User("Timi", 14));

        Map<Integer, List<User>> map = users.stream().collect(Collectors.groupingBy(User::getAge));
        System.out.println(map);
        /*
        结果：
        {9=[User{name='Jack', age=9}, User{name='Kreas', age=9}],
        13=[User{name='Marry', age=13}],
        14=[User{name='Timi', age=14}]}
         */
    }

    /**
     *
     * 如何从集合对象中获取到某个字段为某个值的对象呢？——>get()方法！ 注：这里.findFirst()方法是可以防止重复的情况出现的。
     */
    @Test
    public void get()  {
        List<User> users = Arrays.asList(
                new User("Jack", 9),
                new User("Kreas", 9),
                new User("Marry", 13),
                new User("Timi", 14));

        User user1 = users.stream().filter(user -> user.getAge() == 14).findFirst().get();
        System.out.println(user1);
    }

}



