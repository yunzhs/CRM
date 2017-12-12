<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
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
        <td colspan="8" align="right"><a href="#">添加用户</a></td>
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
    <c:forEach items="${pageBean.list}" var="customer">
        <tr>
            <td>${customer.cid }</td>
            <td>${customer.sname}</td>
            <td>${customer.sex}</td>
            <td>${customer.email}</td>
            <td>${customer.telephone }</td>
            <td>${customer.addr }</td>
            <td>${customer.age }</td>
            <td><a href="#">编辑</a>|<a href="#">删除</a></td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="8">
            <!-- //显示分页的页码数 -->
            总页数：${pageBean.totalPage }||当前页码数：${pageBean.currentPage }<br/>
            <a href="${pageContext.request.contextPath }/PageServlet?page=1">首页</a>
            <c:if test="${pageBean.currentPage-1>=1}">
                <a href="${pageContext.request.contextPath }/PageServlet?page=${pageBean.currentPage-1}">上一页</a>
            </c:if>
            <!-- 123456  items="${pageBean.totalPage}"-->
            <c:forEach begin="1" var="i"  end="${pageBean.totalPage}">

                <c:if test="${i==pageBean.currentPage}">
                    [${i }]
                </c:if>
                <c:if test="${i!=pageBean.currentPage}">
                    <a href="${pageContext.request.contextPath }/PageServlet?page=${i }">${i }</a>
                </c:if>
            </c:forEach>

            <!-- 123456 -->
            <c:if test="${pageBean.currentPage+1<=pageBean.totalPage}">
                <a href="${pageContext.request.contextPath }/PageServlet?page=${pageBean.currentPage+1}">下一页</a>
            </c:if>
            <a href="${pageContext.request.contextPath }/PageServlet?page=${pageBean.totalPage }">尾页</a>

        </td>
    </tr>
</table>
</body>
</html>