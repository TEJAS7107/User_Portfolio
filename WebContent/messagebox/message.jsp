<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <% String s4=(String)session.getAttribute("msg");
    if(s4!=null){
    	
    	out.print(s4);
    }
    session.removeAttribute("msg");
    	
    
    %>


</body>
</html>