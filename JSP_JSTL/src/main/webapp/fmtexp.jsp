<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri ="jakarta.tags.core" prefix="c" %>
    <%@ taglib uri ="jakarta.tags.fmt" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="cdate" value="<%= new Date() %>"></c:set>
	<c:out value="${cdate}"></c:out>
	<h1>Date Time format</h1>
	<h3>
		time:<f:formatDate type="time" value="${cdate}"/><br>
		date:<f:formatDate type="date" value="${cdate}"/><br><br>
		
		date and time short : <f:formatDate type="both" dateStyle="short" value="${cdate}"/><br>
		date and time long : <f:formatDate type="both" dateStyle="long" value="${cdate}"/><br>
		date and time medium: <f:formatDate type="both" dateStyle="medium" value="${cdate}"/><br>

		date and time pattern: <f:formatDate pattern="yyyy-MM-dd" value="${cdate}"/><br>
		
	</h3>
</body>
</html>