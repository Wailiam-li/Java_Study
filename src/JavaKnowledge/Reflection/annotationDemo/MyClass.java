package JavaKnowledge.Reflection.annotationDemo;

/**
 * ClassName:MyClass
 * Description:
 *
 * @Date:2025/2/7 14:18
 * @Author: 李威威
 */
public class MyClass {

    @MyAnnotation(value = "无~")
    public void myTest(){
        System.out.println("通过注解利用反射机制来调用了MyClass中的myTest方法！这样就可以利用所有标注了此注解的方法来执行某些特殊的事情！！");
    }

    public void myTest02(){
        System.out.println("看看我没有注解执行了吗？？");
    }
}
