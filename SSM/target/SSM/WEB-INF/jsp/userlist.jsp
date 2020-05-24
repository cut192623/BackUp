<%--
  Created by IntelliJ IDEA.
  User: 12159
  Date: 2020/4/3
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" width="600">
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>${user.sex}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
