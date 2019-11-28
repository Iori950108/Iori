<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>商品紹介1</title>
</head>
<body>
<h1><p align="center">商品紹介</p></h1>

<image src= "suihanki.jpg"align="left">
<table border="1" width="500" cellspacing="0" cellpadding="5" bordercolor="black">
<tr>
<td>商品名</td>
<td>炊飯器</td>
</tr>
<tr>
<td>カテゴリ</td>
<td>調理家電</td>
</tr>
<tr>
<td>価格</td>
<td>\14,800</td>
</tr>
<tr>
<td>在庫</td>
<td>10</td>
</tr>
<tr>
<td>商品紹介</td>
<td>おいしくごはんが炊けます。</td>
</tr>
</table></br>
<div>個数<select name="category">
<option value="個数1">1</option>
<option value="個数2">2</option>
<option value="個数10">10</option>
</div></br>

<input type="button" value="カートへ" onClick="location.href='cart.html'">
<input type="button" value="戻る" onClick="location.href='kensaku.html'">
</body>
</html>

</body>
</html>