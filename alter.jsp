<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改界面</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</head>
<body>
<form enctype="multipart/form-data" class="form-horizontal" action="/change.do" method="post">
    <div class="form-group" style="width: 100%">
        <label for="inputEmail3" class="col-sm-2 control-label">商品名</label>
        <div class="col-sm-10">
            <input type="hidden" value="${proid}" name="id">
            <input type="text" class="form-control" id="inputEmail3" value="${proname}" name="name">
        </div>
    </div>
    <div class="form-group" style="width: 100%">
        <label for="inputPassword3" class="col-sm-2 control-label">商品价格</label>
        <div class="col-sm-10">
            <input type="number" class="form-control" id="inputPassword3" name="price" min="1" max="9999999">
        </div>
    </div>

    <div class="form-group" style="width: 100%">
        <label for="inputPassword4" class="col-sm-2 control-label">商品图片</label>
        <div class="col-sm-10">
            <input type="file" id="inputPassword4" name="img" placeholder="请选择上传的图片">
            <p class="help-block">请选择上传的文件</p>
        </div>
    </div>

    <div class="form-group" style="width: 100%">
        <label for="inputPassword5" class="col-sm-2 control-label">商品描述</label>
        <div class="col-sm-10">
            <textarea id="inputPassword5" placeholder="请输入商品的详细描述" name="desc" style="width: 100%"></textarea>
        </div>
    </div>

    <div class="form-group" style="width: 100%">
        <label for="inputPassword6" class="col-sm-2 control-label">商品库存</label>
        <div class="col-sm-10">
            <input type="number" class="form-control" id="inputPassword6" min="0" max="999999" name="stock">
        </div>
    </div>

    <div class="form-group" style="width: 100%">
        <label for="inputPassword7" class="col-sm-2 control-label">上架日期</label>
        <div class="col-sm-10">
            <input type="date" class="form-control" id="inputPassword7" name="prodate">
        </div>
    </div>
    <div class="form-group" style="width: 100%">
        <label for="inputPassword8" class="col-sm-2 control-label">产品分类</label>
        <div class="col-sm-10">
            <input type="number" class="form-control" id="inputPassword8" min="1" max="999" name="catery">
        </div>
    </div>
    <div class="form-group" style="width: 100%">
        <label for="inputPassword9" class="col-sm-2 control-label">生产厂商</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="inputPassword9" name="factory">
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
