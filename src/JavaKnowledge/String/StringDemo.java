package JavaKnowledge.String;

import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {


        String name = "liwei";
        String password = "123";


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入用户密码：");
        String userpassword = sc.next();
        if (username.equals(name) && userpassword.equals((password))) {
            System.out.println("用户登录成功！");
        } else {
            System.out.println("用户名或密码输入错误！！");
        }
    }
}