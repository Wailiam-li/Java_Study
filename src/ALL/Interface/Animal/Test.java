package ALL.Interface.Animal;

public class Test {

    public static void main(String[] args) {
        //创建青蛙对象
        dog d = new dog("小2", 12);
        System.out.println("小狗名字是：" + d.getName());
        System.out.println("小狗年龄是：" + d.getAge());
        d.eat();
        d.swimming();
    }


}
