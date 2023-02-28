package JavaKnowledge.Static;

/*
   知识点不在这里，在word文档中！！！
 */
public class StaticMain {
    static int i=0;

    public static void main(String[] args) {
        /*
          //这里是为什么呢？？  系统提示要么把main方法的static去掉，要么把下面的两个方法都设成static
         系统提示：Non-static method 'fangfa01 (int)' cannot be referenced from a static context
                  即在静态的方法中只能调用静态的方法，非静态方法不能在静态上下文中。

         */
        fangfa01(i);
        fangfa02(i);
        System.out.println(i);  //注意：！！！！由于i是静态的，因此打印出来的还是最原始的静态i
    }

    private static void fangfa01(int i){     //没太搞明白这里！！！  可以再看下static篇的讲解
        i--;
    }

    private static void fangfa02(int i){
        i--;
    }
}
