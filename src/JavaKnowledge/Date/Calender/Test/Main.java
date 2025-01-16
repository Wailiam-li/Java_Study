package JavaKnowledge.Date.Calender.Test;

 /*
    得到某一个月日的后一个月时间
            关键点： 用Calender类中.add()方法，将月份加1
*/

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = new Date();
//        String date1 = sdf.format(date);

        String date1 = "2023-07-09";
        Date date = sdf.parse(date1);
        System.out.println("当前时间是：" + date1);


        c.setTime(date);  //注：这里一定要先给calender的实例对象 赋值
        c.add(Calendar.MONTH, 1);
        int month = c.get(Calendar.MONTH) + 1;
        int month2 = c.get(Calendar.MONTH) - 1;
        int year = c.get(Calendar.YEAR);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println("一个月后的时间是：" + year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day));  //美中不足对的地方就是月份若是单位数，前面不会加“0”
        System.out.println("一个月前的时间是：" + year + "-" + String.format("%02d", month2) + "-" + String.format("%02d", day));

    }


    @Test  //取月底最后一天的方法
    public void test() {
        Calendar c = Calendar.getInstance();
        int i = c.get(Calendar.DATE); //这里就是获取一个月中的第几天嘛
        //注：这个Calendar.DATE相当于只是Calendar中的一个field，本身只是作为一个参数c.get()中从得到对应的值
        System.out.println(i);

        System.out.println("getMaximum DATE:" + c.getMaximum(Calendar.DATE));
        System.out.println("getActualMaximum DATE:" + c.getActualMaximum(Calendar.DATE)); //获取当月 日历类型最大

        /*引出：  由于系统中的定时任务需要在一个月中的最后一天执行，但系统中不知道为什么L没有用，所以使28-31每天执行，
         *      并加了这个前置判断，使得只有在每月底最后一天执行；
         *
         */
        if (c.get(Calendar.DATE) == c.getActualMaximum(Calendar.DATE)) {
            //如果日期是当月的最后一天：其中c.getActualMaximum(Calendar.DATE)是获取当月的最后一天，c.get(Calendar.DATE)是获取当天
            System.out.println("这是当月的最后一天！！");
        } else {
            System.out.println("不是当月的最后一天hh");
        }
    }

    @Test
    public void test2() {
        String date = "";
        Date date1 = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date1 = sdf.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date1);
        if (c.getFirstDayOfWeek() == 2) {

        }
    }


    @Test
    public void test03() {
        // 示例日期字符串
        String dateStr = "2025-01-01";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateStr, formatter);

        // 判断是否是周一
        boolean isMonday = isMonday(date);
        System.out.println("Is the date a Monday? " + isMonday);

        // 获取所在周的周一日期
        LocalDate mondayOfWeek = getMondayOfWeek(date);
        System.out.println("Monday of the week: " + mondayOfWeek);
    }

    /**
     * 判断给定日期是否是周一
     *
     * @param date 给定的日期
     * @return 如果是周一返回true，否则返回false
     */
    public static boolean isMonday(LocalDate date) {
        return date.getDayOfWeek() == DayOfWeek.MONDAY;
    }

    /**
     * 获取给定日期所在周的周一日期
     *
     * @param date 给定的日期
     * @return 所在周的周一日期
     */
    public static LocalDate getMondayOfWeek(LocalDate date) {
        return date.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
    }


}
