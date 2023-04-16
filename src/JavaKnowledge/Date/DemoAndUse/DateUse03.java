package JavaKnowledge.Date.DemoAndUse;

/*
    计算某月某日到某月某日的天数

         思路：将两个日期换成对应的毫秒值，再相减得出的值再除以一天的时间
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUse03 {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        //当前的时间，得到毫秒值
        calendar.setTime(new Date());
        long time1 = calendar.getTimeInMillis();
        //这里需要把那个人的生日移过来，即将他的出生年 改成 当前年
        String sdate01 = "1999-10-12";
        StringBuilder stringBuilder = new StringBuilder();
        String date01 = stringBuilder.append(sdf.format(new Date()).substring(0, 4)).append(sdate01.substring(4, 10)).toString();

        Date d2 = sdf.parse(date01);
        calendar.setTime(d2);
        long time2 = calendar.getTimeInMillis();
        //需要加上判断，如果是time1 - time2>0表示生日在当今以后，如果小于0，则不计算，表示已过
        if (time2 - time1 > 0) {
            long subDay = (time2 - time1) / (1000 * 60 * 60 * 24);
            System.out.println(subDay);
        }
    }


}
