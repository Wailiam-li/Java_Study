package JavaKnowledge.Algorithm.sort;

/**
 * @Date:2024/2/25 17:12
 * <p>
 * Description：选择排序，实际上和冒泡排序差不多，是拿着一个数与后面的逐一比较，以小到大为例，遇到比自己的小的数，就交换位置，
 * 一共进行n-1轮
 */
public class SelectionSort {

    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {2, 4, 5, 3, 1};

        for (int i = 0; i < arr.length; i++) { //表示一共需要进行几轮
            for (int j = 1 + i; j < arr.length; j++) { //表示每一轮进行选出最大的数移到最右边。
                // 注：这里的j=i+1，表示每一轮只需要在上一轮基础上 往后 比较即可
                if (arr[i] > arr[j]) {  //
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
