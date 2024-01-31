package JavaKnowledge.a_draft;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * ClassName:Test02
 * Description:
 *
 * @Date:2023/11/7 17:06
 * @Author: 李威威
 */
public class Test02 {

    /**
     * 演示获取时间的转换（DateTimeFormatter的相关使用）      要记住！！
     */
    @Test
    public void test01() {
        String yyyyMMddhhmmss = DateTimeFormatter.ofPattern("yyyyMMdd").format(LocalDateTime.now());
        SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd");
        Date parse=null;
        try {
             parse = sdf.parse(yyyyMMddhhmmss);
        }catch (Exception e){
        }
        System.out.println(parse);
    }

    @Test
    public void test02() {
        int res=1;
        res&=0;
        System.out.println(res);

    }

    @Test
    public void test03() {
     //传一个date类型的日期，与当前时间进行比较；
        Date date=new Date(1700409600L);
        if (date.before(new Date())) {
            System.out.println("res");
        }
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

    @Test
    public void test04() {
        LocalDate localDate = LocalDate.now().minusMonths(1L);
        int year = localDate.getYear();
        Month month = localDate.getMonth();
        String mm = localDate.format(DateTimeFormatter.ofPattern("MM")); //这里居然还能根据 月的格式 单独 取月！！

    }

    @Test   //测试contains()方法
    public void test05() {
       String a="aaaaa";
       if (a.contains("b")){
           System.out.println("666666");
       }


    }

}
