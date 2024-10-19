package JavaKnowledge.Collection.GenericsType.demo;

import java.util.List;

/**
 * @author Liweiwei
 * @Date 2024/10/19 17:19
 * @Description :  演示定义泛型方法
 */
public class ListUtils {

    //注：这个<T>既可以与修饰符连在一起写，也可以与修饰符隔一个空格分开写！！！，泛型本身并不是返回的类型只是泛型方法的语法需要，真正的返回类型是void。
    public static <T> void addAll(List<T> list, T... args) {
        for (T arg : args) {
            list.add(arg);
        }


    }

}
