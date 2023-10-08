package JavaKnowledge.Collection.List.Generics;

import java.util.Arrays;

/**
 * @Date:2023/9/17 17:23
 * <p>
 * 演示 类似定义集合ArrayList中的常用方法
 */
public class MyArrayList<E> {


    //成员变量
    private Object[] objects = new Object[10];
    private int size;


    //集合的添加(add)方法
    public boolean add(E e) {   //这里为什么用public？
        objects[size] = e;
        size++; //!
        return true;
    }

    //集合的获取元素（get）方法   注：下面的E不用<>包起来 是因为E 在开始的类中 已定义
    public E get(int index) {
        return (E) objects[index];
    }


    @Override
    public String toString() {
        return Arrays.toString(objects);
    }
}
