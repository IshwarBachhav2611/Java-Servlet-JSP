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
		String name = (String)request.getSession().getAttribute("name");
		String contact = (String)request.getSession().getAttribute("contact");
		String email = (String)request.getSession().getAttribute("email");	
		String password = (String)request.getSession().getAttribute("password");	
		
	%>
	<h3>Login Successful...!</h3>
	<h3>UserDetails:</h3>
	<h4>Name : <%=name%></h4>
	<h4>Contact : <%=contact%></h4>
	<h4>Email : <%=email%></h4>
	<h4>Password : <%=password%></h4>
	
	<form action="logout">
		<input type="submit" value="Logout">
	</form>
</body>
</html>