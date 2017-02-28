<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  login<hr/>
    <form action="login.do" method="post">
    	userName:<input name="userName"><br/>
    	password:<input name="password" type="password"><br/>
    	<input type="submit" value="Login">
    </form>
    <br/><br/><br/>
    regist<hr/>
    <form action="regist.do" method="post">
    	userName:<input name="userName"><br/>
    	password:<input name="password" type="password"><br/>
    	email:<input name="email"><br/>
    	tel:<input name="tel">
    	<input type="submit" value="Login">
    </form>
  </body>
</html>
