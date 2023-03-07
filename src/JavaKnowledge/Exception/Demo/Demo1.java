package JavaKnowledge.Exception.Demo;

/*
   关于throw和throws的使用 案例:求数组中的最大值
 */
public class Demo1 {
    public static void main(String[] args) {
//        int[] arr= {1,2,3,4,5,6};
        int[] arr = {};
        int max = getMax(arr);
        System.out.println("!!!!!!!!!!!!");  // 如果前面有异常，这句将不会执行
        System.out.println(max);
    }

    public static int getMax(int[] arr) {
        if (arr == null) {
            throw new NullPointerException();  //知识： 利用throw抛出异常，
        }
        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
