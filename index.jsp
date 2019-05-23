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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
  </head>
  <body>
  <table border="1px" class="table table-hover">
    <thead>
      <th>用户名</th>
      <th>密码</th>
      <th>ID</th>
      <th>操作</th>

    </thead>
    <c:forEach items="${users}" var="user">
      <tr>
        <td>${user.username}</td>
        <td>${user.password}</td>
        <td>${user.ID}</td>
        <td><a href="show.do?username=${user.username}&password=${user.password}&ID=${user.ID}"><button type="button" class="btn btn-primary">修改</button></a>
        <a href="delete.do?ID=${user.ID}"><button type="button" class="btn btn-danger">删除</button></a>
        </td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
