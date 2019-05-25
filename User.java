package com.neuedu.pojo;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.sql.Date;

public class User {

    private  String user_id;
    private String user_name;
    private String user_password;
    private Date user_date;

    public User() {
    }

    public User(String user_id, String user_name, String user_password, Date user_date) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_date = user_date;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Date getUser_date() {
        return user_date;
    }

    public void setUser_date(Date user_date) {
        this.user_date = user_date;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_date=" + user_date +
                '}';
    }
    public  User (String user_id,String user_name,String user_password)
    {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_password = user_password;
    }
    public User (String user_name,String user_password)
    {
        this.user_name = user_name;
        this.user_password = user_password;
    }
}
