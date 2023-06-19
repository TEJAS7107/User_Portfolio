<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3 style="text-align: center; color: blue"> <%@include file="messagebox/message.jsp" %></h3>
<form action="AddEdu" method="post">
<input type="text" name="year" placeholder="Enter your year"><br>
<input type="text" name="std" placeholder="Enter your standard"><br>
<input type="text" name="board" placeholder="Enter your board"><br>
<input type="text" name="school" placeholder="Enter your school"><br><br>
<button>ADD</button>

</form>

</body>
</html>