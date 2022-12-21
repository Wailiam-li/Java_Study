package JavaKnowledge.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemp {
    public static void main(String[] args) throws ParseException {


        //1.利用空参构造创建SimpleDateFormat对象，默认格式
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date();
        String str1 = sdf1.format(d1);
        System.out.println(str1);      //

        //2.利用带参构造创建simpleDateFormat对象，指定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String str2 = sdf2.format(d1);
        System.out.println(str2);

        //把”1999-10-12“转换成？年？月？日的形式
        //————>SimpleDateFormat只能先字符串转换为Date的形式，想转？年？月？日的形式还是得依靠SimpleDateFormat
        String lw = "1999-10-12";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
        Date d2 = sdf3.parse(lw);
        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy年MM月dd日");
        String r = sdf4.format(d2);
        System.out.println(r);  //真的麻烦！！！！


    }
}
