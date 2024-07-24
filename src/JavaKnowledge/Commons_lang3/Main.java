package JavaKnowledge.Commons_lang3;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import static cn.hutool.crypto.SecureUtil.md5;

public class Main {


    @Test
    public void StringUtils() {
        //判断是否为空(注：isBlank与isEmpty 区别)
        StringUtils.isBlank(null);
        StringUtils.isBlank("");
        StringUtils.isBlank(" ");//---true
        StringUtils.isNotBlank(" ");//---false


        StringUtils.isEmpty(null);
        StringUtils.isEmpty("");//---true
        StringUtils.isEmpty(" ");//---false
        StringUtils.isNotEmpty(" ");//---true

//****   小结：即isBlank()会把空格判成空，而isEmpty()不会，isEmpty()认为有空格则不为空；

//        Date now = new Date();
//        System.out.println(now);


    }

    /**
     * md5加密
     */
    @Test
    public void DigestUtils() {

        // MD5加密
//        String encodeStr = DigestUtils.md5Hex(text + key);
//        // 密钥进行验证
//        String md5Text = md5(text, key);
//        if (md5Text.equalsIgnoreCase(md5Text)) {
//            System.out.println("MD5验证通过");
//        }


    }


}
