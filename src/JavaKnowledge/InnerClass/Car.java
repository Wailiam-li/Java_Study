package JavaKnowledge.InnerClass;

public class Car {
    String carName;
    int carAge;
    String carColor;

    public void show() {
        //  System.out.println(engineAge);
    }

    class Engine {
        String engineName;
        int engineAge;

        public void show() {
            System.out.println(carName);    //内部类可以直接访问外部类；外部类要访问内部类必须 在外部类 创建对象。
        }


    }
}
