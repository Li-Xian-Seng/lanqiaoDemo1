<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/admin/user" method="get">
<div style="margin:0 auto; width:500px;height:600px">
<table>
	<tr>
		<td>账号：<td/>
		<td><input type="text" name="name"/><td/>
	<tr/>
	<tr>
		<td>密码：<td/>
		<td><input type="password" name="password" /><td/>
	<tr/>
	<tr>
		<td>姓名：<td/>
		<td><input type="text" name="listname"/><td/>
	<tr/>
	<tr>
		<td>年龄：<td/>
		<td><input type="text" name="age" /><td/>
	<tr/>
	<tr>
		<td>email：<td/>
		<td><input type="text" name="email"/><td/>
	<tr/>
	<tr>
		<td>tel：<td/>
		<td><input type="text" name="tel" /><td/>
	<tr/>
	<tr>
	<td>
	<input type="submit"  value="注册" />
	<td/>
	<td>
	<td/>
	<tr/>
</table>

${AddError}
</div>
<form/>

	
</body>
</html>