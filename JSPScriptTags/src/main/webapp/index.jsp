<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		Declaring Variables and function
		using Declaration Tag
	-->
	<%!
		String name = "ishwar Bachhav";
		int rollNo = 101;
		
		String display(){
			return "Display() Function called";	
		}
	%>
	<!-- 
		Embedding Java Code in JSP file 
		using Scriptlet Tag
	-->
	<%
		for(int i=0; i<10;i++){
			out.println(i);
			out.println("\n");
		}
	%>
	<br>
	<!-- Printing values using Expression Tag -->
	name:<%=name%><br>
	RollNo:<%=rollNo%><br>
	Calling Function :<%=display()%><br>
	RandomNo. :<%=Math.random() %>
</body>
</html>