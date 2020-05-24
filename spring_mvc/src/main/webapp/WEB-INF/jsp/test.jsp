<%--
  Created by IntelliJ IDEA.
  User: 12159
  Date: 2020/3/10
  Time: 0:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%
        String path=request.getContextPath();
        String basepath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

    %>
    <base href="<%=basepath%>">
    <script type="javascript" src="js/jquery-3.1.1.js"></script>
    <script type="javascript">
        $(function(){
            alert("ok");
            $.get("test/test2",
                function (result) {
                    alert(result.name);
                });
        });
    </script>
</head>
<body>
<botton id="btn">test</botton>
</body>
</html>
