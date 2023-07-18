package JavaKnowledge.Lambda;


/*
      演示集合中常用 流 配合 lambda表达式 的使用
 */

import JavaKnowledge.Lambda.entity.Book;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    List<String> fruit = Arrays.asList("apple", "banana", "orange");

/*
      foreach使用
 */
    @Test    //目前使用到比较多的就是循环输出
    public void foreach() {
        fruit.forEach(l -> System.out.println(l));

    }

    /*
         排序中sorted方法使用到的 lambda表达式
     */
    @Test
    public void collectionsSort() {  //注：此排序对数字（int/long/...  BigDecimal）、时间（date）、字母（字典顺序）类型都可以比较
        //正序
        Collections.sort(fruit, ((o1, o2) -> o1.compareTo(o2)));
        System.out.println(fruit);
        //倒序
        Collections.sort(fruit, ((o1, o2) -> o2.compareTo(o1)));
        System.out.println(fruit);

        //BigDecimal类型
        List<BigDecimal> letter = new ArrayList<>();
        letter.add(BigDecimal.ONE);
        letter.add(BigDecimal.ZERO);
        letter.add(BigDecimal.TEN);
        Collections.sort(letter, ((o1, o2) -> o2.compareTo(o1)));
        System.out.println(letter);

        //结合stream流
        List<BigDecimal> decimals = letter.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(decimals);
    }

    /*
      foreach使用演示案例
   */
    @Test
    public void collectorsGroupingBy() {
        Book book1 = new Book("小人书", new BigDecimal("20"), "李三", 100);
        Book book2 = new Book("围城", new BigDecimal("30"), "李三", 200);
        Book book3 = new Book("边城", new BigDecimal("35"), "赵四", 300);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Map<String, List<Book>> collect = books.stream().collect(Collectors.groupingBy(Book::getAuthor));
        collect.entrySet().forEach(s -> System.out.println(s));
    }


}
