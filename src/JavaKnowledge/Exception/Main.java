package JavaKnowledge.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *   异常
 */
public class Main {
    public static void main(String[] args) throws ParseException {

        /*两种异常

        //1.编译时异常，例：日期格式解析异常  注：必须手动处理，否则无法运行
        String time = "2023年2月1号";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年mm月dd号");
        Date date1 = sdf.parse(time);   //parse()下一般会有红色波浪线，因为parse()的底层有ParseException，编译时异常
        System.out.println(date1);


        // 2.运行时异常： 例：索引越界     注：编译时不需要处理，是代码运行出现的异常
        int[] arr={1,2,3,4,5};
        System.out.println(arr[12]);  // ArrayIndexOutOfBoundsException

*/

        /*
         *   异常的处理方式    1.Jvm默认处理
         */
        //  2.异常捕获   例：
        int[] a = {1, 2, 3, 4, 5};
        try {
            System.out.println(a[8]);
            // } catch (ArrayIndexOutOfBoundsException e) {
        } catch (Exception e) {
            System.out.println("索引越界！！！");
        }

        System.out.println("看看我执行了嘛？");


    }
}
