package JavaKnowledge.Z_comprehensive_Prac.JBF_Competition;

/*
   快递小哥：
         张三和李四是麦当当里唯一的两个快递小哥。今天，店铺收到了 n 份订单。
        由于不同的快递小哥处理订单的奖励金额可能存在差异，他们需要分配订单以最
        大化奖励总额。具体而言，如果张三处理第 i 个订单，他将获得 a_i 元奖励；如
        果李四处理该订单，则获得 b_i 元奖励。
        为了最大化奖励总额，他们需要在两人之间分配订单。每份订单只能由其中
        一个人处理。此外，由于时间限制，张三最多只能处理 x 个订单，李四最多只能
        处理 y 个订单。保证 x+y 大于等于 n，即所有订单都能被张三或李四处理。
        请计算处理完所有订单后，他们所能获得的最大奖励总额是多少。

 */
public class KuaiDiXiaoGe02 {

    public static int calcMaxPay(int n, int x, int y, int[] a, int[] b) {
          /* 入口参数 n 为当天的订单数；参数 x, y 分别为张三和李四最多能处理的订单数；
             参数 a, b 是长度为 n 的整数数组，a[i]和 b[i]分别代表张三和李四处理第 i 个订单所获得的奖励。
            该方法的入口参数满足：1 ≤ n ≤ 10^5;   1 ≤ x, y ≤ n ， x + y ≥ n ;   1 ≤ a[i], b[i] ≤ 10^4
            最后输出结果为最大奖励总额  */
       /*
               条件是：假设甲实际处理m(m<x)份，乙实际处理p(p<y)份，现有：m+p=n------1
                                                               a[1]+...+a[m]+b[1]+...+b[p]=max-------2
               思路是：循环去试！
        */
        int max1 = 0;
        int max2 = 0;
        int result = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n - x; j++) {  //这里这个外循环只能一次次加，做不到累计加！
                result = result + a[i] + b[j];
                if (result > max1) {
                    max1 = result;
                }
            }
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < n - y; j++) {
                 result =result + b[i] + a[j];
                if (result > max2) {
                    max2 = result;
                }
            }
        }
        int max = max1 > max2 ? max1 : max2;

        return max;
    }

    public static void main(String[] args) {
        int result = calcMaxPay(5, 3, 3, new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1});
        System.out.println(result);
    }

    /*
       这题居然像数学题一样解不出来！！！


     */

}
