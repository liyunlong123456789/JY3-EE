package com.neuedu.server;

import com.neuedu.dao.UserDao;
import com.neuedu.dao.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloServlet",urlPatterns = "/Hello.go")
public class HelloServlet extends HttpServlet {
    private UserDao ud;

    public void  init() throws  ServletException
    {
        ud  = new UserDaoImpl();

    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String name = request.getParameter("username");
       String psw = request.getParameter("psw");
       Boolean bo = ud.findByusername(name);
       if (bo == false)
       {
           //跳转页面
           request.getRequestDispatcher("fail.jsp").forward(request,response);
       }else
       {
           ud.regsiter(psw,name);
           request.getRequestDispatcher("login.jsp").forward(request,response);
       }





    }
}
