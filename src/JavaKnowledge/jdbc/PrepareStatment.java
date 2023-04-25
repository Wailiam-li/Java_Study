package JavaKnowledge.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;

/*
    PrepareStatment类：
           作用：1.预编译SQL，使得性能提升；（预编译是模板，重复使用相同的sql语句可以提升效率）
               2.用来防止SQL注入；原理是：编译时，会对每一个 '(敏感字符) 进行转义，使得非法拼接的SQL语句不成立（形成错误的SQL语句）；
 */
public class PrepareStatment {
    public static void main(String[] args) throws SQLException {
        //注册驱动
        //获取链接
        String name = "root";
        String pwd = "root";                     //在获取连接时进行 预编译开启：useServerPrepStmts=true
        String url = "jdbc:mysql:///abc?useSSL=false&&serverTimezone=UTC&useServerPrepStmts=true";

        Connection conn = DriverManager.getConnection(url, name, pwd);

        //定义SQL语句
        String sql = "select * from user1 where name=? and password=? ";

        //获取执行对象
        PreparedStatement pstmt = conn.prepareStatement(sql);
        String name1 = "李威";
        //String password = "'or '1'='1 ";
        String password = "123";

        pstmt.setString(1, name1);
        pstmt.setString(2, password);
        // PreparedStatement stm=conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();  //注意：这里不需要执行SQL语句了，获取SQL对象的时候已经将值传进去了；

        //输出
        if (rs.next()) {   //注意要使用rs.next()！！ 不然是从表头开始读取！！！
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
        }
        //释放资源！！
        rs.close();
        pstmt.close();
        conn.close();


    }


}
