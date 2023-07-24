package JavaKnowledge.Date.DemoAndUse;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Draft {


    @Test
    public void test() throws ParseException {
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String date="2023-07-13 18:05:45";
        Date parse = sdf.parse(date);
        System.out.println(parse);
        Date firstDayOfWeek = getFirstDayOfWeek(parse);
        System.out.println(firstDayOfWeek);
    }

    public Date getFirstDayOfWeek(Date day) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        c.setTime(day);
        c.setFirstDayOfWeek(Calendar.FRIDAY);
        int dayWeek = c.get(Calendar.DAY_OF_WEEK);
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


}