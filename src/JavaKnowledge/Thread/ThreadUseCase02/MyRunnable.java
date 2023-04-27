package JavaKnowledge.Thread.ThreadUseCase02;

/*
   实现方式2：   实现Runnable接口的方式进行实现

 */
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
           //获取到 当前线程的对象
            Thread t = Thread.currentThread();   //Thread.currentThread()方法！！作用是：获取当前线程对象
            System.out.println(t.getName()+"helloWorld!");
            //上两行可写成：System.out.println(Thread.currentThread().getName()+"helloWorld!");

        }

    }
}
