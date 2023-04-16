package JavaKnowledge.Z_Practice;


/*
   输入n值，从1开始，每次到3的淘汰，求最后留下的数是几？
            思路：利用集合的remove方法，将”3“移除
               集合的特性刚好是有序、可重复的

               正解思路：感觉要用到  循环队列还好解；
 */

import java.util.ArrayList;
import java.util.List;

public class NumberOff {
    public static void main(String[] args) {


    }

    public static int lastOne(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int size = list.size();
        while (size != 1) {
            if (list.size() >= 3) {
                for (int i = 0; i < size; i++) {
                    if (list.get(i) % 3 == 0) {
                        list.remove(i);
                    }//这里之后需要把后面的数设置成1，继续从后面开始循环
                }

            } else {

            }
        }
        return 0;
    }
}
