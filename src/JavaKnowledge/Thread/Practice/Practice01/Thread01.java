package JavaKnowledge.Thread.Practice.Practice01;


public class Thread01 extends Thread {

    //加上static关键字  表示这个类(Thread01)所有的对象(t1、t2、t3)，都共享ticket数据!!!
    //    体现了static关键字在成员变量中的使用！！！
    static int i = 100;

    //锁对象，一定是要唯一的，因此加上static关键字，表示全局共享同一个。
    static Object obj=new Object();

    @Override
    public void run() {
            while (true) {  //线程1、2、3就在这里等
                //synchronized 意为 同步代码块
                synchronized (obj) {  //  注：()中填锁对象，锁对象是任意的，但必须唯一（加上静态关键字static）
                    if (i > 0) {
                        try {   //注：这里不能抛异常而要使用try catch的原因是父类没有抛异常；
                            Thread.sleep(10);   //睡眠以后明显会使得 多个线程更均衡的抢到cpu执行权，而不会连贯的被一个线程占用
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在售票中，剩余票数:" + --i);
                        //如果不加锁，出现的情况就是，在打印输出的事时间中，其他线程也sleep完成，进行打印，使得后面来的线程
                        // 先卖前面票或者同时卖票的情况，
                    }else {
                        break;
                    }
                }
            }
    }

      /*问题提出：1.锁加在while里面，出现了while中对的条件不成立，却还执行的情况 ！！
       ——>其实应该也是线程的原因，当锁加在while里面，会有多个线程对while（i>0）进行判断，
           某个线程去执行完判断并且成立，但另一个线程先进去了执行，它就在外面等，另一个出来后，i减完了，
           之前的判断还成立，因此也进去了，就出现了while条件不成立还执行的情况。
         2. 锁加在while外面，出现了只有一个窗口售卖票的情况，因为其他线程是在while循环外面等着，如果线程1进去了
           那么它会一直运行到程序执行完！

           */

}
