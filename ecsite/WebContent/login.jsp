<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
div {
	width: 300px;
	padding: 10px;
	text-align: center;
	margin: 30px auto;
}
</style>

<meta content="text/html; charset=UTF-8">
<title>ログインページ</title>
</head>
<body style="text-align: center;">
	<h1>ログイン</h1>
	<form action="http://localhost:8080/ecsite/login" method="Post">
		<table>
			<tr>
				<td>名前</td>
				<td><input type="text" name="UserName"></td>
			</tr>
			<tr>
				<td>パスワード</td>
				<td><input type="password" name="pw"></td>
			</tr>
		</table>

		<input type="submit" value="LOGIN">
	</form>
</body>
</html>