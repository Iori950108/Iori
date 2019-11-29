<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品紹介1</title>
</head>
<body>

<h1 align="center">商品紹介</h1>
<form action="http://localhost:8080/ecsite/sui">
<img src= "炊飯器.png" alt="炊飯器の写真">
	<table border="1">
		<tr>
			<td>商品名</td>
			<td>炊飯器</td>
		</tr>
		<tr>
			<td>カテゴリ</td>
			<td>家電</td>
		</tr>
		<tr>
			<td>価格</td>
			<td>\14,800</td>
		</tr>
		<tr>
			<td>在庫</td>
			<td>1</td>
		</tr>
		<tr>
			<td>商品紹介</td>
			<td>おいしくごはんが炊けます。</td>
		</tr>
	</table><br>

<p>個数</p>
<select name="category">
<option value="個数1">1</option>
<option value="個数2">2</option>
</select>
<br>

<input type="submit" value="カートへ" onClick="location.href='cart.jsp'">
<input type="submit" value="戻る" onClick="location.href='kensaku.jsp'">

</form>
</body>
</html>