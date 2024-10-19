package JavaKnowledge.Collection.GenericsType.demo;

import java.util.ArrayList;

/**
 * @author Liweiwei
 * @Date 2024/10/19 17:19
 * @Description :来演示一下 使用泛型方法
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        ListUtils.addAll(list, 1, 2, 3, 4);
        System.out.println(list);
    }
}
