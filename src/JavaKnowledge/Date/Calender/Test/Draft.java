package JavaKnowledge.Date.Calender.Test;

import java.text.NumberFormat;

/*

     占位符 及 十位数不足补“0”的方法！！！
 */

public class Draft {

    public static void main(String[] args) {

        //方法1： 1为 int 类型、0代表前面要补位的字符、2代表字符串的长度、d表示参数为整数类型
        String s = String.format("%08d", 1);   //注：“%”后面一般表示用什么补足，一般只有用0补足，“8”表示用一共补足多少位
        //例：这里表示用0补足8位数
        System.out.println(s);


        //方法2： 首先通过 getInstance 创建一个 NumberFormat 实例
        NumberFormat numberFormat = NumberFormat.getInstance();
        // 设置最大和最小整数位数
        numberFormat.setMaximumIntegerDigits(2);
        numberFormat.setMinimumIntegerDigits(2);
        // 最后通过 format 方法操作要补零的数字即可
        System.out.println(numberFormat.format(9));


        double d = 3.1415926;
        System.out.printf("%.2f\n", d); // 显示两位小数3.14
        System.out.printf("%5.4f\n", d); // 长度是5，显示4位小数3.1416
        int nn = 12345000;
        System.out.printf("n=%d, hex=%08x", nn, nn); // 把一个整数格式化成十六进制，并用0补足8位

    }
}
