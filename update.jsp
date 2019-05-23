<%--
  Created by IntelliJ IDEA.
  User: liyunlong
  Date: 2019/5/22
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</head>
<body>
<form class="form-horizontal" action="/update.do" method="post">
    <div class="form-group" style="width: 500px">
        <label for="inputEmail3" class="col-sm-2 control-label">用户名</label>
        <div class="col-sm-10">
            <input type="hidden" value="${user.ID}" name="id">
            <input type="text" class="form-control" id="inputEmail3" placeholder="username" value="${user.username}" name="name">
        </div>
    </div>
    <div class="form-group" style="width: 500px">
        <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="inputPassword3" placeholder="Password" value="${user.password}" name="word">
        </div>
    </div>
    <div class="form-group" style="width: 500px">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">确认</button>
        </div>
    </div>
</form>
</body>
</html>
