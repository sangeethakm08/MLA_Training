<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h1>USer Data</h1>
	<%
	String user =  request.getParameter("user");
	String pas = request.getParameter("pas");
	session.setAttribute("info", user);
	if(user.equals("admin") && pas.equals("java")){
		%>
		<jsp:forward page="success.jsp"></jsp:forward>
		<%
	}
	else {
		out.println("invalid credential");
		%>
		<jsp:forward page="userform.jsp"></jsp:forward>
	<%
	}
	%>
	</center>
</body>
</html>