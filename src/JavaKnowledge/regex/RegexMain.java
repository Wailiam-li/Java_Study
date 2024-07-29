package JavaKnowledge.regex;

import cn.hutool.core.date.DateTime;
import org.junit.Test;

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


}
