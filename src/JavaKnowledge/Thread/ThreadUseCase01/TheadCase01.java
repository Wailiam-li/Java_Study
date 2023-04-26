package JavaKnowledge.Thread.ThreadUseCase01;

/*
     多线程的第一种实现方式： 继承thread类
            启动方式:
                1．自己定义一个类继承Thread
                2．重写run方法
                3．创建子类的对象，并启动线程
 */

public class TheadCase01 {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();  //开启两个线程

        //给线程起名字以此区分，表明线程是交替使用的
        t1.setName("线程1：");
        t2.setName("线程2：");

        //.start()表示开启线程
        t1.start();
        t2.start();

        //李威很帅

    }
}
