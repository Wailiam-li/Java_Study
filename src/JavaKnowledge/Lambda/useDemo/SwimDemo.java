package JavaKnowledge.Lambda.useDemo;


/*
    演示lambda表达式的由来及基本使用
 */
public class SwimDemo {
    public static void main(String[] args) {

        //先用匿名内部类调用下面的方法：
        method(
                new Swimming() {
                    @Override
                    public void swimming() {
                        System.out.println("有美女在游泳！！");
                    }
                }

        );


        //下面用lambda表示式书写。    若不会写可以先写匿名内部类的写法，再省略其中的部分就是lambda表达式！！
        method(
                () -> {
                    System.out.println("小狗在游泳！");  //问：为什么接口是要写在下面？——>也可以写在定义接口中
                }
                //这里可以解释为什么只能用在函数式接口当中了，因为省略了调用的唯一一个抽象方法名，如果还有其他
                //  抽象方法的话，使用lambda省略名字就会出现歧义！！
        );

        //以上是没有参数的，有参数和return的可以省略更多！


        //最简
        method(() -> System.out.println("小狗在游泳！"));  //问：为什么接口是要写在下面？——>也可以写在定义接口中


    }


    public static void method(Swimming s) { //方法的参数是一个类！
        s.swimming();
    }

//     注：接口 Swimming  后面没有‘（）’！！
//        public abstract void swimming();
//    }


}
