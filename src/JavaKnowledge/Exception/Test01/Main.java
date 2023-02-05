package JavaKnowledge.Exception.Test01;

/*
需求:
键盘录入自己心仪的女朋友姓名和年龄。姓名的长度在3 - 10之间，
年龄的范围为18 - 40岁,
超出这个范围是异常数据不能赋值，需要重新录入,一直录到正确为止。提示:
需要考虑用户在键盘录入时的所有情况。
比如:录入年龄时超出范围，录入年龄时录入了abc等情况
*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String girlfriendName=null;
        System.out.println("请输入你女朋友的名字：");
        Scanner sc = new Scanner(System.in);       //键盘录入都不记得！
        String girlfriendName = sc.nextLine();
        while (girlfriendName.length() < 3 || girlfriendName.length() > 10) {
            System.out.println("名字长度不对，请重新输入！");
            girlfriendName = sc.nextLine();
        }
        System.out.println("请输入你女朋友的年龄：");
        Scanner sc1 = new Scanner(System.in);    //System.in与System.out对应，out是输出，in是输入，以此来帮助记忆！

        /*
         *    问题：类型的不对(NumberFormat格式异常) 应该怎么处理？  可能就有问题，不应该有强转，不然类型的异常不会有，
         *
         *    思路：使用循环判断年龄，如果不对应，重新录入，
         */
        int girlfriendAge = 0;
        try {
            girlfriendAge = sc1.nextInt();   //快捷键又忘了！！————>   ctrl+alt+t
        } catch (InputMismatchException e) {  //类型输入不匹配异常    // 注：.nextInt()只能录入整数，其他的会报错！
            System.out.println("年龄类型不对，请重新输入！");
        }
        while (girlfriendAge < 18 && girlfriendAge > 40) {
            sc1 = new Scanner("请输入你女朋友的年龄：");
            girlfriendAge = Integer.parseInt(sc1.nextLine());
        }
        System.out.println("你女朋友的名字是：" + girlfriendName + "，她的年龄是：" + girlfriendAge);

        /*
         *   未完成小结：1，键盘录入没有记得很清楚，Scanner（）括号中应该加System.in;
         *            2，”女朋友“可以通过创建对象的方式来输入； 在set方法中设置限制（名字长度、年龄），不对则抛出异常！
         *            3，名字的长度需求并没有体现。
         */
    }
}
