package JavaKnowledge.Date.DemoAndUse;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
     得到某个年月到某个年月区间的方法
 */
public class DateUse01 {
    public static List<String> getBetweenYearMonth(String startDate, String endDate) {
//            Integer startY = Integer.valueOf(startDate.split("-")[0]);
//            Integer startM = Integer.valueOf(startDate.split("-")[1]);
//            Integer endY = Integer.valueOf(endDate.split("-")[0]);
//            Integer endM = Integer.valueOf(endDate.split("-")[1]);
        Integer startY = Integer.valueOf(startDate.substring(0, 4));
        Integer startM = Integer.valueOf(startDate.substring(4));
        Integer endY = Integer.valueOf(endDate.substring(0, 4));
        Integer endM = Integer.valueOf(endDate.substring(4));

        //用来格式化
        DecimalFormat decimalFormat = new DecimalFormat("00");
        List<String> list = new ArrayList<>();
        if (startY > endY) {
            // throw new Exception;
        }
        //年相同的时候
        if (startY.equals(endY) && endM - startM >= 0) {
            int count = startM;
            while (endM - count >= 0) {
                list.add(startY + decimalFormat.format(count));
                count++;   //用来上面的循环不再相减
            }
        } else {
            int year = startY;
            int month = startM;
            //年份不同
            while (endY - year > 0) {
                for (int i = month; i <= 12; i++) {
                    list.add(year + decimalFormat.format(i));
                }
                year++;
                month = 1;
                if (year == endY) {
                    for (int i = 1; i <= endM; i++) {
                        list.add(year + decimalFormat.format(i));
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        //  System.out.println(getBetweenYearMonth("202005", "202210"));
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
        String now1 = sdf.format(now);
        System.out.println(getBetweenYearMonth("202005", now1));

    }
}
