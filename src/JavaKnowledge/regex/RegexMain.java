package JavaKnowledge.regex;

import cn.hutool.core.date.DateTime;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName:regexMain
 * Description:  正则表达式.
 * 注：正则表达式大多是需要记的东西，具有一定的匹配规则，因此列举常用的一些，详情更多规则见QQ邮箱文档 Java上部
 *
 * @Date:2024/7/11 10:24
 * @Author: 李威威
 */
public class RegexMain {

    @Test   //匹配手机号码
    public void test01() {
        String phoneNum = "13517077146";
        if (phoneNum.matches("1[3-9]\\d{9}")) {  //注：1.数字范围之间是用“-”！  2.任意数字是用\\d
            System.out.println("手机号码校验无误！");
        } else {
            System.out.println("手机号码格式不正确，请检查！");
        }
    }

    @Test   //匹配任意数字(金额)
    public void test02() {
        String phoneNum = "0890*";
        if (phoneNum.matches("\\d+")) {  //注：1.数字范围之间是用“-”！  2.任意数字是用\\d
            System.out.println("数字校验无误！");
        } else {
            System.out.println("数字格式不正确，请检查！");
        }

    }

    @Test  //正则表达式验证科学计数法的形式
    public void test03() {
//        String regEx="^([\\+|-]?\\d+(.{0}|.\\d+))[Ee]{1}([\\+|-]?\\d+)$";
        String regEx = "^([\\+|-]?\\d+(.\\d+))[Ee]{1}([\\+|-]?\\d+)$";
        String a = "1.820824873E+10";
        if (a.matches(regEx)) {
            System.out.println("666");
            BigDecimal originValue = new BigDecimal(a);
            System.out.println("BigDecimal类型原数字是：" + originValue);
//            System.out.println("正确的手机号是："+originValue.toString());
            System.out.println("正确的手机号是：" + originValue.toPlainString());
        } else {
            System.out.println("555555");
        }
    }


    @Test  //正则表达式验证科学计数法的形式
    public void test04() {
        String objectKey = "temp/s3.server.keyPath/invoice/收款条目_202408131125.xlsx";
        String exportName = objectKey.substring(objectKey.lastIndexOf("/") + 1);
        //objectKey.lastIndexOf("/")这个是获取这个符号的索引位置。这里”/“所在的索引位置就是30，那么.substring()就是在31的位置上开始一直索引到末尾
        System.out.println(exportName);


    }

    @Test
    public void test05() {
        List<String> list = Arrays.asList("湖南省张家界市", "湖南省长沙市");
        if (list.contains("湖南")) {
            System.out.println("包含湖南");
        } else {
            System.out.println("不包含湖南");
        }
    }

    @Test
    public void test06() {
        //RandomStringUtils.random()生成一个指定长度的随机字符串，包含指定的字符集中的字符. 即从字符集"abcdeABCDE123456"中随机生成一个6位的字符串
        String password = RandomStringUtils.random(6, "abcdeABCDE123456");
        System.out.println(password);
    }


}
