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
        ExecutorService pool= Executors.newFixedThreadPool(3);

        //提交任务
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());

        //销毁线程池： (一般不用)
//        pool.shutdown();

    }


}
