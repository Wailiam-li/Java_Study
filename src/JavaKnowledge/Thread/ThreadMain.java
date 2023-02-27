package JavaKnowledge.Thread;

/*
     多线程相关
 */

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        /*
        常用的成员变量方法：
                  String getName()     //返回线程的名称
                  void setName()      //设置线程的名字
                                  细节：1.如果没有设置名字，线程也是有默认的名字的，
                                          格式：Thread-X（X是序号，从0开始）
                                       2.不仅setName可以设置名字，构造方法也可以设置名字——>重写父类的构造方法

                  static Thread currenThread()   //获取当前线程对象
                                细节：其中有一条线程就做main，作用就是调用并执行main里面的方法。

                  static void sleep()  //让线程休眠
                                 细节：1.那条线程执行到这个方法，哪条线程就会在这里停留对应的时间。
         */

        //sleep()使用
        System.out.println("111111111111");
        Thread.sleep(5000);
        System.out.println("222222222222");

    }


}
