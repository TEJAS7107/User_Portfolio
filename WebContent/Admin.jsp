<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String s2=(String)session.getAttribute("key");
if(s2==null){
	response.sendRedirect("adminauth.jsp");
}
else{
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<h3 style="text-align: center; color: blue"> <%@include file="messagebox/message.jsp" %></h3>

Welcome<br><br><br>
<a href="edu.jsp">add education</a><br><br><br>
<a href="inbox.jsp">inbox</a><br><br><br>
<a href="delete.jsp">delete Project</a><br><br><br>
<a href="AddProject.jsp">Add Project</a><br><br><br>
<a href="Update.jsp">Upadate Project</a><br><br><br>
<form action="LogOut" method="post">
<button>LOGOUT</button>
</form>
<%@ include file="footer.jsp" %>
</body>
</html>
<%}%>