package JavaKnowledge.Collection.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author Liweiwei
 * @Date 2024/10/19 10:42
 * @Description :
 */
public class Test {

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


}
