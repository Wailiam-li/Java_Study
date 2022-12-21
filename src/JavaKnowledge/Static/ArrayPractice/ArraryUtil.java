package JavaKnowledge.Static.ArrayPractice;

public class ArraryUtil {

    //返回整数数组的内容,返回的是字符串格式的；
    public static String printArr(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                sb.append('[').append(a[i]);          //加两个东西就要用两个append！！！
                //这里因为数组长度为6，而循环只能为0到5，因此需长度减1
            } else if (i < a.length - 1) {
                sb.append(',').append(a[i]);
            } else {
                sb.append(",").append(a[i]).append(']');
            }
        }
        return sb.toString();            //为什么打印出的是数字！！
    }

    //用于返回平均分
    public static int getAerage(int[] a) {
        int total = 0;

        for (int j = 0; j < a.length; j++) {
            total = a[j] + total;
        }
        return total / a.length;
    }


}
