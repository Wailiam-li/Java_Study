package JavaKnowledge.Exception.Test01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
  网课参考答案版
 */
public class MainThree {
    public static void main(String[] args) throws ParseException {
        Date time = new Date(1667380952425L);   //Integer number too large后面加个L即可；
        // Date（）方法中有个构造方法 可以直接传毫秒值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年mm月dd日 HH:mm:ss");
        String date = sdf.format(time);
        System.out.println(date);


    }
}
