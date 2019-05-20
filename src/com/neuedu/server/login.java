package com.neuedu.server;


import com.neuedu.dao.LoginDao;
import com.neuedu.dao.LoginDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet",urlPatterns = "/World.go")
public class login extends HttpServlet {
    private LoginDao ld;

    public void  init() throws ServletException
    {
        ld  = new LoginDaoImpl();

    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String na = request.getParameter("name");
        String ps = request.getParameter("ps");

        boolean bo = ld.login(ps,na);
        if (bo == true)
        {
            request.setAttribute("na",na);
            request.getRequestDispatcher("enter.jsp").forward(request,response);
        }else
        {
            //跳转页面
            request.getRequestDispatcher("fail.jsp").forward(request,response);
        }


    }


}
