<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.dao.*" %>
<%@ page import="com.pojo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Read r= new Read();
ArrayList<Readd> al=r.Readmsg();
for(Readd r1:al)
{
%>

Name:<%=r1.getName() %><br>
email:<%=r1.getEmail() %><br>
Message:<%=r1.getMessage() %><br><br><br>


<%} %>
</body>
</html>