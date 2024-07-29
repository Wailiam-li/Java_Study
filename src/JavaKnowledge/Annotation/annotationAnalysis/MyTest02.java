package JavaKnowledge.Annotation.annotationAnalysis;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest02 {
    String value();   //注：value是特殊属性，在注解后不写属性时，默认就是value，表示玩家名称

    String type() default "玩家";

}
