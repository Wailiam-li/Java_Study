package JavaKnowledge.Collection.Map.Test03_ProvinceAndCity;

import java.util.*;

/*
 *  题目：定义一个Map集合，键表示省份，值表示市，但市会有多个。
 *       示例：江苏省=南京市，扬州市，苏州市，无锡市，常州市
 *            江西省=南昌市，赣州市，吉安市，宜春市，九江市
 *           浙江省=杭州市，嘉兴市，温州市，宁波市，绍兴市
 *       题解：值用到了单列集合，并需要按要求对其进行格式输出
 */
public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        ArrayList<String> cities1 = new ArrayList<>();
        Collections.addAll(cities1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");

        ArrayList<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2, "南昌市", "赣州市", "吉安市", "宜春市", "九江市");

        ArrayList<String> cities3 = new ArrayList<>();
        Collections.addAll(cities3, "杭州市", "嘉兴市", "温州市", "宁波市", "绍兴市");

        hm.put("江苏省", cities1);
        hm.put("江西省", cities2);
        hm.put("浙江省", cities3);
//      System.out.println(hm);

        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            ArrayList<String> cities = entry.getValue();
            String key = entry.getKey();

//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < cities.size(); i++) {  //这里有个问题：最后一个元素末尾也是加上“，”，不是结果想要的...
//                if (i != cities.size() - 1) {    //因此用StringBuilder感觉会比较麻烦
//                    sb.append(cities.get(i)).append("，");
//                } else {
//                    sb.append(cities.get(i));
//                }
//            }
//            System.out.println(key + "=" + sb.toString());

            //以下使用StringJoiner方法遍历出来
            StringJoiner sj = new StringJoiner("，", "", "");
            for (String city : cities) {
                sj.add(city);
            }
            System.out.println(key + "=" + sj);   //   ♠   ♦   ♣   ♥

        }
    }
}
