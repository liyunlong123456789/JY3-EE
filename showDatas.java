package com.neuedu.controller;

import com.neuedu.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "showDatas",urlPatterns = "/show.do")
public class showDatas extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ID = request.getParameter("ID");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
//        System.out.println(ID);
//        System.out.println(username);
//        System.out.println(password);
        Integer res = Integer.parseInt(ID);
        User user = new User(username,password,res);
        request.setAttribute("user",user);
        request.getRequestDispatcher("update.jsp").forward(request,response);
    }
}
