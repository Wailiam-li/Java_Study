package JavaKnowledge.DynamicProxy.Demo01;

public class BigStar implements Star {

    private String name;


    @Override
    public String sing(String songName) {
        System.out.println(this.name + "正在唱歌:" + songName);
        return "thank you!";
    }

    @Override
    public void dance() {
        System.out.println("正在跳舞！");
        ;
    }

    public BigStar() {
    }

    public BigStar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
