package JavaKnowledge.Thread.Lock;

/*
      锁的使用演示:
         注意点： 锁是一个接口，无法实例化；

 */




public class Main {
    public static void main(String[] args) {

        MyRunnable mr=new MyRunnable();

        Thread t1=new Thread(mr,"窗口1");
        Thread t2=new Thread(mr,"窗口2");
        Thread t3=new Thread(mr,"窗口3");

        t1.start();
        t2.start();
        t3.start();




    }

}
