<%--
  Created by IntelliJ IDEA.
  User: liyunlong
  Date: 2019/5/21
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String str = exception.getMessage();
        out.print(exception.getCause());
        out.print(str);

    %>
<h1 align="center">代码错误，从新写</h1>
</body>
</html>
