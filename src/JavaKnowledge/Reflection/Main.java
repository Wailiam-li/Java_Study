package JavaKnowledge.Reflection;

import JavaKnowledge.Reflection.entity.Person;
import JavaKnowledge.Reflection.entity.Student;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
     反射的作用:通过反射可以获取到一个类中的 字段 、成员方法 、构造方法 等信息
 */

public class Main {
    /*
     获取class对象的三种方式:
        1. class.forName("全类名");
        2．类名.class
        3．对象.getclass();

*/
    public static void main(String[] args) throws ClassNotFoundException {

        // 方式一:Class.forName("全类名")获得    全类名=包名+类名    注: 最为常用!!
        Class clazz1 = Class.forName("JavaKnowledge.Reflection.entity.Student");
        //   注: clazz表示 字节码文件的对象
//        System.out.println("c2.hashCode():" + c2.hashCode());
        System.out.println(clazz1);  //表示clazz是哪个类的对象

        // 方式二:通过 类名.class获得      作用:一般参数传递
        Class clazz2 = Student.class;
        System.out.println("c2.hashCode():" + clazz2.hashCode());

        // 方式三:通过对象查询
        Person person = new Student();
        Class clazz3 = person.getClass();
        System.out.println("c3.hashCode():" + clazz3.hashCode());

    }

    /*
        class类中用于获取构造方法的方法(四种常用)
    */

    @Test       //用了junit 4.8.2的jar包 才成功!!  更换junit 版本：junit4 刚开始用的junit-4.12.jar版本，但是报了以上错误，换成了其他版本junit-4.8.2.jar，测试成功
    public void getConstrustors() throws ClassNotFoundException { //获取公共的所有构造参数
        Class clazz = Class.forName("JavaKnowledge.Reflection.entity.Person");
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }
    }

    @Test     //获取所有的构造参数
    public void getDeclaredConstrustors() throws ClassNotFoundException {
        Class clazz = Class.forName("JavaKnowledge.Reflection.entity.Person");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }
    }

    @Test     //获取单个构造参数    //可以利用构造方法创建对象
    public void getDeclaredConstrustor() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Class.forName("JavaKnowledge.Reflection.entity.Person");
        Constructor c = clazz.getDeclaredConstructor(String.class);
                     //知识：这里的Declared获取所有权限的构造函数 只用于查看，要想使用来创建对象，还得加
        //这里需要与构造参数的类型对应上,例是:String name,就传String.class
        Student lw =(Student) c.newInstance( "李威");

        System.out.println(lw);

    }





    @Test     //获取所有成员变量
    public void getDeclaredFields() throws ClassNotFoundException, NoSuchMethodException {
        Class clazz = Class.forName("JavaKnowledge.Reflection.entity.Person");
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field  d:declaredFields) {
            System.out.println(d);
        }
    }



}
