<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>菜单</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<script type="text/javascript" src="${pageContext.request.contextPath }/menu/mymenu.js"></script>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/menu/mymenu.css" type="text/css" media="all">
    <script language="javascript">

		var bar1 = new Q6MenuBar("bar1", "用户后台管理");
		function load() {
			// 设置配色方案：0,1,2,3
			bar1.colorStyle = 3;
			// 指定图片的路径
			bar1.config.imgDir = "${pageContext.request.contextPath}/menu/img/";
			// 多个菜单是否相互排斥
			bar1.config.radioButton=true;
			/*
			添加菜单或菜单条目
			1. 这里不会出现同名菜单（第一次添加时指定了名为a的菜单，下次再添加名为a的菜单，就不会添加了）
			  > "分类管理" --> 菜单名称
			  > "查看分类" --> 菜单条目名称
			  > "#" 点击条目时要请求的地址
			  > "body" --> 请求后的响应结果在哪个框架中显示
			  
			*/
			bar1.add("用户管理", "查看用户信息", "/CustomerFindAllServlet", "body");
			bar1.add("用户管理", "分页查询用户信息", "#", "body");
			bar1.add("用户管理", "添加用户信息", "${pageContext.request.contextPath }/customer/addCustomer.jsp", "body");
		
			bar1.add("用户管理", "aaaaaaa", "#", " ");
			bar1.add("用户管理", "bbbbbbb", "#", " ");
		
		
			// 获取id为menu的元素，它是一个<div>
			var d = document.getElementById("menu");
			// 把菜单栏转换成字符串，作用<div>元素的内容
			d.innerHTML = bar1.toString();
		}
		</script>

</head>

<body onload="load()" style="margin: 0px; background: rgb(25,119,176);">
<div id="menu"></div>

</body>
</html>
