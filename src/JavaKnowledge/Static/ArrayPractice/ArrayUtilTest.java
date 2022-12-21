package JavaKnowledge.Static.ArrayPractice;

import static JavaKnowledge.Static.ArrayPractice.ArraryUtil.getAerage;
import static JavaKnowledge.Static.ArrayPractice.ArraryUtil.printArr;

public class ArrayUtilTest {
    public static void main(String[] args) {
        int[] a = {12, 34, 56, 61, 75, 84};
        String s = printArr(a);        //或用ArraryUtil.printArr(a)，这样就不用导包了；
        System.out.println("下面将打印这组数组：" + s);
        int aerage = getAerage(a);
        System.out.println("这组数组的平均数是：" + aerage);
    }

}
