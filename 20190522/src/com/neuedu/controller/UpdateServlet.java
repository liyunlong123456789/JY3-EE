package com.neuedu.controller;

import com.neuedu.Dao.UesrDao;
import com.neuedu.Dao.UserDaoImpl;
import com.neuedu.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateServlet",urlPatterns = "/update.do")
public class UpdateServlet extends HttpServlet {
//    private UesrDao ud;

    @Override
//    public void init() throws ServletException {
//        ud = new UserDaoImpl();
//    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Integer id =Integer.valueOf(request.getParameter("ID"));
//        String username = request.getParameter("username");
//        String  password = request.getParameter("password");
//        ud.update(id,username,password);
//        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
