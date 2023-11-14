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
		// session이 기억하고 있는 데이터 꺼내오기!
		String nickname = (String) session.getAttribute("nickname");
	%>
	
	<%=nickname %>님 환영합니다. <a href="logout.jsp">로그아웃</a>
</body>
</html>