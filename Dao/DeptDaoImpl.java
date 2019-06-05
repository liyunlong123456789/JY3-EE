package com.neuedu.Dao;

import com.neuedu.pojo.Dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class DeptDaoImpl implements DeptDao{
    private SqlSessionFactory ssf;
    public DeptDaoImpl()
    {
        try {
            ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("sqlMap.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public Dept getOneDept(String id) {
        SqlSession sqlSession = ssf.openSession();
        Dept getOneDept = sqlSession.selectOne("getOneDept", id);
        return getOneDept;
    }

    @Override
    public Integer addOneDept(Dept dept) {
        SqlSession sqlSession = ssf.openSession();
        int addOneDept = sqlSession.insert("addOneDept", dept);
        sqlSession.commit();
        return addOneDept;
    }
}
