package JavaKnowledge.Z_Practice.JBF_Competition;

/*
旋转珠串:
    给定 m 个珠子，用线串在一起，从尾部依次取 n 个珠子下来放到头部，计算最终的串


 */

public class RotateBalls01 {

    /*该方法的入口参数 m 是珠子的个数，balls 为表示珠串的字符数组，n 为移动的珠子个数
      注意：n 可以大于 m；
      珠串用字符数组 char[] balls 表示，每一个字符代表一个珠子
     */
    public static char[] rotate(int m, char[] balls, int n) {
        //char[]  字符数组
        // 思路：创建一个新的字符数组，尾部开始将原先的数组取下，
//        int i=balls.length; //3
//        char[] reverse=new char[i];
//        for (int i1 = i; i1 >0 ; i1--) {
//            reverse[i-i1]=balls[i1-1];  //i1=3,0-2   i1=2,1-1
//        }


        //感觉还是弄成字符串更好做！！
        int length = balls.length;
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = new StringBuilder();
        char[] result = new char[m];
        if (m > n) { //珠子数大于移动珠子数
            for (int i = m - n; i < m; i++) {
                builder.append(balls[i]);
            }
            for (int i = 0; i < m - n; i++) {
                builder1.append(balls[i]);
            }

            String resultString = builder.toString() + builder1.toString();
            for (int i = 0; i < resultString.length(); i++) {
                result[i] = resultString.charAt(i);
            }

        } else if (m == n) {
            for (int i = 0; i < m; i++) {  //这里会出现数组越界的问题！！！
                builder.append(balls[i]);
            }
            for (int i = 0; i < builder.length(); i++) {
                result[i] = builder.toString().charAt(i);  //思路问题：原先想着如果m=n，进行翻转就行了，但实际情况是m=n时，不用动，直接返回原型即可！
            }
        } else {
            int o = n % m;
            for (int i = m - o; i < m; i++) {
                builder.append(balls[i]);
            }
            for (int i = 0; i < m - o; i++) {
                builder1.append(balls[i]);
            }

            String resultString = builder.toString() + builder1.toString();
            for (int i = 0; i < resultString.length(); i++) {
                result[i] = resultString.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] m = rotate(101, "123".toCharArray(), 1366666660);
        System.out.println(m);
    }

    /*
        失败点：1.数组越界问题；
               2.珠子重新排的问题！！如果n>m，有可能珠子不只翻转一轮！！！要重新翻转！！
               3.思路问题：原先想着如果m=n，进行翻转就行了，但实际情况是m=n时，不用动，直接返回原字符串即可！

     */

}
