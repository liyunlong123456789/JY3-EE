package com.neuedu.Dao;

import com.neuedu.pojo.User;

import java.util.List;

public interface UesrDao {
    //查询
    List<User> getAllUser();
    //增加
    void insert(User user);
    //登录判断
   boolean findAll(User user);
    //注册判断
   boolean findname(String  string);
}
