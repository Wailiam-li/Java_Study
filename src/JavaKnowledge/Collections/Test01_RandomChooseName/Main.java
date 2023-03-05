package JavaKnowledge.Collections.Test01_RandomChooseName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 *  随机点名
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "李威", "李辉", "李慧大笨蛋", "李四", "李嘉", "李林", "李六");
        //第一种随机：
        Random r = new Random();
        int index = r.nextInt(list.size());
        String name = list.get(index);
        System.out.println(name);
        //第二种随机：
        Collections.shuffle(list);
        String s = list.get(0);
        System.out.println(s);

    }
}
