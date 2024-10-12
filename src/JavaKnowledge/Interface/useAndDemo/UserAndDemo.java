package JavaKnowledge.Interface.useAndDemo;

/**
 * @author Liweiwei
 * @Date 2024/10/11 22:31
 * @Description :
 */
public class UserAndDemo implements Inter {
    public static void main(String[] args) {
        System.out.println(Inter.a);  //说明接口中的成员变量被默认的static 修饰！

        //  System.out.println(Inter.a=20); //报错说明接口中的成员变量被默认的final 修饰！

    }

}
