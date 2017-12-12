<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>top</title>
    <style type="text/css">
     #header_name{float:left;margin-left:20px;padding-top:0px;}
	 #header_menu {float:left;margin-left:900px;padding-top:0px;}
	 #header_menu ul li {list-style:none;float:left;width:50px;display:inline-block;}
	 a{text-decoration:none;color:white;text-align:center;}
	 a:hover{color:blue}
    </style>
  </head>
  
  <body style="background:rgb(25,119,176);color: white;">
	  <h1 style="text-align: center; ">用户信息后台管理系统</h1>
		<div id="header" style="border:0px solid rgb(25,119,176)">
			<div id="header_name"><h2>管理员：${adminExist.adminname }</h2></div>
			<div id="header_menu">
				<ul>
					<c:if test="${adminExist==null}">
					<li><a href="login.jsp" target="_blank">登录</a></li>
					<li><a href="register.jsp" target="_blank">注册</a></li>
					</c:if >
					<c:if test="${adminExist!=null}">
						<li><a href="/logout" target="_blank">退出</a></li>
					</c:if>


				</ul>
			</div>
	  </div>
  </body>
</html>
