package JavaKnowledge.Date.DemoAndUse;

/*
      打印出 一个月后的日期

                思路：利用毫秒值
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UseDemo4 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = new Date();  //不传参，默认日期就是今天
        String date2 = "2023-06-06";
        Date parse = sdf.parse(date2);

        long time1 = parse.getTime();
        long time2 = time1 + 1000 * 60 * 60 * 24 * 31L;
        //31天的时间。 但还是会根据月份的变化，而变得31天后不是标准的一个月后
        Date date1 = new Date(time2);
        System.out.println(date1);

        String format = sdf.format(date1);
        System.out.println(format);

    }


}
