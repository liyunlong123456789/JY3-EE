package com.neuedu.controller;

import com.neuedu.Dao.UesrDao;
import com.neuedu.Dao.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteServlet",urlPatterns = "/delete.do")
public class DeleteServlet extends HttpServlet {
    private UesrDao ud;

    @Override
    public void init() throws ServletException {
        ud = new UserDaoImpl();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id  = request.getParameter("ID");
        ud.delete(Integer.parseInt(id));
        response.sendRedirect("user.do");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
