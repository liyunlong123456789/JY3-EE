package com.neuedu.controller;

import com.neuedu.Dao.ProDao;
import com.neuedu.Dao.ProDaoImpl;
import com.neuedu.pojo.Pro;
import com.neuedu.util.FileAction;
import com.neuedu.util.ProUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "AddServlet",urlPatterns = "/add.do")
@MultipartConfig
public class AddServlet extends HttpServlet {
    private ProDao pd;

    @Override
    public void init() throws ServletException {
        pd = new ProDaoImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String proName = request.getParameter("proName");
        String proPrice = request.getParameter("proPrice");
        Part file1 = request.getPart("file1");
        String realName = FileAction.uploadFile(file1);
        String proDes = request.getParameter("proDes");
        String proStock = request.getParameter("proStock");
        String proDate = request.getParameter("proDate");
        String proCateId = request.getParameter("proCateId");
        String proFac = request.getParameter("proFac");
        Pro pro = new Pro(ProUtil.getProId(),proName,Double.parseDouble(proPrice),realName,proDes,Short.parseShort(proStock),ProUtil.getStringconverseDate(proDate),Short.valueOf(proCateId),proFac);
        pd.addOneProduct(pro);
        response.sendRedirect("success.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
