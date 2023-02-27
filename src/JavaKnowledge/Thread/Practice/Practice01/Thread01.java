package JavaKnowledge.Thread.Practice.Practice01;

public class Thread01 extends Thread {

    //加上static关键字  表示这个类所有的对象，都共享ticket数据!!!

    static int i = 100;

    @Override
    public void run() {
        while (i != 0) {
            System.out.println(Thread.currentThread().getName() + ":" + i--);

        }
    }
}
