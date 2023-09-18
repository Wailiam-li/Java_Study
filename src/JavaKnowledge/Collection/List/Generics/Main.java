package JavaKnowledge.Collection.List.Generics;

/**
 * @Date:2023/9/17 17:23
 * <p>
 * Generics：泛型
 * <p>
 * 演示   自定义的泛型及使用
 */
public class Main {

    public static void main(String[] args) {
        //这里String就相当于 传入到泛型的T
        MyArrayList<String> list = new MyArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("ghi");

        System.out.println(list.get(0));
        System.out.println(list);  //打印出有null值是因为初始化数组时大小为10

    }

}
