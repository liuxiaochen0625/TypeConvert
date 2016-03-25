<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>全局类型转换器</title>
</head>
<body>
	<span style="font-weight:bold">${tip}</span>
	<form action="login_global" method="post">
	<table align="center" width="360">
		<caption><h3>全局类型转换器</h3></caption>
		<tr align="center">
			<td>用户信息的用户名和密码以英文逗号隔开</td>
		</tr>
		<tr>
			<td>请输入用户信息：<input type="text" name="user"/></td>
		</tr>
		<tr>
			<td>请输入客人信息：<input type="text" name="customer"/></td>
		</tr>
		<tr>
			<td>用户生日：<input type="text" name="birth"/></td>
		</tr>
		<tr align="center">
		<td><input type="submit" value="转换"/>
			<input type="reset" value="重填" /></td>
		</tr>
	</table>
	</form>
</body>
</html>