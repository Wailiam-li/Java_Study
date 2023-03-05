package JavaKnowledge.DynamicProxy.Demo01;

public interface Star {

    //把所有想要被代理的方法定义在接口当中

    public abstract String sing(String songName);

    public abstract void dance();


}
