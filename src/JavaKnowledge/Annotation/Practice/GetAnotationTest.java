package JavaKnowledge.Annotation.Practice;

/*
    解析类/方法中的 注解

 */

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GetAnotationTest {

    @org.junit.Test    //解析类中的注解
    public void parseClass() throws ClassNotFoundException {
        Class aClass = Class.forName("JavaKnowledge.Annotation.Practice.AnnotationUse");
            //获取更具体的值
            if (aClass.isAnnotationPresent(MyTest04.class)){
                MyTest04 myTest04 = (MyTest04)aClass.getAnnotation(MyTest04.class);
                //注：要获取到值 必须进行注解类型的强转，转成MyTest04类型
                System.out.println(myTest04);
                System.out.println(myTest04.value());
                System.out.println(Arrays.toString(myTest04.bbb()));
            }

    }


    @org.junit.Test    //解析方法中的注解
    public void parseMehtod() throws ClassNotFoundException {
        Class aClass = Class.forName("JavaKnowledge.Annotation.Practice.AnnotationUse");
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            declaredMethod.setAccessible(true);
            Annotation[] declaredAnnotations = declaredMethod.getDeclaredAnnotations();
            //这里为什么没有获取到@MyTest02注解呢？？？？
            //   —————>很有可能是因为时效的问题，默认是到 CLASS (默认值)：字节码文件后就失效了！！
            for (Annotation declaredAnnotation : declaredAnnotations) {
                System.out.println("方法是："+declaredMethod+"\n"+"注解是："+declaredAnnotation);
            }
        }
    }

    @org.junit.Test    //解析类中的注解
    public void parseMethod02() throws ClassNotFoundException, NoSuchMethodException {
        Class aClass = Class.forName("JavaKnowledge.Annotation.Practice.AnnotationUse");

        Method test02 = aClass.getMethod("test02");
        //获取更具体的值
        if (test02.isAnnotationPresent(MyTest02.class)){
            MyTest02 myTest02 = test02.getAnnotation(MyTest02.class);
           // MyTest02 annotation = test02.getAnnotation(MyTest02.class);
            //注意：这里是方法.getAnnotation()
            System.out.println(myTest02);
            System.out.println(myTest02.value());  //注：这里的value只是@MyTest02的一个属性值，和下面的age一样。
            System.out.println(myTest02.age());
        }

    }

}
