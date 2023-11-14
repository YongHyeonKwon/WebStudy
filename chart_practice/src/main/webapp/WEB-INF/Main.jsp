<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.smhrd.model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		request.getAttribute("list");
	
	%>
	<table>
		<c:forEach var="list" items="${list}" varStatus="status">
			<tr>
				<td>${status.count}</td>
				<td>${list.name}</td>
				<td>${list.age}</td>
				<td>${list.gender}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>