<%--
  Created by IntelliJ IDEA.
  User: 12159
  Date: 2020/3/13
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>upload</title>
    <%
        String path=request.getContextPath();
        String basepath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

    %>
    <base href="<%=basepath%>">
</head>
<body>
    <form action="user/add" method="post" enctype="multipart/form-data">
        <input type="text" name="name" placeholder="please enter username"><br>
        <input type="password" name="password" placeholder="please enter password"><br>
        <input type="file" name="pic"><br>
        <input type="submit" value="add">
    </form>
</body>
</html>
