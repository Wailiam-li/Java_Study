package JavaKnowledge.Thread.Practice.Practice02;

public class MyRunnable implements Runnable{

    int i=100;

    @Override
    public void run() {
        while (true) {
            if (method()) {break;}
        }
    }

   //此方法是非静态的，非静态的锁对象是this，指的测试类中是mr，对象唯一，因此锁对象唯一
    private synchronized boolean method(){
        if (i > 0) {
            try {   //注：这里不能抛异常而要使用try catch的原因是父类没有抛异常；
                Thread.sleep(10);   //睡眠以后明显会使得 多个线程更均衡的抢到cpu执行权，而不会连贯的被一个线程占用
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在售票中，剩余票数:" + --i);
            //如果不加锁，出现的情况就是，在打印输出的事时间中，其他线程也sleep完成，进行打印，使得后面来的线程
            // 先卖前面票或者同时卖票的情况，
            return false;
        }else {
            return true;
        }
    }

}
