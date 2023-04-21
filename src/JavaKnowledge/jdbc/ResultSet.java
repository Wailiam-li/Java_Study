package JavaKnowledge.jdbc;

/*

 */

import JavaKnowledge.jdbc.entity.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ResultSet {

    public static void main(String[] args) throws SQLException {

        //注册驱动

        //获取连接
        String url = "jdbc:mysql:///mysql_study?useSSL=false&&serverTimezone=UTC";  //那么多事，靠！！
        String userName = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, userName, password);
        //定义sql语句
        String sql = "select * from user";

        //获取执行对象
        Statement sta = conn.createStatement();

        //执行sql语句
        java.sql.ResultSet rs = sta.executeQuery(sql);

        List<User> users=new ArrayList<>();
        //处理结果
        while (rs.next()) {
            User user1=new User();
            int id = rs.getInt("id");
            String name = rs.getString("name_");
            String password1 = rs.getString("password");
            System.out.println(id + " " + name + " " + password1);

            user1.setId(id);
            user1.setName(name);
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
