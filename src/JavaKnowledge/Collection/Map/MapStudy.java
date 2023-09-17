package JavaKnowledge.Collection.Map;


import org.junit.Test;

import java.util.*;
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


    @Test  //map集合根据key或value排序
    public void mapSort() {
        Map<String, String> map = new TreeMap<String, String>();

        map.put("KFC", "kfc");
        map.put("WNBA", "wnba");
        map.put("NBA", "nba");
        map.put("CBA", "cba");

        Map<String, String> resultMap = sortMapByKey(map);    //按Key进行排序

        for (Map.Entry<String, String> entry : resultMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static Map<String, String> sortMapByKey(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return map;
    }

//    @Test

    /**
     * 使用 Map按value进行排序
     *
     * @param map
     * @return
     */
//    public  Map<String, String> sortMapByValue(Map<String, String> oriMap) {
//        if (oriMap == null || oriMap.isEmpty()) {
//            return null;
//        }
//        Map<String, String> sortedMap = new LinkedHashMap<>();
//        List<Map.Entry<String, String>> entryList = new ArrayList<>(oriMap.entrySet());
//
////        Collections.sort(entryList, new MapValueComparator());
//
//        Iterator<Map.Entry<String, String>> iter = entryList.iterator();
//
//        Map.Entry<String, String> tmpEntry = null;
//        while (iter.hasNext()) {
//            tmpEntry = iter.next();
//            sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());
//        }
//        return sortedMap;
//    }
    @Test
    public void main1() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("赵四", 23);
        map.put("刘能", 21);
        map.put("广坤", 25);
        map.put("老七", 18);
        System.out.println(map);
        Map<String, Integer> sortMap = sortMap(map);
        System.out.println(sortMap);
    }


    public Map<String, Integer> sortMap(Map<String, Integer> map) {
        //利用Map的entrySet方法，转化为list进行排序
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        //利用Collections的sort方法对list排序
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                //正序排列，倒序反过来
                return o2.getValue() - o1.getValue();
            }
        });

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("赵四", 3);
        map2.put("刘能", 2);
        map2.put("广坤", 4);
        map2.put("老七", 1);


        //遍历排序好的list，一定要放进LinkedHashMap，因为只有LinkedHashMap是根据插入顺序进行存储
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> e : entryList) {
            linkedHashMap.put(e.getKey(), map2.get(e.getKey()));
        }
        return linkedHashMap;
    }

}