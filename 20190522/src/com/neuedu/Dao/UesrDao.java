package com.neuedu.Dao;

import com.neuedu.pojo.User;

import java.util.List;

public interface UesrDao {
    //查询
    List<User> getAllUser();
    //修改
    void update(Integer ID,String username,String password);
    //删除
    void delete(Integer ID);
}
