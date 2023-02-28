package JavaKnowledge.Thread.Practice.Practice01;

import lombok.SneakyThrows;

public class Thread01 extends Thread {

    //加上static关键字  表示这个类所有的对象，都共享ticket数据!!!
    static int i = 100;

    //锁对象，一定是要唯一的，因此加上static关键字，表示全局共享同一个。
    static Object obj=new Object();

    @Override
    public void run() {
        //同步代码块
        while (i > 1) {           //大于2是为了控制？？   没太明白为什么填0不行？  当大于1时，即2进入循环，打印出2，后i为1，应该就不会进入循环了呀
            synchronized (obj) {  //  注：()中填锁对象，锁对象必须唯一
                System.out.println(Thread.currentThread().getName() + ":" + i--);
                try {
                    Thread.sleep(10);   //睡眠以后明显会使得 多个线程更均衡的抢到cpu执行权，而不会连贯的被一个线程占用
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
