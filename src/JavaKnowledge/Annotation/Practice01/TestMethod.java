package JavaKnowledge.Annotation.Practice01;

public class TestMethod {
    @MyTest
    public void test01(){
        System.out.println("test01运行了！！");
    }


    public void test02(){
        System.out.println("test02运行了！！");
    }

    @MyTest
    protected void test03(){
        System.out.println("test03运行了！！");
    }

    @MyTest
    private void test04(){
        System.out.println("test04运行了！！");
    }

}
