<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>转换成功</title>
</head>
<body>
	<s:property value="tip"/>!<br />
	用户名为:<s:property value="user.name"/><br />
	密码为：<s:property value="user.pass"/><br />
	用户的生日为：<s:property value="birth"/><br />
	客人的用户名为:<s:property value="customer.name"/><br />
	客人的密码为：<s:property value="customer.pass"/><br />
</body>
</html>