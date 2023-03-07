package JavaKnowledge.Annotation.StudyDemo.Annotation;

/*
    两个元注解的演示使用：@Target    @Retention

 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/*
      知识：  ElementType 枚举可取值：               RetentionPolicy枚举可取值：
                            TYPE,类，接口                  SOURCE:只作用在源码阶段，字节码文件中不存在。
                            FIELD,成员变量                 CLASS (默认值):保留到字节码文件阶段，运行阶段不存在。
                            METHOD，成员方法               RUNTIME (开发常用):直保留到运行阶段。
                            PARAMETER,方法参数
                            CONSTRUCTOR,构造器
                            LOCAL_ VARIABLE,局部变量
 */

@Target({ElementType.TYPE,ElementType.METHOD})    //表示MyTest03注解只能在类、方法上使用
@Retention(RetentionPolicy.RUNTIME)              //表示一直保留到运行时
public @interface MyTest03 {
}
