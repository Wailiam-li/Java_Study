package JavaKnowledge.ChangeableArgs;


/**
 * 可变参数
 */
public class Main {
    public static void main(String[] args) {
        int sum = getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(sum);
    }


    /* 这里使用到可变参数,意为 可传入 某一类型的 任意个参数。
     * 使用方法： 类型...名字，例：int...args
     * 方法原理：底层依旧是个数组，将每个元素放入数组中，遍历数组。
     */
    public static int getSum(int... args) {
        int sum = 0;
        for (int i : args) {
            sum = sum + i;
        }
        return sum;
    }


}
