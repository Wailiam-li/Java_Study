package JavaKnowledge.Collections.Test;

/*
       关于集合的删除
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        Collections.addAll(list, 2, 3, 4, 5);
//        for (int i:list){
//            if (i==3){
//                list.remove(i);   //Exception in thread "main" java.util.ConcurrentModificationException
//            }
//        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)==3){
                list.remove(list.get(i));
            }
        }
        System.out.println(list);
    }


}
