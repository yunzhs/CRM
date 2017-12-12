<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script type="text/javascript">

    </script>
</head>
<body>
<table border="1" width="600">
    <tr>
        <td colspan="8" align="right"><a href="customer/addCustomer.jsp">添加用户</a></td>
    </tr>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>邮箱</td>
        <td>电话</td>
        <td>地址</td>
        <td>年龄</td>
        <td>操作</td>
    </tr>


    <c:forEach items="${allcustomer}" var="cus">
        <tr>
            <td>${cus.cid}</td>
            <td>${cus.sname }</td>
            <td>${cus.sex }</td>
            <td>${cus.email }</td>
            <td>${cus.telephone}</td>
            <td>${cus.addr}</td>
            <td>${cus.age }</td>
            <td><a href="/findid?id=${cus.cid}">编辑</a>|<a href="/deleteid?id=${cus.cid}">删除</a></td>

        </tr>

    </c:forEach>


</table>
</body>
</html>