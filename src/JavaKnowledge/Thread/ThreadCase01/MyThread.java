package JavaKnowledge.Thread.ThreadCase01;


public class MyThread extends Thread {

    // 2．重写run方法
    @Override
    public void run() {
        //书写线程要执行的代码
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "hello World!");  //注：这里使用getName()可以直接得到线程的名字？
        }
    }
}
