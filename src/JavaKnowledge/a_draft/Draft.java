package JavaKnowledge.a_draft;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

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

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String date2="2023-06-01";
        String date3="2023-06-02";
        String date4="2023-06-03";
        Date parse = sdf.parse(date2);
        Date parse1 = sdf.parse(date3);
        Date parse2 = sdf.parse(date4);
        l.add(parse1);
        l.add(parse2);
        l.add(parse);
        Collections.sort(l,(o1, o2) -> o2.compareTo(o1));
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
    public void test(){
        String a="abcd";
        String substring = a.substring(1);  //表示从第几个开始检索
        System.out.println(substring);

    }

    @Test
    public void test01(){
        List<Integer> list=new ArrayList();
        list.add(1);
        ArrayList list1=null;
        //从此处看出，条件语句中的“||”并不是全部都判断，而是判断到一个符合就不往下判断了；而“&&”是都判断的
        if (list1==null && list1.isEmpty()){
            System.out.println("66666");
        }

    }


}
