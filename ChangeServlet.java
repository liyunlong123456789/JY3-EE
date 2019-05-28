package com.neuedu.controller;

import com.neuedu.Dao.ProductDao;
import com.neuedu.Dao.ProductDaoImpl;
import com.neuedu.pojo.Product;
import com.neuedu.util.FileAction;
import com.neuedu.util.ProductUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "ChangeServlet",urlPatterns = "/change.do")
@MultipartConfig
public class ChangeServlet extends HttpServlet {
    private ProductDao pd;

    @Override
    public void init() throws ServletException {
        pd = new ProductDaoImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        double dprice = Double.parseDouble(price);
        //String img = request.getParameter("img");
        Part proimg = request.getPart("img");
        String nimg = FileAction.uploadFile(proimg);

        String desc = request.getParameter("desc");
        String stock = request.getParameter("stock");
        short sstock = Short.parseShort(stock);

        String prodate = request.getParameter("prodate");
        Date stringConverseDate = ProductUtil.getStringConverseDate(prodate);

        String catery = request.getParameter("catery");
        short scatery = Short.parseShort(catery);


        String factory = request.getParameter("factory");

        Product product = new Product(id,name,dprice,nimg,desc,sstock,stringConverseDate,scatery,factory);
        pd.alterUser(product);
        //response.sendRedirect("/getPros.do");
        request.getRequestDispatcher("/getPros.do").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
    }
}
