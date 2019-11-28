<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品検索</title>
</head>
<body>
<h1><p align="center">検索</p></h1><br>
<p align="center"><INPUT type size="40"="text" neme="kensaku"></p><br>
<p align="center">カテゴリ<select name="category">
<option value="家電">家電</option>
<option value="肉">肉</option>
<option value="文房具">文房具</option>
</select>
</p>
<p align="center"><input type="button" value="検索" onClick="location.href=''">
</p>

<table border="1" width="500" cellspacing="0"align="center" cellpadding="5" bordercolor="black">

<tr>
<th>商品名</th>
<th>価格</th>
<th>詳細</th>
</tr>

<tr>
<td>炊飯器</td>
<td>\14,800</td>
<td align="center"><form action="shoukai1.html"><input type="submit" value="詳細"></td>
</tr></form>

<tr>
<td>パソコン</td>
<td>\99,800</td>
<td align="center"><form action="shoukai3.html"><input type="submit" value="詳細"></td>
</tr></form>

<tr>
<td>豚肉</td>
<td>\350</td>
<td align="center"><form action="shoukai2.html"><input type="submit" value="詳細"></td>
</tr></form>

<tr>
<td>ボールペン</td>
<td>\100</td>
<td align="center"><form action="shoukai2.html"><input type="submit" value="詳細"></td>
</tr></form>

<tr>
<td>牛肉</td>
<td>\500</td>
<td align="center"><form action="shoukai2.html"><input type="submit" value="詳細"></td>
</tr></form>

</body>
</html>