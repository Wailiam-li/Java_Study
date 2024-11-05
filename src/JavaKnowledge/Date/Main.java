package JavaKnowledge.Date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/*
    知识学习
 */
public class Main {
        /*
          关于SimpleDateFormat中.parse()和.format()方法的使用；
         */
    @Test
    public void test() {
        String date = "2023-06-09";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
        Date d = new Date();
        Date d2 = new Date(2023, 9, 5);
        System.out.println("Date 'd' is before Date 'd2' : " + d.before(d2));

    }


    @Test
    public void test01() throws ParseException {

        String date = "2021-07-31";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(date);

        Date d = new Date();
        long oneYearAgo = parse.getTime();
        long now = d.getTime();
        System.out.println(oneYearAgo);
        System.out.println(now);

        long l = now - oneYearAgo;
        System.out.println(l);

        long l1 = l / (365 * 24 * 60 * 60 * 1000L);

        if (l1 > 1L) {
            System.out.println("时间是：" + l1);
        }

    }

    @Test
    public void test02() {
        //测试&&  和  || 的联合使用
        if (1 == 3 || 1 == 2 && 3 == 3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }


    @Test
    public void test03() {
        //获取某天所在周的上周的第一天（上周五下午四点的日期）
        Date firstDayOfLastWeek = getFirstDayOfLastWeek(new Date());
        System.out.println(firstDayOfLastWeek);
    }

    private Date getFirstDayOfLastWeek(Date day) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        c.setTime(day);
//        c.setFirstDayOfWeek(Calendar.FRIDAY);  //setFirstDayOfWeek的作用是设置
        int dayWeek = c.get(Calendar.DAY_OF_WEEK);//关键点在这里，求出当前是一周中的第几天，再减去这数就一定得到上周最后一天的日期（周六），再减一就得到周五；
        if (dayWeek == 6) {
            int hour = c.get(Calendar.HOUR_OF_DAY);
            if (hour >= 16) {
                dayWeek = -1;
            }
        }
        if (dayWeek == 7) {
            dayWeek = 0;
        }
        c.add(Calendar.DATE, -dayWeek - 1);
        c.set(Calendar.HOUR_OF_DAY, 16);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }


    @Test   //关于setFirstDayOfWeek()的使用
    public void test04() {
        Calendar calndr = Calendar.getInstance();

        // Displaying first day of the week
        int first_day = calndr.getFirstDayOfWeek();
        System.out.println("The Current"
                + " First day of the week: "
                + first_day);

        calndr.setFirstDayOfWeek(Calendar.THURSDAY);

        first_day = calndr.getFirstDayOfWeek();
        System.out.println("The new first"
                + " day of the week: "
                + first_day);
    }

    @Test   //获取当周周一的日期
    public void test05() {
        //第一是用calendar获取获取
        //当周
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        System.out.println(cal.getTime());

        cal.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);
        System.out.println(cal.getTime());


//当月
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        System.out.println(cal.getTime());

        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);
        System.out.println(cal.getTime());

        //当季         
        int startMonth=(cal.get(Calendar.MONTH) / 3)*3;
        cal.set(Calendar.MONTH, startMonth);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        System.out.println("当季："+cal.getTime());

        // 设置结束日期为季度的最后一天
        cal.set(Calendar.MONTH, startMonth + 2);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);
        System.out.println("当季末："+cal.getTime());



    //当年
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        System.out.println("当年："+cal.getTime());

    // 设置结束日期为年度的最后一天
        cal.set(Calendar.MONTH, Calendar.DECEMBER);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);
        System.out.println("当年末："+cal.getTime());

}
}


