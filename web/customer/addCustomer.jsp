<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/CustomerAdd" method="post">
	<input type="hidden" name="cid" value=null >
	<table border="1" width="400">
		<tr>
			<td>用户姓名</td>
			<td><input type="text" name="sname"/></td>
		</tr>
		<tr>
			<td>用户性别</td>
			<td>
				<input type="radio" name="sex" value="男"/>男
				<input type="radio" name="sex" value="女"/>女
			</td>
		</tr>
		<tr>
			<td>用户年龄</td>
			<td><input type="text" name="age"/></td>
		</tr>
		<tr>
			<td>用户邮箱</td>
			<td><input type="text" name="email"/></td>
		</tr>
		<tr>
			<td>用户电话</td>
			<td><input type="text" name="telephone"/></td>
		</tr>
		<tr>
			<td>用户地址</td>
			<td><input type="text" name="addr"/></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="添加"/></td>
		</tr>
	</table>
</form>
</body>
</html>