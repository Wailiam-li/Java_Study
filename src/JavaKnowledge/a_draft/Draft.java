package JavaKnowledge.a_draft;

import cn.hutool.core.bean.BeanUtil;
import lombok.val;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Draft {
    public static void main(String[] args) throws ParseException {
//        String date = "";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date parse = sdf.parse(date);
////        long time = parse.getTime();
//        System.out.println(parse);


//    }

//        StringBuilder builder=new StringBuilder();
//        Map<String, String> m = new HashMap<>();
//        System.out.println(m);
//        System.out.println(m.get("code"));

//        List<String> s=new ArrayList<>();
//        System.out.println(s.size());

        List<Date> l = new ArrayList<>();
//        personList.add(new Person("liwei",23));
//        personList.add(new Person("liwei",23));
//        personList.add(new Person("lihui",28));

//        personList.sort(Comparator.comparing(Person::getAge));
//        l.add("111"); //0
//        l.add("222");
//        l.add("333");//2
//        l.add("4444");
////        l.remove(2);
////        l.add("333333333");
//
//        for (int i = 0; i < l.size(); i++) {
//            if (l.get(i).equals("222")){
//                l.remove(l.get(i));
//                System.out.println(l.get(i));
//        }
//        }

//        Date date1=new Date();
//        System.out.println(date1.getTime()); //15:08  1685689737668

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date2 = "2023-06-01";
        String date3 = "2023-06-02";
        String date4 = "2023-06-03";
        Date parse = sdf.parse(date2);
        Date parse1 = sdf.parse(date3);
        Date parse2 = sdf.parse(date4);
        l.add(parse1);
        l.add(parse2);
        l.add(parse);
        Collections.sort(l, (o1, o2) -> o2.compareTo(o1));
        System.out.println(l);


//        System.out.println(date2);
//        System.out.println(l.get(0));
//        System.out.println(l.get(1));
//        System.out.println(l.get(2));
//        System.out.println(l.get(3));
//        System.out.println(l.size());
//        System.out.println(l);
    }


    @Test
    public void test() {
        String a = "abcd";
        String substring = a.substring(1);  //表示从第几个开始检索
        System.out.println(substring);

    }

    @Test
    public void test01() {
        List<Integer> list = new ArrayList();
        list.add(1);
        ArrayList list1 = null;
        //从此处看出，条件语句中的“||”并不是全部都判断，而是判断到一个符合就不往下判断了；而“&&”是都判断的
        if (list1 == null || list1.isEmpty()) {
            System.out.println("66666");
        }

    }

    @Test
    public void test02() {
        List<Per1> list = Arrays.asList(new Per1("1", "liwei", 23),
                new Per1("1", "lisan", 22),
                new Per1("1", "lisi", 22),
                new Per1("2", "lihui", 23),
                new Per1("2", "lihui2", 19),
                new Per1("1", "lihui3", 19),
                new Per1("1", "lili", 24));
        Map<String, List<Per1>> collect = list.stream().sorted(Comparator.comparing(Per1::getAge)).collect(Collectors.groupingBy(Per1::getType));
        System.out.println(collect);
    }

    @Test
    public void test03() {
        int a = 1;
        String b = null;
        if (a == 2 && b.matches("\\d{1}")) {
            System.out.println("999");
        } else {
            System.out.println("111");
        }
    }
//小结：if的判断中，利用&&连接的条件，如果第一个条件不符合是不会判断第二个的；  以上为例

    @Test
    public void test04() {
        String a = "";

        if (a.toString().matches("\\d*") == false) {
            System.out.println("错错错！");
        } else {
            System.out.println("啊对对对！");
        }

    }

    @Test
    public void test05() {
        BigDecimal a = new BigDecimal("1.09");

        if (a.setScale(0, BigDecimal.ROUND_HALF_UP).toString().matches("\\d*") == true) {
            System.out.println("错错错！");
        } else {
            System.out.println("啊对对对！");
        }

    }

    @Test  //对set集合的取并集测试
    public void test06() {
        List<String> list = Arrays.asList("a", "b", "a", "c");
        System.out.println(list);
        List<String> list2 = Arrays.asList("c", "d", "e");
        Set set = new HashSet<>(list);
        System.out.println(set);
        set.addAll(list2);
        System.out.println(set);
    }

    @Test  //对set集合的取并集测试
    public void test07() {
        Per per1 = new Per("lili", 20);
        Per per2 = new Per("liwei", 21);
        Per per3 = new Per("lihui", 22);
        Per per4 = new Per("lihu", 28);
        List<Per> pers = new ArrayList<>();
        pers.add(per1);
        pers.add(per2);
        pers.add(per3);
        pers.add(per4);
        Integer integer = pers.stream().map(Per::getAge).max(Comparator.comparingInt(e -> e)).get();
        System.out.println(integer);

    }

    @Test  //对判断语句进行
    public void test08() {
        int a = 1;
        Per per1 = new Per();
        if (a == 1 && per1.getName().equals("李威")) {
            System.out.println("666666");
        }
    }
    //结：由此看来，if（）的判断语句中，如果用“||”，之前要前一个满足，就不会管后面的判断；用“&&”就是前后几个判断 都会 判断


    @Test  //StringUtils.upperCase
    public void test09() {
        String a = "123xcv";
        String s = StringUtils.upperCase(a);
        System.out.println(s);
    }

    @Test  //UUID.randomUUID()可以用来生成验证的token
    public void test10() {
        String s = UUID.randomUUID().toString();  //生成了一个不包括下划线的32位的字符串
        System.out.println(s);
    }

    @Test   //hutool中的BeanUtil.copyProperties使用
    public void test11(){
        Per p1=new Per("李威",21);
        User u1= BeanUtil.copyProperties(p1,User.class);
        System.out.println(u1);
    }


    @Test   //
    public void test12(){
        Calendar c = Calendar.getInstance();
        System.out.println(c.getWeekYear());
    }

}
