<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${adminExist==null}">
    <a href="${pageContext.request.contextPath }/admin/login.jsp">去登录！</a>
    <a href="${pageContext.request.contextPath }/admin/register.jsp">去注册！</a>
</c:if>
<!-- 转发到用户管理系统主页面 -->
<c:if test="${adminExist!=null}">
    <jsp:forward page="/admin/main.jsp" />
</c:if>

