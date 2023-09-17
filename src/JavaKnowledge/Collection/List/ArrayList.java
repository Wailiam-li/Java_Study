package JavaKnowledge.Collection.List;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/*
    演示ArrayList集合 常用的一些方法
 */
public class ArrayList {

    /*
        演示泛型 为String类型,直接利用Arrays.asList() 的初始化
     */
    @Test
    public void init() {
        List<String> list = Arrays.asList("a", "b", "c");
        System.out.println(list);
    }


}
