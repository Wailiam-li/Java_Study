package JavaKnowledge.Encrypt_Algorithm;

import java.security.MessageDigest;
import java.util.Formatter;

/**
 * ClassName:MD5
 * Description: 演示常见的加密算法：MD5
 *
 * @Date:2024/10/8 14:11
 * @Author: 李威威
 */
public class MD5 {
    private static final String MD5_ALGORITHM = "MD5";
    public static String encrypt(String data) throws Exception {
        // 获取MD5算法实例
        MessageDigest messageDigest = MessageDigest.getInstance(MD5_ALGORITHM);
        // 计算散列值
        byte[] digest = messageDigest.digest(data.getBytes());
        Formatter formatter = new Formatter();
        // 补齐前导0，并格式化
        for (byte b : digest) {
            formatter.format("%02x", b);    //注：x 表示16进制，2表示两位，0表示补0。
        }
        return formatter.toString();
    }

    public static void main(String[] args) throws Exception {
        String data = "ceshi123456";
        String encryptedData = encrypt(data);
        System.out.println("加密后的数据：" + encryptedData);
    }
}

