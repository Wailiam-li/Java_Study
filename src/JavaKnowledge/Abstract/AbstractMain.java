package JavaKnowledge.Abstract;

/**
 * @author Liweiwei
 * @Date 2024/10/11 20:50
 * @Description :
 */
public class AbstractMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.eat();
        student.sleep();

        Teacher teacher = new Teacher();
        teacher.eat();
        teacher.sleep();
    }


}
