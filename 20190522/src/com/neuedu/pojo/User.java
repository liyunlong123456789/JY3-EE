package com.neuedu.pojo;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class User {
    public User(Integer ID, String username, String password)
    {

    }
    public User(String username,String password,Integer ID)
    {
        this.ID = ID;
        this.username = username;
        this.password = password;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    private  Integer ID;
    private String username;
    private String password;

}