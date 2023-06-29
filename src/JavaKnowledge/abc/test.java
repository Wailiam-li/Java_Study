package JavaKnowledge.abc;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;

public class test {
    public static void main(String[] args) {
    }
        /*
         四舍五入保留两位用法
         */
//        double one = 5.26519;
//        BigDecimal two = new BigDecimal(one);
//        double three = two.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
//        System.out.println(three);
//
//        /*
//           向上取整的方法
//         */
////        int a=6;
////        int c=9;
////        double b=Math.ceil((double) a/c);
////        System.out.println(b);
//
//        BigDecimal s=new BigDecimal("40");
//        System.out.println(s.compareTo(new BigDecimal("60")));
//        Date date = new Date("2023-05-23");
//        long time = date.getTime();
//        System.out.println(time);
//
//        String date1 = new String("2023-05-23");
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Test
    public void test1() {
        if (true && false) {
            System.out.println(1);
        } else {
            System.out.println(2);

        }
    }

    @Test
    public void test() {

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4, 5);

//        Collection union = CollectionUtils.union(list1, list2);
        System.out.println("unionTest1 并集 :" + list1);
    }


    @Test
    public void test01() {
        BigDecimal a = new BigDecimal("1.1225");
        BigDecimal b = new BigDecimal("1.122");
        BigDecimal c = new BigDecimal("0");
        BigDecimal d = a.add(b).add(c).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(d);
    }

    @Test
    public void test02() {
      String a="XXXX支行";
      if ('1'=='1' && a.charAt(0)==a.charAt(1)&&a.charAt(1)==a.charAt(2)){
          System.out.println("true");
      }
    }

    @Test
    public void test03() {
        String a="XXXX支行";
        if ('1'=='1' && a.substring(a.length()-2).equals("支行")){
            System.out.println("true");
        }
    }

    @Test
    public void test04() {
        String str = "i love 791202";
        System.out.println(str.substring(str.length() - 6)); // 791202
    }

    @Test
    public void test05() {
        String str = "111111111a";
        if (str.matches("\\d{9,10}") == false) {
            System.out.println("输入有误"); // 791202
        }else{
            System.out.println("无误");
        }
    }

    @Test
    public void test06() {
        String str = "ssss分行";
        if (!str.substring(str.length()-2).equals("支行")&&
                !str.substring(str.length()-2).equals("分行")) {
            System.out.println("输入有误");
        }else{
            System.out.println("无误");
        }
    }

    @Test
    public void test07() {
        String str = "1111";
        if ('a'=='a'&&(str.charAt(0)==str.charAt(1)&&str.charAt(2)==str.charAt(1)
        &&str.charAt(2)==str.charAt(3))) {
            System.out.println("数字不能全部一样");
        }else{
            System.out.println("无误");
        }
    }
}






