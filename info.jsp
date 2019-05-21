<%--
  Created by IntelliJ IDEA.
  User: liyunlong
  Date: 2019/5/21
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
    <c:forEach items="${name}" var="name">
        <tr>
            <td>${name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
