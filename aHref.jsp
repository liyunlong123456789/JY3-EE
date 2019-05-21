<%--
  Created by IntelliJ IDEA.
  User: liyunlong
  Date: 2019/5/21
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
//        String str = (String) pageContext.getAttribute("user");
//        System.out.println(str);
        int a = 100/0;
        out.print(a);
    %>
</body>
</html>
