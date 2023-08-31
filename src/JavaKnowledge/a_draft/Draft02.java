package JavaKnowledge.a_draft;

import java.util.UUID;

/**
 * ClassName:Draft02
 * Description:
 *
 * @Date:2023/8/16 11:11
 * @Author: 李威威
 */
public class Draft02 {

    public static void main(String[] args) {

        String a = UUID.randomUUID().toString();//作用是：可生成除 “-” 外的一个32位的字符串
        System.out.println(a);
        String s = a.replaceAll("-", "");
        System.out.println(s);

    }
}
