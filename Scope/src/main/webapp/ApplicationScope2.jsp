<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>ApplicationScope2</h2>
	
	<%
		String nick = (String) application.getAttribute("nick");
	%>
	
	${applicationScope.nick}
	
</body>
</html>