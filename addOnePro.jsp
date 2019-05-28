<%--
  Created by IntelliJ IDEA.
  User: liyunlong
  Date: 2019/5/24
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加商品</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</head>
<body>
<form enctype="multipart/form-data" method="post" action="add.do">
    <div class="form-group">
        <label for="proName">商品名</label>
        <input type="text" class="form-control" id="proName" placeholder="商品名" name="pro_name">
    </div>
    <div class="form-group">
        <label for="proPrice">商品价格</label>
        <input type="number" class="form-control" id="proPrice" placeholder="商品价格" min="1.00" max="9999999.00" name="pro_price">
    </div>
    <div class="form-group">
        <label for="exampleInputFile">商品图片</label>
        <input type="file" id="exampleInputFile" name="file1">
        <p class="help-block">请选择商品图片</p>
    </div>
    <div class="form-group">
        <label for="proDes">商品描述</label>
        <br />
        <textarea placeholder="请输入商品详细信息" style="width: 100%" id="proDes" name="pro_des"></textarea>
    </div>
    <div class="form-group">
        <label for="proStock">商品库存</label>
        <input type="number" class="form-control" id="proStock" placeholder="商品库存" min="0" max="999" name="pro_stock">
    </div>
    <div class="form-group">
        <label for="proDate">商品上架日期</label>
        <input type="date" class="form-control" id="proDate" placeholder="商品上架日期" name="pro_date">
    </div>
    <div class="form-group">
        <label for="proCateId">商品类别</label>
        <input type="number" class="form-control" id="proCateId" placeholder="商品类别" min="1" max="999" name="pro_cate_id">
    </div>
    <div class="form-group">
        <label for="proFac">商品厂家</label>
        <br />
        <textarea placeholder="请输入商品详细出厂厂家" style="width: 100%" id="proFac" name="pro_factory"></textarea>
    </div>
    <button type="submit" class="btn btn-default">确认提交</button>
</form>
</body>
</html>
