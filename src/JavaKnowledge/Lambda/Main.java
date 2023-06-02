package JavaKnowledge.Lambda;


/*
      演示集合中常用的lambda表达式
 */

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    @Test
    public void foreach(){
        List<String> fruit= Arrays.asList("apple","banana","orange");
        fruit.forEach(l-> System.out.println(l));

    }

    @Test
    public void collectionsSort(){  //注：此排序对数字（int/long/...  BigDecimal）、时间（date）、字母（字典顺序）类型都可以比较
        //字母顺序
        List<String> fruit= Arrays.asList("apple","banana","orange");
        //正序
        Collections.sort(fruit,((o1, o2) -> o1.compareTo(o2)));
        System.out.println(fruit);
        //倒序
        Collections.sort(fruit,((o1, o2) -> o2.compareTo(o1)));
        System.out.println(fruit);

        //BigDecimal类型
        List<BigDecimal> letter= new ArrayList<>();
        letter.add(BigDecimal.ONE); letter.add(BigDecimal.ZERO); letter.add(BigDecimal.TEN);
        Collections.sort(letter,((o1, o2) -> o2.compareTo(o1)));
        System.out.println(letter);
    }

}
