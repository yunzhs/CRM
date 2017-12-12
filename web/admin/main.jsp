<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>主页面</title>
    
	
	<style type="text/css">
		*{
			font-size:10pt;
		}
		body{
			text-align:center;
			margin: 0px;
		}
		.table{
			width:100%;
			height:100%;
			border:1px solid gray;/*固定边框,1像素*/
		    border-collapse: collapse;/*单线的列表边框*/
		}
		.table td{
			border:1px solid gray;/*固定边框,1像素*/
		}
		iframe {
			width: 100%;
			height: 100%;
		}
	</style>
  </head>
  
  <body>
<table class="table" align="center">
	<tr style="background: rgb(78,78,78); height:50px; ">
		<td colspan="2" align="center">
			<!-- 框架布局标签,上面部分 -->
			<iframe frameborder="0" src="${pageContext.request.contextPath}/admin/top.jsp" name="top"  frameborder="1" scrolling="no"></iframe>
		</td>
	</tr>
	<tr>
		<td width="265" style="padding:5px;" align="center" valign="top">
			<!-- 框架布局标签,左边部分 -->
			<iframe frameborder="0" width="120" src="${pageContext.request.contextPath}/admin/left.jsp" name="left"></iframe>
		</td>
		<td>
		<!-- 框架布局标签,右边部分 -->
			<iframe frameborder="0" src="${pageContext.request.contextPath}/admin/body.jsp" name="body"></iframe>
		</td>
	</tr>
</table>
  </body>
</html>
