package com.neuedu.Dao;

import com.neuedu.dataSource.DruidDataSource;
import com.neuedu.pojo.User;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
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
    //修改
    @Override
   public void update(Integer ID, String username, String password) {
//        String str = "UPDATE  user SET username = ? ,password = ? WHERE ID = ?";
//        Connection connention = dds.getConnention();
//        try {
//             qr.update(connention,str,username,password,ID);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                DbUtils.close(connention);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
   }
    //删除
    @Override
    public void delete(Integer ID) {

    }
}
