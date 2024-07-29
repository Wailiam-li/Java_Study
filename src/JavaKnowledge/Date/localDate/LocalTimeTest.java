package JavaKnowledge.Date.localDate;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * ClassName:LocalTime
 * Description:   演示LocalTime相关
 *
 * @Date:2024/1/26 13:59
 * @Author: 李威威
 */
public class LocalTimeTest {

    @Test
    public void test(){
        LocalTime now1 = LocalTime.now();							// 当前时间
        LocalTime now2 = LocalTime.now(ZoneId.of("Asia/Shanghai"));	// 当前时间 (指定时区)
        LocalTime now3 = LocalTime.now(Clock.systemDefaultZone());	// 当前时间 (指定时钟)
        LocalTime localTime = LocalTime.of(9, 9, 9);				// 指定时间 09:09:09
        System.out.println(now1);
    }


    @Test  //演示 LocalDateTime的创建
    public void test02() {
        // 1.当前日期
        LocalDateTime now1 = LocalDateTime.now();
        // 2.当前日期 (指定时区)
        LocalDateTime now2 = LocalDateTime.now(ZoneId.of("Asia/Shanghai"));
        // 3.当前日期 (指定时钟)
        LocalDateTime now3 = LocalDateTime.now(Clock.systemDefaultZone());
        // 4.指定日期 2023-01-01 01:01:00
        LocalDateTime localDateTime1 = LocalDateTime.of(2023, 1, 1, 1, 1);
        // 4.使用LocalDate和LocalTime对象创建LocalDateTime对象
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(localDate, localTime);
        System.out.println(now1);
//       localDateTime1.

    }


    /**
     * LocalDateTime与Date互相转换
     *
     * 从LocalDateTime转换到Date：‌
     *
     * 使用LocalDateTime.atZone()方法将LocalDateTime与系统默认时区结合，‌形成ZonedDateTime。‌
     * 使用ZonedDateTime.toInstant()方法将ZonedDateTime转换为Instant。‌
     * 使用Date.from()方法将Instant转换为Date。‌
     * 从Date转换到LocalDateTime：‌
     *
     * 使用Date.toInstant()方法将Date转换为Instant。‌
     * 使用Instant.atZone()方法将Instant与一个时区结合，‌形成ZonedDateTime。‌
     * 使用ZonedDateTime.toLocalDateTime()方法将ZonedDateTime转换为LocalDateTime。‌
     */
    @Test
    public void test03() {
        //LocalDateTime转换到Date：‌
        LocalDateTime localDateTime=LocalDateTime.now();
        Date date =Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(date);

    }



}
