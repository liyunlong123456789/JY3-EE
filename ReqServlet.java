package com.neuedu.server;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ReqServlet")
public class ReqServlet extends HttpServlet {

//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setAttribute("user","张三");
//        //转发
//       // request.getRequestDispatcher("WEB-INF/info.jsp").forward(request,response);
//        //重定向
//        response.sendRedirect("Req.jsp");
//    }
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
        {

            response.setContentType("text/html;charset=utf-8");
//            int a = 100;
//            PrintWriter pw =response.getWriter();
//            pw.write("<div style = 'background-color:red;border：1px solid black;width:100px;height:100px'>");
//            pw.write(a+"</div>");
            String str = this.getServletConfig().getInitParameter("Money");
            System.out.println(str);

        }
}
