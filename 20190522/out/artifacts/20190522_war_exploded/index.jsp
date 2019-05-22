<%--
  Created by IntelliJ IDEA.
  User: liyunlong
  Date: 2019/5/22
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>数据库连接池查询</title>
  </head>
  <body>
  <table border="1px">
    <thead>

      <th>用户名</th>
      <th>密码</th>
      <th>ID</th>
      <th>修改</th>
      <th>删除</th>
    </thead>
    <c:forEach items="${users}" var="user">
      <tr>

        <td>${user.username}</td>
        <td>${user.password}</td>
        <td>${user.ID}</td>
        <td><a href="update.jsp"><button name="up">修改</button></a></td>
        <td><button name="de">删除</button></td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
