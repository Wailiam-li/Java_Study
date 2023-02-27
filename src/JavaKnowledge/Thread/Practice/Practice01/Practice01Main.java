package JavaKnowledge.Thread.Practice.Practice01;

/*
     需求:
         某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票

 */
public class Practice01Main {
    public static void main(String[] args) {
        /*
          思路： 每个售卖窗口为一个进程，每卖一张票，线程总数减1
         */

        //创建线程任务
        Thread01 t = new Thread01();

        //创建线程（售票窗口）
        Thread t1 = new Thread(t, "窗口1");
        Thread t2 = new Thread(t, "窗口2");
        Thread t3 = new Thread(t, "窗口3");

        t1.start();
        t2.start();
        t3.start();

        /*
          问题待解决：如何让票一次次减少？  第一步：使用static关键字   第二步：
         */

    }
}
