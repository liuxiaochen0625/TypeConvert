<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>直接封装成List</title>
</head>
<body>
	转换成功!<br />
	key为one的用户名为:<s:property value="users[0].name"/><br />
	key为one的密码为：<s:property value="users[0].pass"/><br />
	key为two的用户名为:<s:property value="users[1].name"/><br />
	key为two的密码为：<s:property value="users[1].pass"/><br />
		
</body>
</html>