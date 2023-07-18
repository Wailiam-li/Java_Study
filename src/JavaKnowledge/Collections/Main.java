package JavaKnowledge.Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
 *   演示 集合的工具类：Collections的使用方法：
 *               例：.addAll() 、 .shuffle()方法
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "abc", "bcd", "cde", "def", "efg", "fgh", "ghi");
        System.out.println(list);

        //用shuffle() 打乱集合
        Collections.shuffle(list);
        System.out.println(list);

    }
}
