package JavaKnowledge.Z_comprehensive_Prac;


/*
      草稿
 */

public class Draft {
    public static void main(String[] args) {
        //String 转 数组方法：1.利用.split()方法切割，返回的就是数组
        //                  2.使用String.toCharArray()方法将字符串转为字符数组。  注意：转成的是字符数组！
        String s = new String("man");


        String[] s1 = s.split("");

        System.out.println(s1[0]);

        char[] s2 = s.toCharArray();
        System.out.println(s2[1]);


    }


}
