package JavaKnowledge.Interface.Animal.animal;

import JavaKnowledge.Interface.Animal.swimming;

public class dog extends animal implements swimming {
//注意此类为单独的实体，只定义方法   不定义测试！！再有在test中创建对象并测试；

    //要定义构造方法！
    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("狗在吃骨头！");
    }

    public void swimming() {
        System.out.println("狗刨！");
    }


}