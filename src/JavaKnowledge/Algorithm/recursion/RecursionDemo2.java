package JavaKnowledge.Algorithm.recursion;

/**
 * @Date:2024/2/27 21:39
 * <p>
 * Description：  利用递归 求5的阶层
 * 分析：  5!=5*4！
 * 4！=4*3！
 * 3!=3*2! 以此类推... 1！=1*1!
 */
public class RecursionDemo2 {

    public static void main(String[] args) {
        int jc = jc(9);
        System.out.println(jc);
    }

    public static int jc(int number) {
        //写递归出口
        if (number == 1) {
            return 1;
        }
        return number * jc(number - 1);
    }


}
