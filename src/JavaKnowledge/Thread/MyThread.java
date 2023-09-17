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

    //因为子类无法继承父类的构造方法，因此这里利用super关键字调用父类（Thread）的构造
    public MyThread(String name) {
        super(name);
    }
}
