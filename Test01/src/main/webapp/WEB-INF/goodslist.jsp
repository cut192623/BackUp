<%--
  Created by IntelliJ IDEA.
  User: 12159
  Date: 2020/3/10
  Time: 9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table width="800" border="1px">
    <tr>
        <th>编号</th>
        <th>名称</th>
        <th>价格</th>
        <th>地址</th>
        <th>图片</th>
        <th>操作</th>
    </tr>
    <c:forEach var="goods" items="${goodsEntities}">
        <tr>
            <td>${goods.id}</td>
            <td>${goods.name}</td>
            <td>${goods.price}</td>
            <td>${goods.address}</td>
            <td>${goods.image}</td>
            <td>
                <a href="update?goodsId=${goods.id}">update</a>
                <a href="delete?goodsId=${goods.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="add">add</a>
</body>
</html>
