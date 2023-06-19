<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="com.dao.*" %>
<%@ page import="com.controller.*" %>
<%@ page import="com.pojo.*" %>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% Read r=new Read(); 
ArrayList<Photo>al=r.Readpic();
for(Photo ad:al)
{
%>


<form action="UpdateProject" method="post" enctype="multipart/form-data">

<input type="hidden" name="oldname" value="<%=ad.getFilename()%>"><br><br>

<img alt="" src="images/project<%=ad.getFilename()%>">


<input type="text" name="nname" value="<%=ad.getTitle()%>"><br><br>
<input type="file" name="file"><br><br>
<button>UPDATE</button>

</form>


<%}%>
</body>
</html>