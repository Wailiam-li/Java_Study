package JavaKnowledge.DynamicProxy.Demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
     用于创建代理对象。   （比较高级，值得研究）

     知识：
       java.lang.reflect.Proxy类:提供了为对象产生代理对象的万法:
          public static 0bject newProxyInstance(ClassLoader loader,
                        class<?>[]interfaces,  InvocationHandler h)
                     参数一:用于指定用哪个类加载器，去加载生成的代理类；
                    参数二:指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法；
                    参数三:用来指定生成的代理对象要干什么事情；（难点）

 */
public class ProxyUtil {

    //确定该方法的    返回值，传入参
    //传入参数：需要被代理的对象
    //返回值：返回通过该方法产生出的代理对象(因为要实现接口，所以也可以用接口类作为返回类型)

    public static Star createProxy(BigStar bigStar) {
        Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class},  //注：一般要使用new，new出来
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /*
                         *参数一:代理的对象
                         *参数二:要运行的方法 sing
                         *参数三:调用sing/dance方法时，传递的实参     */
                        if ("sing".equals(method.getName())) {
                            System.out.println("后台人员准备话筒，加收钱！！");
                        } else if ("dance".equals(method.getName())) {
                            System.out.println("后台人员准备场地，加收钱！！");
                        }
                        return method.invoke(bigStar, args);
                        //method.invoke() 表示调用大明星执行具体的唱歌\跳舞
                    }
                });

        return starProxy;
    }

}
