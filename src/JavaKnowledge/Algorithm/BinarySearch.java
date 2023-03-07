package JavaKnowledge.Algorithm;

/*
      Algorithm：算法

 *    二分查找排序算法
 *   前提条件：数据要是有序的
 */

public class BinarySearch {
    public static void main(String[] args) {
        //定义一个整形数组,注：定义数组时数据类型应与[]紧贴！！
        int[] arr = {11, 23, 47, 57, 61, 75, 83, 94, 123};
        //调用二分排序算法：
        int i = BinarySearch(arr, 11);
        System.out.println("你要寻找的数在第" + (i + 1) + "位！");  //快捷键：ctrl+D：直接复制上一行粘贴到下一行

    }

    //定义二分排序算法：
    public static int BinarySearch(int[] arr, int target) {  //注意关键字Static!!
        int min = 0;
        int max = arr.length - 1;
        while (true) {
            int mid = (min + max) / 2;
            //如果min>max时，循环中止
            if (min > max) {
                return -2;
            } else if (arr[mid] > target) { //如果在中间的左边
                max = mid - 1;
            } else if (arr[mid] < target) {//如果在中间的右边
                min = mid + 1;
            } else {
                return mid;
            }
        }
    }

}
