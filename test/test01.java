package com.neuedu.test;

import com.neuedu.Dao.DeptDao;
import com.neuedu.Dao.DeptDaoImpl;
import com.neuedu.pojo.Dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class test01 {
    private DeptDao deptDao;
    @Before
    public void before()
    {
        deptDao = new DeptDaoImpl();
    }
    @Test
     public  void  test()
     {

         //增  删  改  查
//         SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//         try {
//             SqlSessionFactory build = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("sqlMap.xml"));
//             SqlSession sqlSession = build.openSession();
//             //模糊查询
////             Dept getOneDept = sqlSession.selectOne("getOneByName", "后");
////             System.out.println(getOneDept);
//             //查询所有
////             List<Dept> getAll = sqlSession.selectList("getAll");
////             System.out.println(getAll);
//             //添加
////             Dept dept = new Dept("3","财务部","王五");
////             int addOne = sqlSession.insert("addOne", dept);
////             System.out.println(addOne);
////             sqlSession.commit();
//             //修改
////             Dept dept = new Dept("3","高层部","马云");
////             int updateOne = sqlSession.update("updateOne", dept);
////             System.out.println(updateOne);
////             sqlSession.commit();
//             //删除
//             int deleteOne = sqlSession.delete("deleteOne", "2");
//             System.out.println(deleteOne);
//             sqlSession.commit();
//             sqlSession.close();
//         } catch (IOException e) {
//
//         }

        //Dao层增  删  改  查
//         Dept oneDept = deptDao.getOneDept("1");
//         System.out.println(oneDept);
         //添加部门并且返回部门ID
         Dept dept = new Dept(null, "司法部", "王思聪");
         Integer integer = deptDao.addOneDept(dept);
         System.out.println(dept.toString());



     }
     @After
     public  void  after()
     {

     }
}
