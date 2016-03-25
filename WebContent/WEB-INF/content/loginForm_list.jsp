<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>转换成功</title>
</head>
<body>	
	<span style="font-weight:bold">${tip}</span>
		<form action="regist_list" method="post">
		<table align="center" width="360">
			<caption><h3>直接封装成对象List</h3></caption>
			<tr>
				<td>第一个用户名：<input type="text" 
					name="users[0].name"/></td>
			</tr>
			<tr>
				<td>第一个密码：<input type="text"
					name="users[0].pass"/></td>
			</tr>
			<tr>
			<td>第二个用户名：<input type="text" 
				name="users[1].name"/></td>
			</tr>
			<tr>
			<td>第二个密码：<input type="text" 
				name="users[1].pass"/></td>
			</tr>
			<tr align="center">
				<td><input type="submit" value="转换"/>
					<input type="reset" value="重填" /></td>
			</tr>
		</table>
		</form>
</body>
</html>