package JavaKnowledge.Thread.ThreadUseCase02;

public class ThreadCase02Main {
    public static void main(String[] args) {

        //创建MyRun对象,表示多线程要执行的任务
        MyRunnable mr = new MyRunnable();

        //创建线程对象
        Thread t1 = new Thread(mr);     //注：这里需要把任务放进去
        Thread t2 = new Thread(mr);

        //给线程设置名字
        t1.setName("线程1：");
        t2.setName("线程2：");

        //开启线程
        t1.start();
        t2.start();


    }
}
