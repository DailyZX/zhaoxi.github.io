<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/14 0014
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>测试</title>
</head>
<body>
<h1>跳转成功</h1>
原生API：${requestScope.reqParam}<br>
        ${sessionScope.sessionParam}
<hr>
request:${requestScope.msg}<br>
session:${sessionScope.msg}<br>
application:${applicationScope.msg}<br>
pageContext:${pageScope.msg}<br>
</body>
</html>
