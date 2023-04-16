package JavaKnowledge.jdbc;

/*
    jdbc连接的常规代码：    注：前提是导入对应的jar包（驱动）
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.获取连接
        String url = "jdbc:mysql://localhost:3306/abc?useSSL=false&&serverTimezone=UTC";  //那么多事，靠！！
        String userName = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, userName, password);

        //3.定义sql语句
        String sql = "update user1 set name='李威' where id=4";

        //4.获取执行sql的对象
        Statement stm = conn.createStatement();

        //5.执行sql语句
        int count = stm.executeUpdate(sql);

        //6.处理结果
        System.out.println(count);

        //7.释放资源
        stm.close();
        conn.close();


    }


}
