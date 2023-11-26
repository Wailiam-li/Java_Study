package JavaKnowledge.Annotation.Practice01;

/*
    模拟Jnit框架
             需求：定义若干个Test方法(TestMethod类中)，只要加了@MyTest注解，就会触发该方法执行。

            思路：定义若干个加注解和不加注解的方法，在main方法对这个类中的方法进行注解判断，有该注解即运行，无则不运行


 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        TestMethod t = new TestMethod();     //创建个对象，用于下面invoke调用
        Class testMethod = Class.forName("JavaKnowledge.Annotation.Practice01.TestMethod");
        Method[] methods = testMethod.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                method.setAccessible(true);//表示临时取消访问修饰符的权限；
                method.invoke(t);   //.invoke()方法作用是调用自身的method方法执行,在调用的过程中可以将method所需要的参数传过去；
                // 由于测试方法没有参数，但又不得不传个对象进去，因此..
            }
        }
    }

}
