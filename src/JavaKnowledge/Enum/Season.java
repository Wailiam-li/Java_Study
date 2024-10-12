package JavaKnowledge.Enum;

/**
 * @author Liweiwei
 * @Date 2024/9/16 21:04
 * @Description : 季节枚举类
 */
public enum Season {

    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "夏日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "冬至");

    private final String name;
    private final String desc;

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }


}
