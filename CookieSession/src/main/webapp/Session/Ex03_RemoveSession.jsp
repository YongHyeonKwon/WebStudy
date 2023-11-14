<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>session을 하나씩 삭제하는 페이지</h1>
	<%
		session.removeAttribute("name");
		// session.removeAttribute("address");
		session.removeAttribute("age");
	%>

	<a href = "Ex02_GetSession.jsp">세션확인</a>
	
</body>
</html>