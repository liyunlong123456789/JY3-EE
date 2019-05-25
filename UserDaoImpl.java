package com.neuedu.Dao;

import com.neuedu.dataSource.DruidDataSource;
import com.neuedu.pojo.User;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UesrDao{
    private QueryRunner qr = null;
    private DruidDataSource dds = DruidDataSource.getDataSource();
    public UserDaoImpl()
    {
        //初始化QueryRunner对象
        qr = new QueryRunner();
    }
    //查询
    @Override
    public List<User> getAllUser() {
        String sql = "SELECT * FROM user";
        List<User> users = null;
        Connection connention = dds.getConnention();
        try {
           users =  qr.query(connention,sql,new BeanListHandler<>(User.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(connention);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return users;
    }
    //增加
    @Override
    public void insert(User user) {
        Connection connention = dds.getConnention();
        String str = "INSERT INTO user values (?,?,?,now())";
        try {
            qr.update(connention,str,user.getUser_id(),user.getUser_name(),user.getUser_password());
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(connention);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    //登录判断
    @Override
    public boolean findAll(User user) {
        Connection connention = dds.getConnention();
        PreparedStatement preparedStatement = null;
        try {
             preparedStatement = connention.prepareStatement("select  user_name,user_password from user where user_name = ? and  user_password = ?");
             preparedStatement.setString(1,user.getUser_name());
             preparedStatement.setString(2,user.getUser_password());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
            {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(connention);
            } catch (SQLException e) {
                e.printStackTrace();
            }try {
                DbUtils.close(preparedStatement);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    //注册判断
    @Override
    public boolean findname(String string) {
        Connection connention = dds.getConnention();
        String str = "select user_name from user where user_name = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
             preparedStatement = connention.prepareStatement(str);
            preparedStatement.setString(1,string);
             resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(connention);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                DbUtils.close(preparedStatement);
            } catch (SQLException e) {
                e.printStackTrace();
            }try {
                DbUtils.close(resultSet);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return  false;
    }


}
