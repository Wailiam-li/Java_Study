package JavaKnowledge.Thread.ThreadPool;

/*
     演示线程池的部分方法使用：

           该线程池是通过Java的工具类：Executors类进行获取的
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        //获取线程池对象                  创建有上线的线程池
        ExecutorService pool = Executors.newFixedThreadPool(4);

        //      ExecutorService pool = Executors.newCachedThreadPool();  // 创建无上线的线程池，理论上是无线的

        //提交任务
        pool.submit(new MyRunnable());  // 这里相当于 给线程池提交 多个MyRunnable任务，使每一个线程池都去执行。
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());

        //销毁线程池： (一般不用)
//        pool.shutdown();


        //想要演示线程复用的情况，只需要将任务设置的简单一些，然后任务执行完将主线程睡眠休息，再次调用时就还会是同一个线程来执行
        /**
         *   pool.submit(简单任务);
         *   Thread.sleep(1000);    //单位是毫秒
         *   pool.submit(简单任务);
         *    Thread.sleep(1000);
         *
         */

    }


}
