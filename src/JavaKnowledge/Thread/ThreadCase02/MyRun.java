package JavaKnowledge.Thread.ThreadCase02;

public class MyRun implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
           //获取到 当前线程的对象
            Thread t = Thread.currentThread();   //Thread.currentThread()方法！！
            System.out.println(t.getName()+"helloWorld!");
            //上两行可写成：System.out.println(Thread.currentThread().getName()+"helloWorld!");

        }

    }
}
