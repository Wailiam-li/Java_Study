package JavaKnowledge.Reflection.annotationDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName:MyAnnotation
 * Description:
 *
 * @Date:2025/2/7 14:17
 * @Author: 李威威
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) // 注解适用于方法
public @interface MyAnnotation {
    String value() default "hello";
}
