package JavaKnowledge.Z_Practice;
/*
给你一个正整数n。
    用even表示在n的二进制形式(下标从О开始)中值为1的偶数下标的个数。
    用odd表示在n的二进制形式(下标从О开始)中值为1的奇数下标的个数。返回整数数组answer，其中answer = [even,odd] 。

 */

import java.util.Arrays;

public class Practice01 {

    public static void main(String[] args) {
        int[] answer = evenOddBit(17);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] evenOddBit(int n) {
        //先转换成二进制数,再对这个数的每一位数进行求余，值为1的话，记录下标，并将下标进行求余，
        //为偶数的话even+1，
        int even = 0, odd = 0;
        String s1 = Integer.toBinaryString(n);
        //这里将二进制反转进行读取  ！！！又或者可以下面遍历时，从高位开始遍历！！————>这样的话对第几位数的判断会不准确！！
        StringBuilder s2 = new StringBuilder();  //对于以下几步的优化，可以直接将字符串转成字符串数组，遍历时即可从后面开始取值
        s2.append(s1);                          //以上的思路错误，转成数组后，取0索引还是从左往右的第一位，无法从最右边开始取值
        String s = s2.reverse().toString();


        int i = s.length();

        for (int i1 = 0; i1 < i; i1++) {
            String g = String.valueOf(s.charAt(i1));
//            int g = c;  //对不对呢???——————>不对！
            if (g.equals("1")) {
                //对位数进行判断是奇数还是偶数
                if (i1 % 2 == 0) {
                    even++;
                } else if (i1 % 2 == 1) {
                    odd++;
                }
            }
        }
        int[] answer = {even, odd};
//!!!怎么求余得到个十百的个位数呢？？  ————>环种思路，不用求余的办法，用字符串索引的办法看看行不行！

        return answer;  //错误点：没有%2b转成二进制的方法！   怎么样转二进制呢？
                       /* Integer.toBinaryString(data)    //data为十进制，转换成二进制
                          Integer.toHexString(data)        //data为十进制，抓换成十六进制

                        */
    }
}
