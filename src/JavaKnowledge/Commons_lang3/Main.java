package JavaKnowledge.Commons_lang3;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {


        //判断是否为空(注：isBlank与isEmpty 区别)
        StringUtils.isBlank(null);
        StringUtils.isBlank("");
        StringUtils.isBlank(" ");//---true
        StringUtils.isNotBlank(" ");//---false


        StringUtils.isEmpty(null);
        StringUtils.isEmpty("");//---true
        StringUtils.isEmpty(" ");//---false
        StringUtils.isNotEmpty(" ");//---true


//        Date now = new Date();
//        System.out.println(now);


    }
}
