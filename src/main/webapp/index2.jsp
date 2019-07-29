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

<table border="1" >
    <thead>
    <tr>
        <td>编号</td>
        <td>外号</td>
    	<td>密码</td>
    	<td>名字</td>
        <td>年龄</td>
        <td>email</td>
        <td>tel</td>
        <td></td>
        <td></td>
    </tr>
</thead>
<tbody>
<c:forEach items="${list}" var="u">

    <tr>
            <td>${u.userId}</td>
            <td>${u.username}</td>
            <td>${u.password}</td>
            <td>${u.name}</td>
            <td>${u.age}</td>
            <td>${u.email}</td>
            <td>${u.tel}</td>
            <td><a href="${pageContext.request.contextPath}/admin/delete?userid=${u.userId}">删除</a></td>
            <td><a href="${pageContext.request.contextPath}/admin/update?userid=${u.userId}">修改</a></td>
    </tr>
    </c:forEach>
</tbody>
</table>
<div>

<p ><a href="/lanqiao-mvc-online/registered.jsp" color=blue>添加数据</a></p>

</div>
</body>
</html>