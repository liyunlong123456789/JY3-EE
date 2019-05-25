package com.neuedu.controller;

import com.neuedu.Dao.UesrDao;
import com.neuedu.Dao.UserDaoImpl;
import com.neuedu.pojo.User;
import com.neuedu.util.ProUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SigninServlet",urlPatterns = "/signin.do")
public class SigninServlet extends HttpServlet {
    private UesrDao ud;
    @Override
    public void init() throws ServletException {
        ud = new UserDaoImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ming = request.getParameter("ming");
        String mi = request.getParameter("mi");
        System.out.println(ming);
        System.out.println(mi);
        User user = new User(ProUtil.getProId(),ming,mi);
        boolean boo = ud.findname(user.getUser_name());
        if (boo == false)
        {
            ud.insert(user);
            request.setAttribute("name",user.getUser_name());
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
