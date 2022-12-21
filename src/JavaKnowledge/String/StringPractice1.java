package JavaKnowledge.String;


import java.util.Scanner;

/**
 * 判断是否为对称字符串
 */
public class StringPractice1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String next = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(next);
        //!! 注：1.这里用toString()转换成字符串很关键！
        //    2.这里字符串的比较用的是equals！！ 而不是== ！！  因为String类型是引用类型，用==比较将会是地址值，而因为后面用的是toString
        //       方法不是直接通过=赋值的，因此地址值是不相同的；故只有用equals才对；   在键盘录入的过程中产生的字符串底层也是通过new出来的
        if (sb.toString().equals(sb.reverse().toString())) {
            System.out.println("是");
        } else {
            System.out.println("不是");
        }

    }


}
