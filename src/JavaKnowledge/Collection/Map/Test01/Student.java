package JavaKnowledge.Collection.Map.Test01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
//@EqualsAndHashCode      //需要重写equals和hashcode，
/*
 *   学生实体类
 */
public class Student {
    private String name;
    private int age;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public String toString() {   // ！！之前没写这个因此没打印出字符！！
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
