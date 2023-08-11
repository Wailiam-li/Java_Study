package JavaKnowledge.Z_comprehensive_Prac;

/*
    给你一个下标从 0 开始的整数数组 nums 。如果下标对 i、j 满足 0 ≤ i < j < nums.length ，如果 nums[i] 的 第一个数字
    和 nums[j] 的 最后一个数字 互质 ，则认为 nums[i] 和 nums[j] 是一组 美丽下标对 。
    返回 nums 中 美丽下标对 的总数目。

    对于两个整数 x 和 y ，如果不存在大于 1 的整数可以整除它们，则认为 x 和 y 互质 。换而言之，
    如果 gcd(x, y) == 1 ，则认为 x 和 y 互质，其中 gcd(x, y) 是 x 和 k 最大公因数 .

    注意！！！！   原文说了是：“nums[i] 的 第一个数字和 nums[j] 的 最后一个数字互质 ”，而不是整个数字互质！！！
 */
public class Practice03 {

    public static void main(String[] args) {
        int[] a = {31, 25, 72, 79, 74};
        int practice = practice(a);
        System.out.println(practice);
    }


    public static int practice(int[] a) {
        /*
          思路：写两个循环，遍历数组a，记录他们公因数最大为1的数组  个数

            关键点是：如何求最大公因数呢？
                 ————>拿更小的那个数从1开始到它一个一个除，将最大的公因数记录，如果不为1就排除它
         */
        int result = 0;
        int length = a.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                //如何取a[i]和a[j]的第一个数字和最后一个数字呢？——————>试试用 字符索引
                //————————>正解：直接用 求余（用10求余，取个数） 和  整型取数（取第一个数）
//               Integer b = Integer.valueOf((a[i] + "").charAt(0));
//                Integer c = Integer.valueOf((a[j] + "").charAt(-1));  //以上结果的出来的 数会是 Ascii码表中出来的数
                //先判断下它的位数
                int charLength = (a[i] + "").length();
                int yushu = 1;
                for (int i1 = 0; i1 < charLength - 1; i1++) {  //优化：使用数学函数得到10的n-1次方。 (int)Math.pow(10,charLength - 1)
                    yushu = yushu * 10;                      //需要强转，否则返回的是double类型
                }
                int b = a[i] / yushu;
                int c = a[j] % 10;
                int min = b < c ? b : c;  //取两数之间更小的数
                //记录最大公因数
                int s = 1;
                for (int i1 = 1; i1 <= min; i1++) {
                    if (b % i1 == 0 && c % i1 == 0) {
                        s = i1;
                    }
                }
                if (s==1) {
                    result++;
                }

            }
        }
        return result;
    }


}
