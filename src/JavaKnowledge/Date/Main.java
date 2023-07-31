package JavaKnowledge.Date;

import org.junit.Test;

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
    public void test(){

        String date="2023-06-09";
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd ");
        Date d=new Date();

        Date d2=new Date(2023,9,5);


        System.out.println("Date 'd' is before Date 'd2' : "+d.before(d2));

    }


    @Test
    public void test01(){

//        String date="2023-06-09";
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d=new Date();
        d.setTime(1690353424*1000L);
        String format = sdf.format(d);
//        Date d2=new Date(2023,9,5);

        System.out.println("时间是："+d);
        System.out.println("时间是："+format);

    }



    @Test
    public void test02() {
     //测试&&  和  || 的联合使用
        if (1==3 ||1==2   && 3==3){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }



}


