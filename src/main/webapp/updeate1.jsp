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
<form action="${pageContext.request.contextPath}/admin/updete1" method="get">
	<div style="margin:0 auto; width:300px;height:600px">
	<table>
    <tr>
        <td>编号:</td>
        <td><input type="text" name="userId" value="${user.userId}"/></td>
        
     </tr>
     <tr>
        <td>外号</td>
         <td><input type="text" name="username" value="${user.username}"/></td>
        
     </tr> 
     <tr>
        <td>密码</td>
        <td><input type="text" name="password" value="${user.password}"/></td>
        
     </tr> 
     <tr>
        <td>名字</td>
        <td><input type="text" name="name" value="${user.name}"/></td>
        
     </tr> 
     <tr>
        <td>年龄</td>
        <td><input type="text" name="age" value="${user.age}"/></td>
        
     </tr>   
     <tr>
         <td>email</td>
        <td><input type="text" name="email" value="${user.email}"/></td>
        
     </tr>   
        
    	<tr>
          <td>tel</td>
        <td><input type="text" name="tel" value="${user.tel}"/></td>
        </tr>
        </table>
        <div>
<input type="submit"  value="修改" /> <br/> 
</div>
</div>

</form>
</body>
</html>