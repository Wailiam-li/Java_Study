package ALL.Interface.Animal;

import ALL.Interface.swimming;

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
