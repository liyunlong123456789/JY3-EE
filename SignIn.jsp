<%--
  Created by IntelliJ IDEA.
  User: liyunlong
  Date: 2019/5/25
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
    <link rel="stylesheet" href="CSS/SignIn.css">

</head>
<div id="signin">
    <h1>SignIn</h1>
    <form method="post" action="signin.do">
        <input type="text" placeholder="用户名" id="ming" name="ming"></input>
        <br />
        <input type="password" placeholder="密码" id="mi" name="mi"></input>
        <br />
        <input type="password" placeholder="确认密码" id="que" name="que"></input>
        <br />

        <button class="but" id="zhuce">注册</button>

    </form>
</div>
<script>
    window.onload = function () {
    var lo = /^[0-9A-Za-z]{8,12}$/;
    var p =/^[0-9A-Za-z]{6,12}$/;
    var zhu = document.getElementById("zhuce");
    zhu.onclick = function()
    {
        var pass = document.getElementById("ming").value;
        var ps = document.getElementById("mi").value;
        var pw = document.getElementById("que").value;
        var lo2 = lo.test(pass)
        var lo3 = p.test(ps)
        if(lo2 == true && lo3 == true &&ps == pw )
        {
        //     window.location.href ="LogIn.jsp";
        // window.event.returnValue=false;
        }else
        {
            alert("请重新注册")
        }
    }
    }
</script>
</body>
</html>
