package JavaKnowledge.Annotation.Practice01;

/*
    模拟Jnit框架
             需求：定义若干个方法，只要加了MyTest注解，就会触发该方法执行。
                分析：定义若干个加注解和不加注解的方法，在main方法对这个类中的方法进行注解判断，有该注解即运行，无则不运行
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        TestMethod t=new TestMethod();     //创建个对象，用于下面invoke调用
        Class testMethod = Class.forName("JavaKnowledge.Annotation.Practice01.TestMethod");
        Method[] methods = testMethod.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)){
                method.setAccessible(true);
                method.invoke(t);
            }
        }
    }

}
