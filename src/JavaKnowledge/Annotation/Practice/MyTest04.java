package JavaKnowledge.Annotation.Practice;
/*
    解析类中的注解

 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest04 {
    String value();
    double aaa() default 100;
    String[] bbb();

}
