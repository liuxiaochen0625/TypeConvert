<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>请输入您的注册信息</title>
</head>
<body>
		<h1>请输入您的注册信息</h1>
		<form method="post" action="regist_ongl">
			用户名：<input type="text" name="user.name" /><br />
			密&nbsp;&nbsp;码：<input type="password" name="user.pass"><br />
			年&nbsp;&nbsp;龄：<input type="text" name="user.age"><br />
			生&nbsp;&nbsp;日：<input type="text" name="user.birth"><br />
			<input type="submit" value="注册">
		</form>
</body>
</html>