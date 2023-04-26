package JavaKnowledge.Thread.ThreadUseCase01;


public class MyThread extends Thread {

    // 2．重写run方法
    @Override
    public void run() {
        //书写线程要执行的代码
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "hello World!");  //问：这里使用getName()可以直接得到线程的名字？
        }                                                  //注：getName()是在Thread类中的，因此在子类中可以调用


    }
}
