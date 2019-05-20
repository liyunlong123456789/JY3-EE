package com.neuedu.dao;

import java.sql.*;

public class LoginDaoImpl implements LoginDao{
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
    public boolean login(String ps, String name) {
        Connection con = null;
        PreparedStatement preparedStatement = null;
        try {
            con = DriverManager.getConnection(URL,USERNAME,PSW);
            String sql  = "SELECT * FROM user WHERE username = ? AND password = ?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,ps);
            ResultSet  rs = preparedStatement.executeQuery();
            while (rs.next())
            {
                String string = rs.getString(1);
                String string2 = rs.getString(2);
//                System.out.println(string+" "+string2);
//                System.out.println(ps+" "+name);
                if (string.equals(name) && string2.equals(ps))
                {
                    return true;
                }
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }finally {
            if (null != preparedStatement)
            {
                try {
                    preparedStatement.close();
                }catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
            if (null != con)
            {
                try {
                    con.close();
                }catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
        }
        return  false;

    }
}

