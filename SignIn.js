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
        window.location.href ="LogIn.jsp";
        window.confirm("请确认是否本人注册账号，如果不是请本人注册")
    }else
    {
        alert("请重新注册")
    }
}