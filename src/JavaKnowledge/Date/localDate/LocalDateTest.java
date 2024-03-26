package JavaKnowledge.Date.localDate;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * ClassName:LocalDate
 * Description:        Java8日期类LocalDate、LocalTime、LocalDateTime的演示与方法使用
 *
 * @Date:2024/1/26 10:08
 * @Author: 李威威
 */
public class LocalDateTest {

    @Test
    public void LocalDateTest() {

        //1）创建方法
        LocalDate now = LocalDate.now();                                      // 获取当前日期
        LocalDate now2 = LocalDate.now(ZoneId.of("Asia/Shanghai"));      // 当前日期 (指定时区)
        LocalDate now3 = LocalDate.now(Clock.systemDefaultZone());             // 当前日期 (指定时钟)
        LocalDate localDate = LocalDate.of(2023, 1, 1); // 指定日期 2023-01-01

        //2）获取方法
        int year = now.getYear();                        // 获取年份
        int month = now.getMonthValue();                // 获取月份（1-12）
        Month monthEnum = now.getMonth();                // 获取月份的枚举值
        int dayOfMonth = now.getDayOfMonth();            // 获取月份中的第几天（1-31）
        int dayOfYear = now.getDayOfYear();                // 获取一年中的第几天（1-366）
        System.out.println(dayOfYear);
        DayOfWeek dayOfWeek = now.getDayOfWeek();        // 获取现在是星期几
        int lengthOfYear = now.lengthOfYear();            // 获得当年总天数
        int lengthOfMonth = now.lengthOfMonth();        // 获得当月总天数
        long epochDay = now.toEpochDay();                // 与时间纪元（1970年1月1日）相差的天数
        System.out.println("与时间纪元（1970年1月1日）相差的天数:"+epochDay+"天");

        //3）运算方法
        LocalDate localDate1 = now.plusDays(1);            // 给当前时间加一天
        LocalDate localDate2 = now.plusDays(1);            // 给当前时间加一周
        LocalDate localDate3 = now.plusMonths(1);        // 给当前时间加一月
        LocalDate localDate4 = now.plusYears(1);        // 给当前时间加一年
        LocalDate localDate5 = now.minusDays(1);        // 给当前时间减一天
        LocalDate localDate6 = now.minusWeeks(1);        // 给当前时间减一周
        LocalDate localDate7 = now.minusMonths(1);        // 给当前时间减一月
        LocalDate localDate8 = now.minusYears(1);        // 给当前时间减一年


        //4）修改方法
        LocalDate localDate11 = now.withYear(2020);        // 修改日期对象年份为2020
        LocalDate localDate22 = now.withMonth(1);        // 修改日期对象月份为1
        LocalDate localDate33 = now.withDayOfMonth(1);    // 修改日期对象的日期(一月中的第几天)
        LocalDate localDate44 = now.withDayOfYear(1);    // 修改日期对象的日期(一年中的第几天)
    }

       //5）比较方法
        @Test
        public void test () {
            LocalDate now = LocalDate.now();
            LocalDate localDate = LocalDate.of(2024, 8, 1);

            boolean isBefore = localDate.isBefore(now);        // localDate是否在当天之前
            System.out.println("isBefore:"+isBefore);
            boolean isAfter = localDate.isAfter(now);        // localDate是否在当天之后
            System.out.println("isAfter:"+isAfter);
            boolean isEqual = localDate.isEqual(now);        // localDate是否在当天
            System.out.println("isEqual:"+isEqual);
            boolean isLeapYear = localDate.isLeapYear();    // localDate的年份是否为闰年,判断是否为闰年的方法：是否能被4或100整除，但不被400整除
            System.out.println("isLeapYear:"+isLeapYear);


        }


    @Test   //LocalDate转String；
    public void test02() {
        LocalDate now = LocalDate.now();
        String format = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss"));//注意！！！这里不支持时分秒！！！
        System.out.println(format);
        System.out.println(now.getClass());
        System.out.println(now);

    }


    }
