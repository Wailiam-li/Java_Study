package JavaKnowledge.DynamicProxy.Demo01;

public class Test {


    public static void main(String[] args) {
       /* 需求：
        外面的人想要大明星唱一首歌
        1．获取代理的对象—--------—>代理对象= Proxyutil.createProxy(大明星的对象);
        2．再调用代理的唱歌方法----->代理对象.唱歌的方法("只因你太美");   */

        BigStar bigStar = new BigStar("我家鸽鸽");
        Star starProxy = ProxyUtil.createProxy(bigStar); //这里把createProxy方法设为静态,表示类中可以调用!!
//        starProxy.dance();
        String result = starProxy.sing("<<只因你太美>>");
        System.out.println(result);

    }
}
