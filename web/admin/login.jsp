<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>管理员登录页面</title>
    
  </head>
  
  <body>
<h1>管理员登录页面</h1>
<hr/>
  <p style="font-weight: 900; color: red">${error }</p>
<form action="/AdminLoginServlet" method="post">
	管理员账户：<input type="text" name="adminname" /><br/>
	密　　　码：<input type="password" name="password"/><br/>
	<input type="submit" value="进入后台"/>
</form>
  </body>
</html>
