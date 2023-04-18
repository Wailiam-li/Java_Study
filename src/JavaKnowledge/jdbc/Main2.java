package JavaKnowledge.jdbc;

/*
    关于connection的用法：1.开启事务（一块成功或失败）
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {
    public static void main(String[] args) throws SQLException {
        //1.注册

        //2.获取连接
        String url = "jdbc:mysql:///abc?useSSL=false&&serverTimezone=UTC";  //那么多事，靠！！
        String userName = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, userName, password);

        String sql1 = "update user1 set password=123 where id =1";

        String sql2 = "update user1 set password=123 where id =3";

        Statement stat = conn.createStatement(); //!!!获取执行sql的对象！！

        try {
            //事务开启
            conn.setAutoCommit(false);
            //
            int coun1 = stat.executeUpdate(sql1);
            System.out.println(coun1);

            int coun2 = stat.executeUpdate(sql2);
            System.out.println(coun2);

            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            e.printStackTrace();

        }


    }

}
