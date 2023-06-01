package JavaKnowledge.abc;

import java.text.ParseException;
import java.util.ArrayList;
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

        List<String> l = new ArrayList<>();
//        personList.add(new Person("liwei",23));
//        personList.add(new Person("liwei",23));
//        personList.add(new Person("lihui",28));

//        personList.sort(Comparator.comparing(Person::getAge));
        l.add("111"); //0
        l.add("222");
        l.add("333");//2
        l.add("4444");
//        l.remove(2);
//        l.add("333333333");

        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).equals("222")){
                l.remove(l.get(i));
                System.out.println(l.get(i));
        }
        }


//        System.out.println(l.get(0));
//        System.out.println(l.get(1));
//        System.out.println(l.get(2));
//        System.out.println(l.get(3));
//        System.out.println(l.size());
//        System.out.println(l);
    }


}
