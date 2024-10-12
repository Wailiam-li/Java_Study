package JavaKnowledge.Interface.Animal.animal;

import JavaKnowledge.Interface.Animal.swimming;

public class fog extends animal implements swimming {


    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }

    @Override
    public void swimming() {
        System.out.println("青蛙在蛙泳！");
    }
}
