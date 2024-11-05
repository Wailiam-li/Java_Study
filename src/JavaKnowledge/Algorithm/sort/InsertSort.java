package JavaKnowledge.Algorithm.sort;

/**
 * @Date:2024/2/26 21:09
 * <p>
 * Description：插入排序
 * 核心思想是：先找出前面一组有顺序的一组,作为有序的；再把后面无序的作为一组,逐个遍历无序组当中的元素,
 * 将一个个插入到有序数组当中
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        int startIndex = -1; //初始化 无序组的索引位置
        for (int i = 0; i < arr.length; i++) { //以从小到大为例
            if (arr[i] > arr[i + 1]) { //说明就到了无序的索引位置了（以从小到大为例，如果前一个数大于后一个数，说明i+1位置就是无序的启动位置）
                startIndex = i + 1;
                break;
            }
        }

        //取到了无序的开始索引位置后,逐个遍历,将无序的元素插入有序组当中
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;   //这里j后面是需要移动的，表示在前面的有序组当中需要往前移找到适合无序元素适合的位置，因此需要i赋值给它

            //这个j是用来使当前元素需要往前移多少的; 注：这里应该是j=i,因为如果赋值给startIndex,每次i的循环中j值是不变的,因此必须赋值给i,使得每次循环当中j值往后开始比较

            while (j > 0 && arr[j] < arr[j - 1]) {//这里加一个while循环,表示它需要一直往前移直到遇到比它小的位置
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                //每次与一个元素交换完位置后,继续往前比较,因此改变j值,继续往前比较
                j--;
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
