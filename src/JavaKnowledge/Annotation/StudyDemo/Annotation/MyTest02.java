package JavaKnowledge.Annotation.StudyDemo.Annotation;

/*
    关于特殊属性   value
 */

public @interface MyTest02 {
    String value();   //注：value是特殊属性，在注解后不写属性时，默认就是value
    int age() default 23;

}
