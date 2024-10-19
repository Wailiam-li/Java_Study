package JavaKnowledge.Collection.List;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/*
    演示ArrayList集合 常用的一些方法
 */
public class ArrayListMain {

    /*
        演示利用Arrays.asList() 的初始化List集合
     */
    @Test
    public void init() {
        List<String> list = Arrays.asList("a", "b", "c");
        System.out.println(list);
    }


}
