package com.neuedu.Dao;

import com.neuedu.pojo.Dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class GetData {
    public static void main(String[] args) {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        try {
            SqlSessionFactory build = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("sqlMap.xml"));
            SqlSession sqlSession = build.openSession();
            Dept getOneDept = sqlSession.selectOne("getOneDept", "2");
            System.out.println(getOneDept);
            sqlSession.close();
        } catch (IOException e) {

        }
    }
}
