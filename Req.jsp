<%--
  Created by IntelliJ IDEA.
  User: liyunlong
  Date: 2019/5/21
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
//    request.removeAttribute("user");
//  String str = (String) request.getAttribute("user");
//
//    out.print(str);
//    String str = application.getInitParameter("allCount");
//    out.print(str);

    pageContext.setAttribute("user","张三");
    pageContext.getServletContext();
%>
<a href="aHref.jsp">跳转</a>
</body>
</html>
