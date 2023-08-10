package JavaKnowledge.Thread.priority;

import JavaKnowledge.Thread.MyThread;

/*
      演示优先级的使用：
              Priority：优先级
 */
public class ThreadMain01 {

    public static void main(String[] args) {
          /*
                 setPriority(int newPriority)    改置线程的优先级
                 final int getPriority()         获取线程的优先级

         */

        //创建线程执行的参数对象！！
        MyThread mt = new MyThread();

        Thread t1 = new Thread(mt, "飞机");
        Thread t2 = new Thread(mt, "坦克");

        System.out.println(t1.getPriority());  //求得当前进程的优先级数，默认是5，最小是1，最大是10；
        System.out.println(t2.getPriority());

        t1.setPriority(10);  //将飞机的优先级设置成最高，cpu优先运行 此进程概率将更大，因此飞机的进程将优先运行完
        t2.setPriority(1);

        t1.start();
        t2.start();

   /*
            final void setDaemon(boolean on)
                                     设置为守护线程。
                                     细节：当其他的非守护线程（即女神线程）执行完毕之后，守护线程会陆续结束
                                     理解:  当女神线程结束了，那么备胎也没有存在的必要了。注：是陆续结束
        */



        /*
           public static void yield()     出让线程/礼让线程
                                         理解：在一个线程使用完一次cpu后，将再次重新让多个线程抢夺cpu，
                                         使得各线程运行尽可能均衡。
                                              ！！！
         */
    }
}
