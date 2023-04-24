package JavaKnowledge.jdbc;


import JavaKnowledge.jdbc.entity.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
    演示SQL注入问题：
               方法：主要根据在密码中 输入特定的SQL语句 用来拼接SQL 以达到用来获取 数据库中数据的目的
 */
public class SQLInject {

    public static void main(String[] args) throws SQLException {

        //注册驱动

        //获取连接
        String url = "jdbc:mysql:///abc?useSSL=false&&serverTimezone=UTC";
        String userName = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, userName, password);

        //定义sql语句
        String name="vsdvrwr";
        String pwd="'or '1' ='1";
        /*变量拼接问题：首先要保证在SQL中这个是字符串，所以要有“”，再往外拼接;注意：这里的name是个变量，因此不应该
                      直接两边加“”，这样就直接变成Java中的字符串了，

        * */
        String sql = "select * from user1 where name_='"+name+"'and password='"+pwd+"'";

        //获取执行对象
        Statement sta = conn.createStatement();

        //执行sql语句
        java.sql.ResultSet rs = sta.executeQuery(sql);


        List<User> users=new ArrayList<>();
        //处理结果
        while (rs.next()) {
            User user1=new User();
            int id = rs.getInt("id");
            String name1 = rs.getString("name_");
            String password1 = rs.getString("password");
            System.out.println(id + " " + name + " " + password1);

            user1.setId(id);
            user1.setName(name1);
            user1.setPassword(password1);
            users.add(user1);
        }
        //这里也可以创建对象，将值塞到对象里面，将对象加入集合中，最后输出集合；
        System.out.println(users);
        //释放链接
        sta.close();
        conn.close();

    }


}
