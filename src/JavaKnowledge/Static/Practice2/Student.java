package JavaKnowledge.Static.Practice2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data             //注：@Data 注解只提供类的get、 set、 equals、 hashCode、 toString等方法，不提供构造方法！！！！
@AllArgsConstructor
@NoArgsConstructor

public class Student implements Serializable {
    private static final long serialVersionUID = 6115832161017809559L;

    private String name;
    private int age;
    private String gender;


}
