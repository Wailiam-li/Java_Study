package JavaKnowledge.Algorithm.sort;

/**
 * ClassName:QuickSort
 * Description:   快排
 * <p>
 * 核心思想：取第一个数为基准值，将整个数组以基准值分成两堆，小于基准值的和大于基准值的，并将此基准值插入到两堆中间；
 * 具体： 从第二个索引开始为start，最后一个索引为end，都与基准值进行比较，以从小到大为例，直到满足：左边的比基准值大，
 * 右边的比基准值小，则进行start与end的对应的值交换，直到start与end相遇，则本轮结束，将基准值送入到start（end）的位置
 *
 * @Date:2024/2/27 11:47
 * @Author: 李威威
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3, 1, 6, 5, 4, 9, 2, 8, 7, 10};
        quickSort(arr, 0, arr.length - 1);

        printArr(arr);
    }

    public static void quickSort(int[] arr, int i, int j) {
        //首先
        int start = i;
        int end = j;

        /*这里这个递归的出口我不是很理解——————>针对单个小段的排序的结束条件就是：start>end,这里的start和end就是一小段排序中
          的头和尾，因此当头和尾相遇（表示这个小组排序只有一个数字了），或 头>尾时，就不用再进行排序了。
*/
        if (start >= end) {
            return;
        }

        //这里是否需要考虑基准值赋值的问题；
        int baseNum = arr[i];

        while (start != end) {
            while (true) {
                if (baseNum > arr[end] || start >= end) {  //这里第二个条件有待确认是否正确.  这里个循环主要是为了找到end这边开始的那个值
                    break;   //从末尾开始寻找，一直找到小于基准值的索引下标
                }
                end--;
            }

            while (true) {
                if (baseNum < arr[start] || start >= end) {  //注：start >= end这个条件在终止时候很重要！！
                    break;   //从头开始寻找，一直找到大于基准值的索引下标
                }
                start++;  //以上两个循环会一直循环到遇到各自的那个符合条件的值
            }
            //之后将两数交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //再把基准值归位
        int temp = arr[i];       //这里为什么是和arr[start]交换呢？——>start和end最后相等才能跳出循环，因此用start和end都是一样的。，
        arr[i] = arr[start];
        arr[start] = temp;

        //再利用此排序方法进行递归:将基准值两边的两组数组在分别调用此方法
        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
