package com.neuedu.controller;

import com.neuedu.Dao.ProductDao;
import com.neuedu.Dao.ProductDaoImpl;
import com.neuedu.pojo.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "GetAllProServlet",urlPatterns = "/getPros.do")
public class GetAllProServlet extends HttpServlet {
    private ProductDao pd;

    @Override
    public void init() throws ServletException {
        pd = new ProductDaoImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Product> pros = pd.getAllPro();
        //System.out.println(pros.get(0).getPro_factory());
        request.setAttribute("pros",pros);
        //System.out.println(pros.get(2).getPro_image());
        request.getRequestDispatcher("showAllPro.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
