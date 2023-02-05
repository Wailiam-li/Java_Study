package JavaKnowledge.Exception.Test01;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Test01 改造完整版   (根据自己的思路完成)     有一些缺点：最后依据sout必然会打印，即使年龄不对
 */
public class MainTwo {

    public static void main(String[] args) {
        int error = 0;
        System.out.println("请输入你女朋友的名字：");
        Scanner sc = new Scanner(System.in);
        String girlfriendName = sc.nextLine();
        while (girlfriendName.length() < 2 || girlfriendName.length() > 10) {
            System.out.println("名字长度不对，请重新输入！");
            girlfriendName = sc.nextLine();
            error = 1;
        }
        error = 0;
        System.out.println("请输入你女朋友的年龄：");
        Scanner sc1 = new Scanner(System.in);    //System.in与System.out对应，out是输出，in是输入，以此来帮助记忆！


        int girlfriendAge = 0;
        try {
            girlfriendAge = sc1.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("年龄类型不对，请重新输入！");
            error = 1;
        }
        while (girlfriendAge < 18 && girlfriendAge > 40) {
            sc1 = new Scanner("请输入你女朋友的年龄：");
            girlfriendAge = Integer.parseInt(sc1.nextLine());
            error = 1;
        }
        error = 0;
        if (error == 0) {
            System.out.println("你女朋友的名字是：" + girlfriendName + "，她的年龄是：" + girlfriendAge);
        }

    }
}
