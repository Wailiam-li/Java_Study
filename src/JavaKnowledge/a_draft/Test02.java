package JavaKnowledge.a_draft;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

/**
 * ClassName:Test02
 * Description:
 *
 * @Date:2023/11/7 17:06
 * @Author: 李威威
 */
public class Test02 {

    /**
     * 演示获取时间的转换（DateTimeFormatter的相关使用）      要记住！！
     */
    @Test
    public void test01() {
        String yyyyMMddhhmmss = DateTimeFormatter.ofPattern("yyyyMMdd").format(LocalDateTime.now());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date parse = null;
        try {
            parse = sdf.parse(yyyyMMddhhmmss);
        } catch (Exception e) {
        }
        System.out.println(parse);
    }

    @Test
    public void test02() {
        int res = 1;
        res &= 0;
        System.out.println(res);

    }

    @Test
    public void test03() {
        //传一个date类型的日期，与当前时间进行比较；
        Date date = new Date(1700409600L);
        if (date.before(new Date())) {
            System.out.println("res");
        }
    }


    @Test
    public void test04() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = "2021-02-29";
        try {
            System.out.println(sdf.parse(date));
        } catch (Exception e) {
            System.out.println("日期格式不正确");
        }
    }

    @Test
    public void test05() {
        String yyyyMMddhhmmss = DateTimeFormatter.ofPattern("yyyyMMddHHmmss").format(LocalDateTime.now());
        System.out.println(yyyyMMddhhmmss);
    }


    @Test
    public void test07() {
        LocalDate localDate = LocalDate.now().minusMonths(1L);
        int year = localDate.getYear();
        Month month = localDate.getMonth();
        String mm = localDate.format(DateTimeFormatter.ofPattern("MM")); //这里居然还能根据 月的格式 单独 取月！！

    }

    @Test   //测试contains()方法
    public void test08() {
        String a = "aaaaa";
        if (a.contains("b")) {
            System.out.println("666666");
        }
    }


    @Test   //随便玩玩
    public void test09() {
        System.out.print("请输入你喜欢的人的名字：");
        Scanner sc = new Scanner(System.in);
        String next = sc.nextLine();
        System.out.println("你喜欢的人Ta的名字是：" + next);

    }


    @Test
    public void test10() {
        Per2 pp = new Per2("lili22", new Date(1706494220000L));  //大前天：1.29
        Per2 p1 = new Per2("lili", new Date(1706580620000L));  //前天：1.30
        Per2 p2 = new Per2("liwei", new Date(1706667020000L));  //昨天：1.31
        Per2 p3 = new Per2("lihui", new Date(1706753420000L)); //今天：2.1
        Per2 p4 = new Per2("lihui66", new Date(1706839820000L)); //明天：2.2
        List<Per2> pers = new ArrayList<>();
        pers.add(pp);
        pers.add(p1);
        pers.add(p2);
        pers.add(p3);
        pers.add(p4);
        List<Per2> collect = pers.stream().sorted(Comparator.comparing(Per2::getBirthDate).reversed()).collect(Collectors.toList());
        Per2 per = collect.stream().filter(e -> e.getBirthDate().before(p2.getBirthDate())).findFirst().orElse(null);
        System.out.println(per);
        Per2 per2 = collect.stream().sorted(Comparator.comparing(Per2::getBirthDate)).filter(e -> e.getBirthDate().after(p2.getBirthDate())).findFirst().orElse(null);
        System.out.println(per2);

    }

    @Test
    public void test11() {
        Date date1 = new Date(1706494220000L);  //注意new Date()需要传时间的 毫秒值！
        System.out.println(date1);
        Date date2 = new Date(1706580620000L);
        System.out.println(date2);
    }

    @Test
    public void test12() {
        BigDecimal a = new BigDecimal("-12");
        BigDecimal b = new BigDecimal("10");
        BigDecimal c = a.add(b);

        System.out.println(a.add(b));

    }

    @Test  //对集合进行截取一定的数量
    public void test13() {
        List<String> set = new ArrayList<>();
        // 步骤2: 向集合中添加数据
        set.add("App1e");
        set.add("Banana");
        set.add("Orange");
        set.add("Grape");

        // 步骤3: 使用截取的方法获取部分数据
//     List<String> list = new ArrayList<>(set);
        List<String> subList = set.subList(1, 4);
        //输出截取的部分数据
        System.out.println("截取的部分数据: ");
        for (String element : subList) {
            System.out.println(element);
        }

    }

    @Test  //对edm中的周报附件 进行分析
    public void test14() {
        List<String> list = Arrays.asList("abc", "cde", "def");
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s + ",");
        }
        //  sb.deleteCharAt(sb.length()-1);
        String s = new String(sb);
        System.out.println(s);

    }


    @Test
    public void test15() {
        int[] a = {1, 1, 2};
        int i = removeDuplicates(a);
        System.out.println(i);
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(list.get(j));
                }
            }
        }
//        int[]  nums1 = (int[])list.toArray(new int[list.size()]));  //把集合转成数组
        int[] num1 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            num1[i] = list.get(i);
        }
        System.out.println(Arrays.toString(num1));
        return list.size();


    }

}
