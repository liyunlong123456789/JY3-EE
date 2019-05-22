package com.neuedu.Test;

import com.neuedu.pojo.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.jws.soap.SOAPBinding;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        test(1,2,3,4,5);
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/20190517","root","123456");
            QueryRunner queryRunner = new QueryRunner();
            //添加
//            String sql = "INSERT INTO user (username,password) VALUES(?,?)";
//            int i = queryRunner.update(connection, sql, "赵六", "123456");
            //修改
//            String sql = "UPDATE  user SET password = ? WHERE ID = ?";
//            int i = queryRunner.update(connection, sql, "123123", 6);
            //删除
//            String sql = "DELETE FROM user WHERE ID = ?";
//            int i = queryRunner.update(connection, sql,6);
//            System.out.println(i);
            //全部查询
           // String sql = "SELECT * FROM user";
//           List<User>lists = queryRunner.query(connection,sql,new BeanListHandler<>(User.class));
//            System.out.println(lists);
            //根据条件查询
            String sql = "SELECT * FROM user WHERE ID = ?";
            User lists = queryRunner.query(connection,sql,new BeanHandler<>(User.class),4);
            System.out.println(lists);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }


    }
//    public static void test(Object...nums)
//    {
//        for (Object i :nums)
//        {
//            System.out.println(i);
//        }
//    }
}
