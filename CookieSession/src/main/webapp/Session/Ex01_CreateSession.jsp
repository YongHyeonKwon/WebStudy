<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Sesseion 생성 페이지</h1>
	<%
		// session 생성
		// setAttribute(name(문자열), value(Object))
		// 쿠키와는 다르게 데이터값에 공백이나 특수기호가 들어갈 수 있다
		
		session.setAttribute("name", "장지웅");
		session.setAttribute("address", "광주 남구 송암동");
		session.setAttribute("age", 25);			
	
	%>
	
	<a href="Ex02_GetSession.jsp">세션확인</a>
	
</body>
</html>