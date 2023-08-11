package JavaKnowledge.Thread;

public class MyThread extends Thread {

    //注：使用继承Thread类开启线程，一定要重写run（）方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i);//
            //Thread.currentThread().getName()：获取当前线程的名字
        }
    }


    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }
}
