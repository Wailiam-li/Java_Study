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
        //1.注册驱动      Class.forName的作用：自动将这个类加载进内存，不需要调用任何方法，静态方法会自动执行；
        //Class.forName("com.mysql.cj.jdbc.Driver");  //注：里面包含注册驱动的方法： DriverManager.registerDriver（）
        /*注：以上的这行代码可以省略不写；由在驱动包中的META-INF-service下的文件中有，会自动读取这个文件，将字符串：com... 加载到对象里来；
              这个文件记录了 类驱动的名称。

         */

        //2.获取连接
        String url = "jdbc:mysql://localhost:3306/abc?useSSL=false&&serverTimezone=UTC";  //那么多事，靠！！
        //如果是本机，可以简写成jdbc:mysql:///
        String userName = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, userName, password);

        //3.定义sql语句
        String sql = "update user1 set name='李辉' where id=3";

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
