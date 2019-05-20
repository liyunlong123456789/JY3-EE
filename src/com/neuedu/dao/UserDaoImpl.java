package com.neuedu.dao;

import java.io.IOException;
import java.sql.*;

/**
 * LoginDao实现类
 */
public class UserDaoImpl implements UserDao {
    //判断数据是否存在
    public boolean findByusername(String name) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PSW);
            String str = "SELECT * from  user where username = ?";
            pstmt = conn.prepareStatement(str);
            pstmt.setString(1,name);
            ResultSet re = pstmt.executeQuery();
            while (re.next())
            {
                String  st = re.getString(1);
//                System.out.println(st +" "+name);
                if (st.equals(name))
                {
                    return false;
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (null != pstmt) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (null != conn) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return true;
    }

    static
    {
       try {
           Class.forName("com.mysql.jdbc.Driver");
       }catch (ClassNotFoundException e)
       {
           e.printStackTrace();
       }
    }

    private  static  final  String URL = "jdbc:mysql://localhost:3306/20190517";
    private  static final  String USERNAME = "root";
    private  static  final  String PSW = "123456";

    @Override
    public void regsiter(String user, String psw) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
             conn = DriverManager.getConnection(URL,USERNAME,PSW);
            String str  = "INSERT INTO User VALUES (?,?)";
             pstmt = conn.prepareStatement(str);
            pstmt.setString(1,psw);
            pstmt.setString(2,user);
            pstmt.executeUpdate();
        }catch (SQLException e)
        {
            e.printStackTrace();
        }finally {
            if (null != pstmt)
            {
                try {
                    pstmt.close();
                }catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
            if (null != conn)
            {
                try {
                    conn.close();
                }catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
        }


    }
}
