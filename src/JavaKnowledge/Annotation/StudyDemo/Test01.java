package JavaKnowledge.Annotation.StudyDemo;


import JavaKnowledge.Annotation.StudyDemo.Annotation.MyTest03;

@MyTest03
public class Test01 {

    /*@MyTest03中用了@Target(ElementType.TYPE)，意为只能用在类上，用在此处就会报：
                                   ' @MyTest03' not applicable to method
       要想使用到方法上，@Target加上 'ElementType.METHOD'即可。  默认没加@Target应该是所有都可以用
     */
    @MyTest03()
    public void test(){}





}
