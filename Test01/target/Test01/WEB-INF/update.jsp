<%--
  Created by IntelliJ IDEA.
  User: 12159
  Date: 2020/3/10
  Time: 12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="update2" method="post">
    <input type="hidden" name="id" value="${goods.id}">
    <input type="text" name="name" value="${goods.name}" placeholder="name"></br>
    <input type="text" name="price" value="${goods.price}" placeholder="price"></br>
    <input type="text" name="address" value="${goods.address}" placeholder="address"></br>
    <input type="text" name="image" value="${goods.image}" placeholder="image"></br>
    <input type="submit" value="update">

</form>
</body>
</html>
