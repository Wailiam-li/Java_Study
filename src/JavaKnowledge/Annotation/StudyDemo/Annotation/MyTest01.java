package JavaKnowledge.Annotation.StudyDemo.Annotation;

/*
    演示一下注解的使用 ：
              注解当中可以定义属性
 */

public @interface MyTest01 {
    String name();    //注意后面要加上'()'
    boolean trueOr() default true;
    String[] language();

}
