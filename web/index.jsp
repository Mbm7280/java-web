<%--
  Created by IntelliJ IDEA.
  User: maibangmin
  Date: 2020/8/21
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="getInfo" method="get">
    用户名：<input type="text" name="name" value=""/><br/>
    密码：<input type="text" name="pwd" value=""/><br/>
    爱好：<br/>
    <input type="checkbox" name="fav" value="1">java
    <input type="checkbox" name="fav" value="2">c#
    <input type="checkbox" name="fav" value="3">php
    <input type="submit" value="登录">
  </form>
  </body>
</html>
