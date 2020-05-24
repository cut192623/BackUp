<%--
  Created by IntelliJ IDEA.
  User: 12159
  Date: 2020/3/5
  Time: 5:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List</title>
</head>
<body>
    <c:forEach var="user" items="${users}">
        <p>
            用户名：${user.name}密码：${user.password}

        </p>
   </c:forEach>
<form action="/user/login" method="get">
    <input type="submit" value="跳转">
</form>
</body>
</html>
