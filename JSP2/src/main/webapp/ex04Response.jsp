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
		response
		: 응답정보를 가지고 있는 객체 
		>> JSP안에서 다른 페이지로 응답을 되돌려주는 방식
	 -->
	 
	 <%
	 	// 1. naver 페이지로 응답할 수 있게끔
	 	response.sendRedirect("https://www.naver.com");
	 	// Client -- request --> Tomcat Server
	 	// Client <-- response(URL) -- Tomcat Server
	 	// Client -- request --> URL Server
	 	// Client <-- response -- URL server
	 	// ★ 요청 2번, 응답 2번 일어나는 방식 : redirect 방식
	 %>
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
</body>
</html>