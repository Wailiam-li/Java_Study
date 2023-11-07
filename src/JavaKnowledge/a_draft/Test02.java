package JavaKnowledge.a_draft;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * ClassName:Test02
 * Description:
 *
 * @Date:2023/11/7 17:06
 * @Author: 李威威
 */
public class Test02 {

    /**
     * 演示获取时间的转换（DateTimeFormatter的相关使用）
     */
    @Test
    public void test01(){
        String yyyyMMddhhmmss = DateTimeFormatter.ofPattern("yyyyMMddHHmmss").format(LocalDateTime.now());
        System.out.println(yyyyMMddhhmmss);
    }



}
