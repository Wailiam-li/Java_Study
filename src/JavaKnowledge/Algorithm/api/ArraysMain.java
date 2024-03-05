package JavaKnowledge.Algorithm.api;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Date:2024/3/5 21:05
 * <p>
 * Description：  常见的算法API： Arrays工具类
 * Arrays中包含有的常用方法，可以用于数组的创建、查找、排序、比较、复制等操作，以下例举出常用的api，放便后续使用。不常用的可后续自查。
 */
public class ArraysMain {

    @Test  //.toString()方法，可直接将一个数组以字符串的形式打印，从不用逐个遍历打印。
    public void use() {
        int[] arr = {3, 1, 2, 5, 4};
        System.out.println(Arrays.toString(arr));  //注：若Arrays和类名重复，需引用前缀java.util.Arrays....

    }


    @Test  //.asList()方法，直接生成一个集合
    public void use2() {
        List<String> list = Arrays.asList("a", "b", "c", "d"); //注：这里和集合一样，里面的元素类型应该一致
        System.out.println(list);

    }


    @Test  //.binarySearch()方法，底层对一个数组进行二分查找 查找元素所在位置。
    public void use3() {
        int[] arr = {3, 1, 2, 5, 4};
        System.out.println(Arrays.binarySearch(arr, 5)); //注：返回的是索引下标，底层利用的是二分查找法

    }


    @Test  //.sort()方法，默认按升序来对一组数组进行排序，底层利用的是快排
    public void use4() {
        int[] arr = {3, 1, 2, 5, 4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //注：返回的是索引下标，底层利用的是二分查找法

    }

    @Test  //.sort(数组，排序规则)方法，传两个参数，底层利用的是二分查找+插入排序； 记住 ：o1-o2是升序；o2-o1是降序即可
    public void use5() {
        Integer[] arr = {3, 1, 2, 5, 4};  //注意：这里Comparator<>()必须传包装类型
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr)); //注：返回的是索引下标，底层利用的是二分查找法

    }

}
