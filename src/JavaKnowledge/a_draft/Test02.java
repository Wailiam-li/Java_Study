package JavaKnowledge.a_draft;

import org.junit.Test;

import java.text.SimpleDateFormat;
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
    public void test01() {
        String yyyyMMddhhmmss = DateTimeFormatter.ofPattern("yyyyMMddHHmmss").format(LocalDateTime.now());
        System.out.println(yyyyMMddhhmmss);
    }

    /**
     * 演示遇到闰年  2月29号的问题
     */
    @Test
    public void test02() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = "2021-02-29";
        try {
            System.out.println(sdf.parse(date));
        } catch (Exception e) {
            System.out.println("日期格式不正确");
        }


    }

}
