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

@WebServlet(name = "AddServlet",urlPatterns = "/add.do")
@MultipartConfig
public class AddServlet extends HttpServlet {
    private ProductDao pd;

    @Override
    public void init() throws ServletException {
        pd = new ProductDaoImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String proName = request.getParameter("pro_name");
        String proPrice = request.getParameter("pro_price");
        Part file1 = request.getPart("file1");
        String realName = FileAction.uploadFile(file1);
        String proDes = request.getParameter("pro_des");
        String proStock = request.getParameter("pro_stock");
        String proDate = request.getParameter("pro_date");
        String proCateId = request.getParameter("pro_cate_id");
        String proFac = request.getParameter("pro_factory");
        Product pro = new Product(ProductUtil.getProid(),proName,Double.parseDouble(proPrice),realName,proDes,Short.parseShort(proStock), ProductUtil.getStringConverseDate(proDate),Short.valueOf(proCateId),proFac);
        pd.addOneProduct(pro);
        response.sendRedirect("success.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
