package JavaKnowledge.String;

import java.util.Scanner;

/**
 * 遍历字符串并统计其中的大写字母、小写字母、数字个数
 */
public class StringPractice2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        String str = sc.next();
        int smallCount = 0, binCount = 0, numCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {  //注：字符char类型的变量在参与计算时自动提升为int类型，查询Ascii码
                smallCount++;           //这里加了单引号之后表示为一个字符，而变量c为char型，比较是通过Ascii转为int数值
            } else if (c >= 'A' && c <= 'Z') {
                binCount++;
            } else if (c >= '0' && c <= '9') {  //注意：else表示“其他”，不可以加其他的条件！！！没有 else(条件)这种情况！
                numCount++;
            }
        }
        System.out.println("小写字母有" + smallCount + "个,");
        System.out.println("大写字母有" + binCount + "个,");
        System.out.println("数字有" + numCount + "个.");


    }


}

//定义一个StringBuilder接收，之后转成字符串，遍历字符串，取对应大写表对应加上去；