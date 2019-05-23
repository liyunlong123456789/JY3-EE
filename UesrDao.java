package com.neuedu.Dao;

import com.neuedu.pojo.User;

import java.util.List;

public interface UesrDao {
    //查询
    List<User> getAllUser();
    //修改
    void update(User user);
    //删除
    void delete(Integer ID);
}
