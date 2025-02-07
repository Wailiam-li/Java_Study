package JavaKnowledge.Reflection.annotationDemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ClassName:MyMain
 * Description:
 *
 * @Date:2025/2/7 14:21
 * @Author: 李威威
 */
public class MyMain {

    public static void main(String[] args) throws Exception {
        // 获取MyService类的Class对象
        Class<?> clazz = null;
        try {
            clazz = Class.forName("JavaKnowledge.Reflection.annotationDemo.MyClass");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // 获取所有声明的方法
        Method[] methods = clazz.getDeclaredMethods();

        // 遍历方法，查找带有MyAnnotation注解的方法
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                // 获取注解实例
                MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
                // 打印注解的描述信息
                System.out.println("Method: " + method.getName() + ", Value: " + annotation.value());
                // 在这里添加根据注解配置行为的逻辑
                // 例如，调用方法或执行其他特殊逻辑
                method.invoke(clazz.getDeclaredConstructor().newInstance());
            }
        }

    }
}
