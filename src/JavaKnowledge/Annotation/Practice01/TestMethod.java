package JavaKnowledge.Annotation.Practice01;

public class TestMethod {
    @MyTest
    public void test01() {
        System.out.println("test01运行了！！");
    }


    public void test02() {
        System.out.println("test02运行了！！");
    }

    //    @MyTest
    protected void test03() {
        System.out.println("test03运行了！！");
    }

    @MyTest
    private void test04() {
        System.out.println("test04运行了！！");
    }

    /*
     *  疑问：为什么自定义的@MyTest注解没有 启动按钮？
     *  原因是 自定义注解的@MyTest没有和idea 整合过，idea无法识别，因此只能利用main方法模拟；
     *  而 @Test注解来源与Junit框架，本身与idea内部整合过，可为idea识别；

     */

}
