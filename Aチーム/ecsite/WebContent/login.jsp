<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログインページ</title>
</head>
<body style="text-align:center;">
<h1>ログイン</h1>
<form action="http://localhost:8080/ecsite/login"method="Post">
<p align="center">
<table>
<tr><td>名前</td><td><input type="text" name="name"></td></tr>
<tr><td>パスワード</td><td><input type="text" name="password"></td></tr>
</table>
</p>
<input type="submit" value="LOGIN">
</form>
</body>
</html>