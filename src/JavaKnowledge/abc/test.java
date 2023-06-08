package JavaKnowledge.abc;

import org.junit.Test;

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
        public void test1(){
            if (true && false){
                System.out.println(1);
            }else {
                System.out.println(2);

            }
        }



}
