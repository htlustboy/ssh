<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
	<h1>新增商品</h1>
	<form action="product_save" method="post" namespace="/">
		商品名称:<input name="product.productName" type="text">
		商品价格:<input name="product.price" type="text">
		<input type="submit" value="提交">
	</form>
</body>
</html>