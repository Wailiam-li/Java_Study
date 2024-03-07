package JavaKnowledge.Algorithm.sort;

import java.util.Arrays;

/**
 * @Date:2024/2/25 11:49
 * <p>
 * Description：冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {


    /*冒泡排序:核心思想:
            1，相邻的元素两两比较，大的放右边，小的放左边。
            2，第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面以此类推。
            3，如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以。
*/
        //1.定义数组
        int[] arr = {2, 4, 5, 3, 1};

        /*
        //我们先来演示每一轮的比较代码，再汇总，方便理解

        //第一轮
        for (int i = 0; i < arr.length - 1; i++) { //这里用arr.length-1是为了arr[i+1]索引越界
            //比较两个大小
            if (arr[i] > arr[i + 1]) { //如果左边的数大于相邻右边的数的话，则把这个数往右移（注：我们这里采用从小到大的顺序排序）
                int temp = arr[i];  //进行交换数据
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }//进行完成以后，最大值就是移到了最右边
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        //第二轮
        for (int i = 0; i < arr.length - 1 - 1; i++) { //这里用arr.length-1是为了arr[i+1]索引越界
            //比较两个大小
            if (arr[i] > arr[i + 1]) { //如果左边的数大于相邻右边的数的话，则把这个数往右移（注：我们这里采用从小到大的顺序排序）
                int temp = arr[i];  //进行交换数据
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }//进行完成以后，本轮最大值就是移到了最右边
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        //第三轮
        for (int i = 0; i < arr.length - 1 - 2; i++) { //这里用arr.length-1是为了arr[i+1]索引越界
            //比较两个大小
            if (arr[i] > arr[i + 1]) { //如果左边的数大于相邻右边的数的话，则把这个数往右移（注：我们这里采用从小到大的顺序排序）
                int temp = arr[i];  //进行交换数据
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }//进行完成以后，本轮最大值就是移到了最右边
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
   */

        //就这样，第四轮依次类推，每轮比上一轮减少一次比较，因此可以使用嵌套的循环来完成
        for (int i = 0; i < arr.length; i++) { //表示一共需要进行几轮
            for (int j = 0; j < arr.length - 1 - i; j++) { //表示每一轮进行选出最大的数移到最右边
                if (arr[j] > arr[j + 1]) {  //
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[+1] = temp;
                }
            }
        }
//        printArr(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
