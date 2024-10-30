package JavaKnowledge.Collection.Map;

import JavaKnowledge.a_draft.Per;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Liweiwei
 * @Date 2024/10/19 10:42
 * @Description :
 */
public class Test {

    /**
     * 测试hashmap与hashtable的差异
     */
    @org.junit.Test
    public void test() {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, null);
        map.put("2", "2");
        System.out.println(map);
    }


    @org.junit.Test
    public void test1() {
        Map<String, String> map = new Hashtable<>();
        map.put("1", "1");
        map.put(null, null);
    }

    /**
     * 测试hashmap的键值重复会怎么样
     */
    @org.junit.Test
    public void test02() {
        HashMap<String, String> map = new HashMap<>();
        map.put("2", "1");
        map.put("2", "2");   //这里重复添加键是会被覆盖的；    如果是利用数据库查询出来的数据直接形成map集合，需要使用那个重复替换的东西，否则貌似会报错。
        System.out.println(map);
    }

    /**
     * map报重复键的情况
     */
    @org.junit.Test
    public void test03() {
        List<Per> list = new ArrayList<>();
        list.add(new Per("lili", 1));
        list.add(new Per("liwei", 1));
        list.add(new Per("lili", 2));//
        Map<String, Integer> collect = list.stream().collect(Collectors.toMap(Per::getName, Per::getAge, (e1, e2) -> e2));
        //如果是利用数据库查询出来的数据直接形成map集合，需要使用那个重复替换的东西，否则若存在重复的键会报错:Duplicate key 1。
        //————>正确是：Collectors.toMap(Per::getName, Per::getAge,(e1,e2)->e1))
        System.out.println(collect);
    }
}
