package JavaKnowledge.Stream.test03;

/*
      有一个按照条线分组，分组后形成一个map集合，value是多条数据；  后map集合进行排序，排序是根据value对象中的某个属性；
 */

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Main {

    @Test
    public void test01() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "张三");
        map.put("2", "李四");
        map.put("3", "王五");
        String s = map.get("1");
        System.out.println(s);

    }


}
