<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.dao.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.pojo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Read r=new Read();
ArrayList<Photo> al=r.Readpic();
for(Photo p:al)
{
	
%>
<img  style="height: 100px" src="images/project/<%=p.getFilename() %>"><br>
<form action="DeleteProject" method="post">
<input type="hidden" name="fname" value="<%=p.getFilename() %>">
<button>delete</button><br>
</form>

<%} %>

</body>
</html>