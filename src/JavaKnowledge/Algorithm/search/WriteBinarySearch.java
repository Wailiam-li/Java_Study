package JavaKnowledge.Algorithm.search;

/**
 * @Date:2024/2/22 20:42
 * <p>
 * Description： 根据自己的思路手写二分查找
 * <p>
 * 需求:定义一个方法利用二分查找，查询某个元素在数组中的索引。数据如下: {7，23，79，81，103，127，131，147}
 * <p>
 * 关键点（核心）：要明白当比较的数更大或更小时，mid应该往哪一边移（记不住的时候可以自己写一个数组，想一个目标值，看mid应该往哪边移）
 */
public class WriteBinarySearch {

    //首先二分查找是针对有序的数组；
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int res = BinarySearch(arr, 79);
        System.out.println(res);
    }


    //定义一个二分查找的方法
    public static int BinarySearch(int[] arr, int target) {
        int min = 0;
        int max = arr.length - 1;
        while (true) {
            int mid = (min + max) / 2;
            if (arr[mid] < target) {
                min = mid + 1;
            } else if (arr[mid] > target) {
                max = mid - 1;
            } else {  //这两个数相等，则说明找到了
                return mid;
            }
            if (min > max) {
                return -1;
            }
        }

    }


}
