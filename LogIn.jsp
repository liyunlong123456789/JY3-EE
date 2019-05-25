<%--
  Created by IntelliJ IDEA.
  User: liyunlong
  Date: 2019/5/25
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <link rel="stylesheet" href="CSS/SignIn.css">
</head>
<body>
<div id="signin">
    <h1>LogIn</h1>
    <form method="post" action="login.do" >
        <input type="text" placeholder="用户名" id="yong" name="yong"></input>
        <br/>
        <input type="password" placeholder="密码" id="ma" name="ma"></input>
        <br/>
        <input type="text" id="input" placeholder="验证码" />
        <br>
        <input type="button" id="code" style="height: 30px"/>
        <br>
        <button class="but" id="deng">确认登录</button>

    </form>
</div>
<script>
    window.onload = function () {
        var log = /^[0-9A-Za-z]{8,12}$/;
        var pa = /^[0-9A-Za-z]{6,12}$/
        var denglu = document.getElementById("deng");
        denglu.onclick = function () {
            var user = document.getElementById("yong").value;
            var pas = document.getElementById("ma").value;
            var log2 = log.test(user)
            var log3 = pa.test(pas)
            if (log2 == true && log3 == true && x() == true ) {

            } else {
                alert("请重新输入")
            }
        }

        var code = document.getElementById("code");
        function change() {
            var arrays = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
            codes = '';
            for(var i = 0; i < 4; i++) {
                var r = parseInt(Math.random() * arrays.length);
                codes += arrays[r];
            }
            code.value = codes;
        }
        change();
        code.onclick = change;
        var check = document.getElementById("deng");
        var input = document.getElementById("input");
        check.onclick = function x() {
            var inputCode = input.value.toUpperCase();
            if(inputCode.length == 0) {
                alert("请输入验证码！");
                return false;
            } else if(inputCode != codes.toUpperCase()) {
                alert("验证码输入错误！请重新输入");
                change();
                input.value = "";
                return false;
            } else {
                return true;
            }
        }

    }
</script>
<script src="JS/jquery.js"></script>
<script src="JS/Code.js"></script>
</body>
</html>
