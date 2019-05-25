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

@WebServlet(name = "LoginServlet",urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

        private UesrDao ud;
        @Override
        public void init() throws ServletException {
            ud = new UserDaoImpl();
        }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String yong = request.getParameter("yong");
        String ma = request.getParameter("ma");
        User user =new User(yong,ma);
        boolean all = ud.findAll(user);
        if (all == true)
        {
            response.sendRedirect("Commodity.jsp");
        }else
        {
            response.sendRedirect("来错地方了");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
