package JavaKnowledge.Date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    知识学习
 */
public class Main {

        /*
          关于SimpleDateFormat中.parse()和.format()方法的使用；
         */

    @Test
    public void test() {

        String date = "2023-06-09";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
        Date d = new Date();

        Date d2 = new Date(2023, 9, 5);


        System.out.println("Date 'd' is before Date 'd2' : " + d.before(d2));

    }


    @Test
    public void test01() throws ParseException {

        String date = "2021-07-31";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(date);

        Date d = new Date();
        long oneYearAgo = parse.getTime();
        long now = d.getTime();
        System.out.println(oneYearAgo);
        System.out.println(now);

        long l = now - oneYearAgo;
        System.out.println(l);

        long l1 = l / (365*24 * 60 * 60 * 1000L);

        if (l1 > 1L) {
            System.out.println("时间是：" + l1);
        }

    }
    
    @Test
    public void test02() {
        //测试&&  和  || 的联合使用
        if (1 == 3 || 1 == 2 && 3 == 3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }


    @Test
    public void test03() {
        //测试&&  和  || 的联合使用
        if (1 == 3 || 1 == 2 && 3 == 3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}


