package JavaKnowledge.Map;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapStudy {
    public static void main(String[] args) {


        /**
         * 关于Map集合的三种遍历方式
         */
        //1.通过键找值
        Map<String, String> map = new HashMap<>();

        //添加元素
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("韦小宝", "双儿");

        //获取所有的键，将这些键放入到一个单列集合当中；
        Set<String> keys = map.keySet();  // ctrl+alt+v:自动生成左边，包括类型和变量名
        //获得每一个“键”
        for (String key : keys) {
            //再通过get（）方法 根据“键”获取“值”
            String value = map.get(key);
            System.out.println(key + "<->" + value);
        }
        //lambda表达式遍历
        // List<String> collect = keys.stream().collect(Collectors.toList());   // ??——————————>正解：
        //keys.forEach(map.get(e));  //得到每一个键？

        //2.通过键值对
        Set<Map.Entry<String, String>> entries = map.entrySet(); //注：这里set集合的泛型是 Map.Entry<String, String>
        //Entry<String, String>是一个整体键值对，Map.表示调用方法。
        //将多对键值对遍历出来
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "->" + value);
        }

        //3.通过lambda表示式进行遍历 !!很简便！
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) { //该方法为接口中的唯一方法
                System.out.println(key + "--" + value);
            }
        });
        System.out.println("简化写法------------------->");
        map.forEach((key, value) -> System.out.println(key + "--" + value));
        //注：forEach的底层源码也使用到了增强for，依次得到每一个键和值，再调用accept方法。
    }
}
