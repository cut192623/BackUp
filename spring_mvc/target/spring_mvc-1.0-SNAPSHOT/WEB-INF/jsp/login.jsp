<%--
  Created by IntelliJ IDEA.
  User: 12159
  Date: 2020/3/4
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<span style="color: red">${error}</span>
<form action="http://localhost:8080/user/login" method="get">
    <input type="text" name="name"></br>
    <input type="password" name="password"></br>

    <input type="submit" value="login">
</form>
</body>
</html>
