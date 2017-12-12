<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/CustomerEdit" method="post">
	<input type="hidden" name="cid" value="${customerinfo.cid}" >
	<table border="1" width="400">
		<tr>
			<td>用户姓名</td>
			<td><input type="text" name="sname" value="${customerinfo.sname}"/></td>
		</tr>
		<tr>
			<td>用户性别</td>
			<td>
				<input type="radio" name="sex" value="男" <c:if test="${customerinfo.sex=='男' }"> checked</c:if>>男
				<input type="radio" name="sex" value="女" <c:if test="${customerinfo.sex=='女' }"> checked</c:if>>女
			</td>
		</tr>
		<tr>
			<td>用户年龄</td>
			<td><input type="text" name="age" value="${customerinfo.age}"/></td>
		</tr>
		<tr>
			<td>用户邮箱</td>
			<td><input type="text" name="email" value="${customerinfo.email}" /></td>
		</tr>
		<tr>
			<td>用户电话</td>
			<td><input type="text" name="telephone" value="${customerinfo.telephone}" /></td>
		</tr>
		<tr>
			<td>用户地址</td>
			<td><input type="text" name="addr" value="${customerinfo.addr}"/></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="修改"/></td>
		</tr>
	</table>
</form>
</body>
</html>