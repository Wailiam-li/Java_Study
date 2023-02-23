package JavaKnowledge.IO.ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamMain01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
         /*
            反序列化流：   即将序列化的对象读取到程序中
         */

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/JavaKnowledge/IO/ObjectStream/a.txt"));

        Object o1 = ois.readObject();  //注： .readObject()一次只能读一个对象

//        Student o = (Student) o1;
//        System.out.println(o.toString());
//   注：昨天的报错就要是因为没有生成序列号，大概就是继承了seriable接口后，还改了Student类里面的方法，导致类版本出现变化，出现不匹配的情况。

        System.out.println(o1);

        ois.close();
    }


}
