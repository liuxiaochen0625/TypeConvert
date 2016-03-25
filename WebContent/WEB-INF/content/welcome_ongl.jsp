<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>类型转换结果如下</title>
</head>
<body>
	<h1>您的注册信息如下</h1>
	用户名：<s:property value="user.name"/><br />
	密码：<s:property value="user.pass"/><br />
	年龄：<s:property value="user.age"/><br />
	生日：<s:property value="user.birth"/><br />
</body>
</html>