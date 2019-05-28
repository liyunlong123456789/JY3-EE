<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>$Title$</title>
        <link href="CSS/indexCss.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
    </head>
    <body>
        <table class="table table-hover" id="tab">
            <tr>
                <td class="tittle">商品ID</td>
                <td class="tittle">商品名</td>
                <td class="tittle">价格</td>
                <td class="tittle">图片</td>
                <td class="tittle">详细描述</td>
                <td class="tittle">库存</td>
                <td class="tittle">上架日期</td>
                <td class="tittle">商品分类</td>
                <td class="tittle">生产厂家</td>
                <td class="tittle">操作</td>
            </tr>
            <c:forEach items="${pros}" var="pro">
                <tr>
                    <td>${pro.pro_id}</td>
                    <td>${pro.pro_name}</td>
                    <td>${pro.pro_price}</td>
                    <td><img src="/img/${pro.pro_image}" style="width: 29px;height: 50px"></td>
                    <td>${pro.pro_des}</td>
                    <td>${pro.pro_stock}</td>
                    <td>${pro.pro_date}</td>
                    <td>${pro.pro_cate_id}</td>
                    <td>${pro.pro_factory}</td>
                    <td>
                        <a href="/alterPro.do?proid=${pro.pro_id}&proname=${pro.pro_name}"><button type="button" class="btn btn-primary">修改</button></a>
                        <a href="/deletePro.do?id=${pro.pro_id}"><button type="button" class="btn btn-danger">删除</button></a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    <a href="addOnePro.jsp" id="a1"><button type="button" class="btn btn-info">添加</button></a>
    </body>
</html>
