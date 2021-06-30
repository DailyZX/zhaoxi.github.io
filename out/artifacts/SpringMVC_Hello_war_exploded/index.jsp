<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/14 0014
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" isErrorPage="true" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<a href="hello">11</a><br/>
<a href="handle01">写在方法上的requestMapping</a><br/>
<a href="haha/handle01">写在类上上的requestMapping</a><br/>
<a href="haha/handle02">指定参数username</a><br/>
<a href="haha/handle03">指定参数header</a><br/>

  <hr>
<a href="antTest01">?号的模糊匹配</a><br/>
<a href="a/b/antTest01">*号的模糊匹配</a><br/>
<a href="user/admin">测试PathVariable</a><br/>
<hr>

<%--  创建rest风格--%>
<a href="book/1">查询图书</a><br/>
<form action="book" method="post">
  <input type="submit" value="添加1号图书"/>
</form><br/>


<!-- 发送DELETE请求 -->
<form action="book/1" method="post">
  <input name="_method" value="delete"/>
  <input type="submit" value="删除1号图书"/>
</form><br/>

<!-- 发送PUT请求 -->
<form action="book/1" method="post">
  <input name="_method" value="put"/>
  <input type="submit" value="更新1号图书"/>
</form><br/>

<hr>
  <a href="TheDefault">请求参数默认方式</a>
  <a href="requestParam">请求参数requestParam</a>

  <hr>
<form action="addbook" method="post">
  书名:<input type="text" name="bookName"/><br/>
  作者:<input type="text" name="author"/><br/>
  价格:<input type="text" name="price"/><br/>
  库存:<input type="text" name="stock"/><br/>
  销量:<input type="text" name="sales"/><br/>
  <hr/>
  省：<input type="text" name="address.province"/>
  市：<input type="text" name="address.city"/>
  街道:<input type="text" name="address.street"/><br/>
  <input type="submit"/>

  <hr>
 <a href="API">原生API</a>

  <hr>
  <a href="map">测试map中的数据</a><br>
  <a href="model">测试map中的数据</a><br>
  <a href="modelMap">测试nodelMap中的数据</a><br>
  <a href="modelAndView">测试modelAndView中的数据</a><br>
</form>
<hr>
<h1>修改图书-不能修改书名</h1>
<form action="updateBook" method="post">
    <input type="hidden" name="id" value="100"/>
    书名：西游记；<br/>
    作者：<input type="text" name="author"/><br/>
    价格：<input type="text" name="price"/><br/>
    库存：<input type="text" name="stock"/><br/>
    销量：<input type="text" name="sales"/><br/>
    <input type="submit" value="修改图书"/>
</form>
  </body>
  </html>