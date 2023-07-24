package JavaKnowledge.Date.Calender;

/*
    关于Calender类的相关知识及使用
 */
/*
        方法：
          public static calendar getInstance( )   获取当前时间的日历对象
          public final Date getTime( )           获取日期对象
          public final setTime(Date date)     给日历设置日期对象
          public long getTimeInMillis()         拿到时间毫秒值
          public void setTimeInMillis(long millis)   给日历设置时间毫秒值

          public int get(int field)               取日期中的某个字段信息
          public void set(int field ,int value)    修改日历的某个字段信息
          public void add(int field,int amount)   为某个字段增加/减少指定的值



 */

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
       /* 1.获取Calender日历对象，
         细节1；由于Calender是抽象类，不能实例化，是通过.getInstance()静态方法获取其字类方法的对象；

        底层原理：  会根据系统的不同时区来获取不同的日历对象,默认表示当前时间。
           把会把时间中的纪元，年，月，日，时，分，秒，星期，等等的都放到一个数组中
           在返回的数组中对应的索引：  纪元：0  年：1   ....

          细节2：月份：范围0-11，如果获取出来的0，那么实际上是1月（因此在实际上得出的值通常会+1）
                星期：在外国中 周日是一周中的第一天，  1（周日） 2（周一）.....


         */
        Calendar c = Calendar.getInstance();
        System.out.println(c);    //里面包含一大堆东西：时间中的纪元，年，月，日，时，分，秒，星期
        c.setTime(new Date());

        //Java在Calender类中将索引对应的数字都定义成了常量；

    }

}
