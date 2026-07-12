<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String email = (String) request.getAttribute("email");
		String password = (String) request.getAttribute("password");
	%>
	<h3>Welcome User..!</h3>
	<h2>Name :<%= email%></h2>
	<h2>Name :<%= password%></h2>
</body>
</html>