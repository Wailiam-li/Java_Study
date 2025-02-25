package JavaKnowledge.a_draft;

import JavaKnowledge.Enum.Season;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
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
        String a = "XXXX支行";
        if ('1' == '1' && a.charAt(0) == a.charAt(1) && a.charAt(1) == a.charAt(2)) {
            System.out.println("true");
        }
    }

    @Test
    public void test03() {
        String a = "XXXX支行";
        if ('1' == '1' && a.substring(a.length() - 2).equals("支行")) {
            System.out.println("true");
        }
    }

    @Test
    public void test04() {
        String str = "i love 791202";
        System.out.println(str.substring(str.length() - 6)); //
        System.out.println(str.charAt(-1)); //
    }

    @Test
    public void test05() {
        String str = "111111111a";
        if (str.matches("\\d{9,10}") == false) {
            System.out.println("输入有误");
        } else {
            System.out.println("无误");
        }
    }

    @Test
    public void test06() {
        String str = "ssss分行";
        if (!str.substring(str.length() - 2).equals("支行") &&
                !str.substring(str.length() - 2).equals("分行")) {
            System.out.println("输入有误");
        } else {
            System.out.println("无误");
        }
    }

    @Test
    public void test07() {
        String str = "1111";
        if ('a' == 'a' && (str.charAt(0) == str.charAt(1) && str.charAt(2) == str.charAt(1)
                && str.charAt(2) == str.charAt(3))) {
            System.out.println("数字不能全部一样");
        } else {
            System.out.println("无误");
        }
    }

    @Test
    public void test08() {
        int a = 1;
        int b = 1;
        int c = 2;
        if (a == b || b == c) {
            System.out.println("数字一样");
        } else {
            System.out.println("不一样");
        }
    }

    @Test
    public void test09() {
        String a = "啊实打实大庆基地abc到底是在哪";
        if (a.contains("大庆基地")) {
            System.out.println("数字一样");
        } else {
            System.out.println("不一样");
        }
    }

    @Test
    public void test10() {
        Date date = new Date();
        Date firstDayOfWeek = getFirstDayOfWeek(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(firstDayOfWeek);
        String s = format.split("-")[0];
        System.out.println(format);
        System.out.println(s);
    }

    private Date getFirstDayOfWeek(Date day) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        c.setTime(day);
        c.setFirstDayOfWeek(Calendar.FRIDAY);
        int dayWeek = c.get(Calendar.DAY_OF_WEEK);
        if (dayWeek == 6) {
            int hour = c.get(Calendar.HOUR_OF_DAY);
            if (hour >= 16) {
                dayWeek = -1;
            }
        }
        if (dayWeek == 7) {
            dayWeek = 0;
        }
        c.add(Calendar.DATE, -dayWeek - 8);
        c.set(Calendar.HOUR_OF_DAY, 16);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }


    @Test
    public void test11() {
        List<Integer> list = Arrays.asList(5, 3, 1);
        list.add(6);
        list.add(0, 4);   //注意：add后填两个参数时，第一个参数时索引位置的意思！！！！
        list.remove(1);
        System.out.println(list);
    }

    @Test
    public void test012() {
     Per p1=new Per("lili",21);
     Per p2=new Per("lilo",23);
     List<Per> list=new ArrayList<>();
     list.add(p1); list.add(p2);
     list.stream().max(Comparator.comparing(x->x.getAge())).ifPresent(
             r->{
                 if (r==null){
                     System.out.println(1);
                 }else if(r.getAge()==23){
                     System.out.println("right!");
                 }else {
                     System.out.println("false");
                 }

             }

     );
    }


    @Test   //BigDecimal中的 .divide() 使用注意点；
    public void test013() {
    BigDecimal a=new BigDecimal("450");
    BigDecimal b=new BigDecimal("7000");
        int i = a.multiply(new BigDecimal("1200")).divide(b,0,BigDecimal.ROUND_HALF_DOWN).intValue();
        BigDecimal multiply = a.multiply(new BigDecimal("12")).divide(b,2,BigDecimal.ROUND_HALF_DOWN);
    //注：一般除数后面要跟上 保留多少位的规则，即.divide()里需要多加几个参数
        System.out.println(i);
        System.out.println(multiply);

    }


    @Test
    public void test014() {
      int res=2;
      res&=2;
        System.out.println(res);

    }

    @Test
    public void test015() {
        Per p1=new Per("lili",21);
        Per p2=new Per("lilo",23);
        List<Per> list=new ArrayList<>();
        list.add(p1); list.add(p2);
    }


    @Test
    public void test016() {
        if (Objects.equals(null,null)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }


    @Test
    public void test017() {
        //如果前面的条件为false，则会进入后面的判断，由此看来 后面的and关系 即使没有大括号 两个也是 and的关系，需要同时成立才满足
        if (((1==1)&&(0==1))||(1==1)&&(3==4)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }




}






