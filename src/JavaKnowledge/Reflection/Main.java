package JavaKnowledge.Reflection;

import JavaKnowledge.Reflection.entity.Person;
import JavaKnowledge.Reflection.entity.Student;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
        Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
        //知识：这里的Declared获取所有权限的构造函数 只用于查看，要想使用来创建对象，还得加
        //这里需要与构造参数的类型对应上,例是:String name,就传String.class

        c.setAccessible(true);  //暴力反射：表示临时取消权限的校验
        Person lw = (Person) c.newInstance("李威", 17);

        System.out.println(lw);

    }


    @Test     //获取所有成员变量
    public void getDeclaredFields() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException {
        Class clazz = Class.forName("JavaKnowledge.Reflection.entity.Person");
        Field[] declaredFields = clazz.getDeclaredFields();
        Person person = new Person("liwei", 17);  //用于获取值
        for (Field d : declaredFields) {
            System.out.println("字段相关：" + d);

            //获取权限修饰符
            int modifiers = d.getModifiers();
            System.out.println("权限修饰符:" + modifiers);    //其中0表示空（即没有修饰符），2表示private

            //获取字段名
            System.out.println("字段名:" + d.getName());

            //获取成员变量的值：要在前面先赋值，后获取
            d.setAccessible(true);
            Object o = d.get(person);
            System.out.println("成员变量的值:" + o);

        }


    }


    @Test     //获取所有成员方法
    // 注：getMethods()会获取到包含了父类中所有的公共方法。 getDeclaredMethod() 则不会
    public void getDeclaredMethods() throws ClassNotFoundException, NoSuchMethodException {
        Class clazz = Class.forName("JavaKnowledge.Reflection.entity.Person");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }


    @Test     //获取某个单一成员方法
    public void getMethod() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = Class.forName("JavaKnowledge.Reflection.entity.Person");
        Method method = clazz.getMethod("eat", String.class);
        //这里为了防止方法重载，所以需要传方法名及形参类型
        System.out.println(method);

        //获取该方法抛出的异常
        Class<?>[] exceptionTypes = method.getExceptionTypes();
        for (Class<?> exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }


        //重难点！！！ 方法运行:即获取到成员方法后让它运行起来
      /* Method类中用于创建对象的方法
       object invoke(Object obj, object. . . args):运行方法
       参数一:用o的对象调用该方法
       参数二:调用方法的传递的参数（如果没有就不写)
       返回值:方法的返回值（如果没有就不写)  */

        Person person = new Person();

        // 参数一s:表示方法的调用者
        // 参数二"烧烤":表示在调用方法的时候传递的实际参数
        method.setAccessible(true);  //取消权限
        Object shaokao = method.invoke(person, "烧烤");  //即可使eat()方法运行
        System.out.println(shaokao);  //返回值为null

    }
}
