package JavaKnowledge.JavaBean;

public class simpleDemo {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String sex;
    private String email;

    public simpleDemo() {
        System.out.println("看看我执行了吗？");
    }

    public simpleDemo(String a) {
        System.out.println(a);
    }


}
