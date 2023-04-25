package JavaKnowledge.Date.DemoAndUse;

/*
    假如想输入一个日期，输出这个日期所在这一周的周一日期；
 */

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UseDemo05 {
    public static void main(String[] args) throws ParseException {
       getMonday();
    }

   public static void getMonday(){
       System.out.println("请输入日期：,格式为：年-月-日，例：2023-04-30");
       Scanner sc = new Scanner(System.in);
       String date = sc.nextLine();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

       try {
           Date date1 = sdf.parse(date);
           Calendar c = Calendar.getInstance();
           c.setTime(date1);
           // 如果是周日    这一步我不懂？？？？   就是按照中国的日历来说，如果它在周日在Calendar中属于下一周的，但在中国
           //它是属于这一周的，因此减1，让他退回这周中；使得它属于这一周中的第7天！
           if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
               c.add(Calendar.DAY_OF_YEAR, -1);  //
           }
               //7-1=6
          int i = c.get(Calendar.DAY_OF_WEEK)-1;  //获取这一天是一周中的第几天: 周日表示第0天，周一表示第1天！

           //思路1：针对这天是一周中第几天，用日期再减去这个天数，即可得到周一的日期
           c.add(Calendar.DATE ,1- i ) ;  //减去对应第几天，取第一天，即周一

           System.out.println(date + "这天所在周的周一是：" +sdf.format(c.getTime()));
       }catch (ParseException e) {
           System.out.println("日期格式不正确，请从新输入！");
           getMonday();
       }
   }
   /*注：1.以上存在用例测试错误的情况：用2023-04-30返回的是2023-04-31，而四月没有30号，因此存在错误
        2. 对Calender对象可以利用.getTime()方法直接获取到Date对象，期间取指定的日期，可以利用.add()方法进行日期上的加减！

   */
}
