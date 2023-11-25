package JavaKnowledge.a_draft;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * ClassName:Draft02
 * Description:
 *
 * @Date:2023/8/16 11:11
 * @Author: 李威威
 */
public class Draft02 {

    @Test
    public void main() {
        String a = UUID.randomUUID().toString();//作用是：可生成除 “-” 外的一个32位的字符串
        System.out.println(a);
        String s = a.replaceAll("-", "");
        System.out.println(s);
    }


    @Test  //计算一个月的天数
    public void test() {
        Calendar c = Calendar.getInstance();
        int i = c.get(Calendar.MONTH);
        System.out.println(i);
        c.add(Calendar.MONTH, -1);
        Date time = c.getTime();
        System.out.println(time);

    }

    @Test
    public void test01() {
        int lengthOfMonth = LocalDate.now().lengthOfMonth();
        int lengthOfYear = LocalDate.now().lengthOfYear();
        System.out.println(lengthOfMonth);
        System.out.println(lengthOfYear);
    }

}
