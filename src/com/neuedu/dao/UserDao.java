package com.neuedu.dao;

public interface UserDao {
    void regsiter (String user,String psw);

    boolean findByusername(String name);

}
