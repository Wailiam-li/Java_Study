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

//****   小结：即isBlank()会把空格判成空，而isEmpty()不会，isEmpty()认为有空格则不为空；

//        Date now = new Date();
//        System.out.println(now);


    }
}
