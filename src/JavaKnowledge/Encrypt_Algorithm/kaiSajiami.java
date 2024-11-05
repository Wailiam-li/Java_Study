package JavaKnowledge.Encrypt_Algorithm;

import org.junit.Test;

/**
 * ClassName:kaiSajiami
 * Description:   演示 凯撒加密算法
 *
 * @Date:2024/10/29 15:42
 * @Author: 李威威
 */
public class kaiSajiami {

    /**
     * 思路：遍历字符串，将每个字符转陈给对应的ASCII码，之后再转回字符，进行拼接
     * @param
     */
    public static void main(String[] args) {

        String str="wangxiaoyaisbeautiful6";
        String encrypt = encrypt(str);
        System.out.println("密文："+encrypt);
        System.out.println("原文："+decrypt(encrypt));

    }

    private static String encrypt(String str) {
        String[] split = str.split("");
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            char c = split[i].charAt(0);
            int i1 = c + 3;
            builder.append((char)i1);
        }
        return builder.toString();
    }

    private static String decrypt(String str) {
        String[] split = str.split("");
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            char c = split[i].charAt(0);
            int i1 = c - 3;
            builder.append((char)i1);
        }
        return builder.toString();
    }
}