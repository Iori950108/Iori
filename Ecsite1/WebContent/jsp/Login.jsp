<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%--スタイルシートの定義 --%>
<style>

div {
	width: 300px;
	padding: 10px;
	text-align: center;
	margin: 30px auto;
}
</style>
<meta content="text/html; charset=UTF-8">
<title>EC Site</title>
</head>
<body>
	<div>
		<h1>ログイン</h1>
		<form action="http://localhost:8080/Ecsite1/login" method="post">
			<table>
				<tr>
				<%--id:login_cdに名前を格納 --%>
					<td>ログインコード</td>
					<td><input type="text" name="login_cd"></td>
				</tr>
				<tr>
				<%--id:login_pwにパスワードを格納 --%>
					<td>パスワード</td>
					<td><input type="password" name="login_pw"></td>
				</tr>
			</table>
			<input type="submit" value="login">
		</form>
	</div>
</body>
</html>