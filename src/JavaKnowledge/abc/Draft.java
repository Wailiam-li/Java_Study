package JavaKnowledge.abc;

import JavaKnowledge.Oop.Super.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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

        Set<Long> l=new HashSet<Long>() {
        };
//        personList.add(new Person("liwei",23));
//        personList.add(new Person("liwei",23));
//        personList.add(new Person("lihui",28));

//        personList.sort(Comparator.comparing(Person::getAge));
         l.add(1L);
         l.add(1L);
         l.add(1L);
         l.add(1L);
        System.out.println(l);

        TreeMap tm=new TreeMap<>();
        HashMap hm=new HashMap();
        hm.put(1,"aaaa");
        hm.put(9,"cccc");
        hm.put(2,"cc");
        hm.put(5,"dd");
        hm.put(3,"dd");
        tm.putAll(hm);

        System.out.println(tm);
    }



}
