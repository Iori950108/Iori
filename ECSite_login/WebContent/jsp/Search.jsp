<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- 使用するJavaの部品を定義 -->
<%@page import="java.util.ArrayList"%>

<!-- 使用するJavaBeansを定義 -->
<jsp:useBean id="s_user" class="web.UserBean" scope="session" />
<jsp:useBean id="r_user" class="web.UserBean" scope="request" />

<html>
<head>
<style>
div {
	padding: 10px;
	text-align: center;
	text-align: center;
	margin: 30px auto;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search</title>
</head>
<body>

	<!-- jsp:getPropertyでSessionから取得 -->
	<div>
		<p>jsp:getPropertyでSessionから取得</p>
		<p>user_id  :<jsp:getProperty name="s_user" property="userId" /></p>
		<p>user_name:<jsp:getProperty name="s_user" property="userName" /></p>
		<p>login_cd :<jsp:getProperty name="s_user" property="loginCd" /></p>
		<p>login_pw :<jsp:getProperty name="s_user" property="loginPw" /></p>
	</div>

	<!-- jsp:getPropertyでRequestから取得 -->
	<div>
		<p>jsp:getPropertyでRequestから取得</p>
		<p>user_id  :<jsp:getProperty name="r_user" property="userId" /></p>
		<p>user_name:<jsp:getProperty name="r_user" property="userName" /></p>
		<p>login_cd :<jsp:getProperty name="r_user" property="loginCd" /></p>
		<p>login_pw :<jsp:getProperty name="r_user" property="loginPw" /></p>
	</div>

	<!-- RequestからArrayListを取得 -->
	<!-- ArrayListの場合、悲しいことにjsp:useBeanはできない -->
	<!-- JSTLとELを使えばできるかもしれない -->
	<%
		ArrayList<web.UserBean> list = (ArrayList<web.UserBean>) request.getAttribute("userList");
	%>
	<div>
		<p>RequestからArrayListを取得</p>
		<%
			for (web.UserBean u : list) {
		%>
		<p>user_id  :<%=u.getUserId()%></p>
		<p>user_name:<%=u.getUserName()%></p>
		<p>login_cd :<%=u.getLoginCd()%></p>
		<p>login_pw :<%=u.getLoginPw()%></p>
		<%
			}
		%>
	</div>

</body>
</html>