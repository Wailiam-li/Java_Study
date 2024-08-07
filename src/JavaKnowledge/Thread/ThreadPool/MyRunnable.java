package JavaKnowledge.Thread.ThreadPool;

public class MyRunnable implements Runnable {


    @Override  //这里是因为实现了Runnable接口，必须实现run方法。这个run方法是它的唯一抽象方法，因为调用时必会实现？？（有待学习）
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }

    }
}
