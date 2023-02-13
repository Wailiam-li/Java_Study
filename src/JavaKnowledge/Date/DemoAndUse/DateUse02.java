package JavaKnowledge.Date.DemoAndUse;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 获取某年某月的最后一天
         关键点：用到了Calendar这个类
 */
public class DateUse02 {

    //方法1
    public static Date getYearLastDayOfMonth(int year, int month)
    {
        int year1 = year;  //年
        int month1 = month; //月
        Calendar cal = Calendar.getInstance();
        // 设置年份
        cal.set(Calendar.YEAR, year1);
        // 设置月份
        cal.set(Calendar.MONTH, month1); //设置当前月的上一个月
        int lastDay = cal.getMinimum(Calendar.DATE); //获取月份中的最小值，即第一天
        cal.set(Calendar.DAY_OF_MONTH, lastDay - 1); //上月的第一天减去1就是当月的最后一天
        return cal.getTime();
    }

    //方法2
    public static Date getYearLastDayOfMonth02(int year, int month) {
        int year1 = year;  //年
        int month1 = month; //月
        Calendar cal = Calendar.getInstance();
        // 设置年份
        cal.set(Calendar.YEAR, year1);
        // 设置月份
        cal.set(Calendar.MONTH, month - 1);//设置当前月的上一个月
        // 获取某月最大天数
        int lastDay = cal.getActualMaximum(Calendar.DATE);
        // 设置日历中月份的最大天数
        cal.set(Calendar.DAY_OF_MONTH, lastDay);

        // 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(cal.getTime()));
        return cal.getTime();
    }

    public static void main(String[] args) {
        for (int i = 1; i < 13; i++) {
            Date yearLastDayOfMonth = getYearLastDayOfMonth(2022, i);
            System.out.println(yearLastDayOfMonth);
        }
    }
}
