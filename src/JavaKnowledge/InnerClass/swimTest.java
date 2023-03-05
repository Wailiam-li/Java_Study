package JavaKnowledge.InnerClass;

public class swimTest {

    public static void main(String[] args) {  //为啥老是忘记写main方法！！


        //匿名内部类
        new swim() {
            @Override
            public void swim() {
                System.out.println("重写了游泳方法！");
            }
        };  //注：这里相当于只是创建了一个对象而已；由于没有被调用，因此无打印结果。


        //以前的办法：创建一个子类去继承Animal类，在创建对象传递给method方法
//        Dog d = new Dog();
//        method(d);   //！！！这里可以这样调用！！

        //而现在有了匿名函数类，就不用去麻烦为了得到一个对象创建一个类了
        method(  //这里相当于调用下面的method方法

                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头！！！");
                    }
                }  //这里就相当于创建了一个对象！！

        );


    }

    //注：因为上面已经是一个main方法，因此不能在其中再写方法！！
    //下面我们创建一个方法直接进行调用
    public static void method(Animal a) { //方法的参数是一个类！
        a.eat();
    }

}
