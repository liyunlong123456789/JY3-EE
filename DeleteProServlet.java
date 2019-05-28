package com.neuedu.controller;

import com.neuedu.Dao.ProductDao;
import com.neuedu.Dao.ProductDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteProServlet",urlPatterns = "/deletePro.do")
public class DeleteProServlet extends HttpServlet {
    private ProductDao pd;

    @Override
    public void init() throws ServletException {
        pd = new ProductDaoImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
        //int i = Integer.parseInt(id);
        pd.deleteUser(id);
       response.sendRedirect("/getPros.do");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
