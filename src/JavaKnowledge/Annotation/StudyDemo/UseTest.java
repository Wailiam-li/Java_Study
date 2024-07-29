package JavaKnowledge.Annotation.StudyDemo;
/*
   Annotation:注解

            以下注解的使用例子
 */


import JavaKnowledge.Annotation.StudyDemo.Annotation.MyTest01;
import JavaKnowledge.Annotation.StudyDemo.Annotation.MyTest02;

@MyTest01(name = "孙悟空",language = {"Java","Html"})
public class UseTest {

    @MyTest02("元歌")   //注：这里只有一个value属性时，可以省略'value=',若还有其他没有默认值的属性，则需要写'value='
    public void Test(){

    }

/*问：以上两个注解 写在类和方法上 有什么用呢？
*  答：通过注解的反解析扫描可以获取到在类上或方法对应的值
*/
}
