package JavaKnowledge.Date.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.time.LocalDate;
import java.time.MonthDay;

/**
 * @author Liweiwei
 * @Date 2025/1/4 21:18
 * @Description :
 */
public class Test01 {

    /**
     * 给出员工的出生日期，计算当前具体员工的生日还有多少天
     * 提示：用到了LocaDate中的方法
     */

    @Test
    public void test01() {
        String birthDay = "1999-01-04";
        if (StringUtils.isEmpty(birthDay)) {
            return;
        }
        String[] split = birthDay.split("-");
        if (split.length != 3) {
            return;
        }
        LocalDate localDate = LocalDate.of(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        LocalDate now = LocalDate.now();
        MonthDay monthDay = MonthDay.of(localDate.getMonthValue(), localDate.getDayOfMonth());
        MonthDay nowDate = MonthDay.from(now);
        if (nowDate.equals(monthDay)) {
            System.out.println("今天日期是：" + nowDate + "，是你生日诶！！");
        }
        //再获取现在的时间，如果时间相同，那么就是它的生日

    }

    /**
     * 给出n个人的出生日期，请计算这些人的生日还有多少天
     * 提示：应该使用到Duration中的between方法
     */
    @Test
    public void test02() {


    }


}
