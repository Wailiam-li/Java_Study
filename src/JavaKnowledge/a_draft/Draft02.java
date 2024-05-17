package JavaKnowledge.a_draft;

import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * ClassName:Draft02
 * Description:     感觉这种黑色主题的屏幕用着感觉眼睛比较舒服的
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

    @Test
    public void test02() {
        BigDecimal d = new BigDecimal("17.9444");
        int i = d.intValue();
        System.out.println(i);
    }

    @Test
    public void test03() {
        System.out.printf("就是黑色主题有些字符和错误的提示不是太明显，没有白色主题提示那么明显");
    }

}
