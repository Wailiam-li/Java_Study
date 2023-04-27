package JavaKnowledge.Thread.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable {

    int i = 100;

    Lock lock = new ReentrantLock();  //不应该放在循环里面！！ 放外面表示一个MyRunnable对象共用一个锁

    @Override
    public void run() {
        while (true) {  //线程1、2、3就在这里等
            lock.lock();  //锁开启
            try {
                Thread.currentThread().sleep(10);   //睡眠以后明显会使得 多个线程更均衡的抢到cpu执行权，而不会连贯的被一个线程占用
                if (i > 0) {
                    //注：这里不能抛异常而要使用try catch的原因是父类没有抛异常；
                    System.out.println(Thread.currentThread().getName() + "正在售票中，剩余票数:" + --i);
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally { //解锁
                lock.unlock();
            }
        }
    }
}
