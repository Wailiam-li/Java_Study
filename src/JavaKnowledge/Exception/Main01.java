package JavaKnowledge.Exception;

public class Main01 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(arr[10]);
            //快捷：按住crtl+alt+t可以出现surround with，可以使用其中的try catch捕获异常
        } catch (ArrayIndexOutOfBoundsException e) {
            /*知识：  关于异常中getMessage()的使用：
                  返回此throwable的详细信息字符串
            */
            String message = e.getMessage();
            System.out.println(message);
            e.printStackTrace();  //
        }
        /*  知识记录：   关于printStackTrace()
               1.在catch中printStackTrace()最为常用，因为包含的异常信息最多。
               作用是：在控制台 打印 异常信息在程序中出错的位置及原因。 并且不会影响后续代码的运行！！
             2.printStackTrace（）底层利用的是System.err.println()进行输出，把(异常)信息以红色字体输出在控制台；

        */
        System.out.println("!!!!!!!!!");

        /*
          关于throw和throws,    见demo中的使用
         */


    }
}
