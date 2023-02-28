package JavaKnowledge.Static.Practice2;

import java.util.ArrayList;
import java.util.List;

public class StudentMaxAge {

    public static int StudentMaxAge(List<Student> s) {
        //使用流遍历集合,可获取最大值
        //int maxAge = s.stream().map(s -> s.getAge());   //我记得可以通过lambda表达式直接获取!!问题是我记不住
        //考虑用增强的for：
        ArrayList<Integer> ageList = new ArrayList<>();
        for (Student student : s) {
            ageList.add(student.getAge());
        }
        //求出集合中的最大值:1.通过集合中索引比较   2.能不能转为数组比较？
        int maxAge = ageList.get(0); //List集合有序，因此下面的遍历也不会乱
        for (int i = 0; i < ageList.size(); i++) {
            if (ageList.get(i) > maxAge) {        //
                maxAge = ageList.get(i);
            }
        }
        return maxAge;

    }

}
