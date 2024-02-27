package JavaKnowledge.Algorithm.recursion;

/**
 * ClassName:KnowledgeRecord
 * Description:   recursion：表示“递归”的意思
 * 注：递归利用了Java的栈内存空间，每次调用一个方法的时候，使方法进栈，所以递归必须要有出口，否则Java汇报栈内存溢出。
 *
 * @Date:2024/2/27 10:52
 * @Author: 李威威
 */
public class RecursionDemo {

    public static void main(String[] args) {
        /*使用例：以1加到100为例： 1到100的累加和=1+1到99的累加和
                              1到99的累加和=1+1到98的累加和
                              1到98的累加和=1+1到97的累加和
                             ..........
                             1到1的累加和=1
        */
        int sum = getSum(100);
        System.out.println(sum);

    }

    public static int getSum(int number) {
        //先写栈的出口
        if (number == 1) {
            return 1;
        }
        //递归调用本函数
        return number + getSum(number - 1);
    }

}
