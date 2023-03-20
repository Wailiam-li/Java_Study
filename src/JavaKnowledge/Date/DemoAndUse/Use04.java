package JavaKnowledge.Date.DemoAndUse;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
    忘了这个是干嘛用的？——————>一个月内的采购项目
 */

public class Use04 {

    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(calendar.add(Calendar.MONTH),+1);
        Date today=new Date();
//        String beginDate =sdf.format(today);
        String beginDate ="2023-11-17";
        System.out.println(beginDate);
        calendar.setTime(today) ;
        int i = calendar.get(Calendar.MONTH) + 2;
       StringBuilder sb=new StringBuilder();
        String endDate="";
       if (i>9) {
            endDate = sb.append(beginDate.substring(0, 4)).append("-").append(i).append("-").append(beginDate.substring(8, 10)).toString();
       }else{
            endDate = sb.append(beginDate.substring(0, 4)).append("-").append("0").append(i).append("-").append(beginDate.substring(8, 10)).toString();

       }

        // String endDate=sdf.format(oneMothAfter);
//        System.out.println(endDate);
        System.out.println(endDate);

    }

}
