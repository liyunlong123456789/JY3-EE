package com.neuedu.Dao;


import com.neuedu.pojo.Dept;

public interface DeptDao {
    //根据ID查询
    public Dept getOneDept(String id);

    //添加部门并且返回部门ID
    public  Integer addOneDept(Dept dept);

}
