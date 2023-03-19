package JavaKnowledge.Date.Calender.Test;

 /*
    得到某一个月日的后一个月时间
            关键点： 用Calender类中.add()方法，将月份加1
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
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


}
