<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Cookie를 확인하기 위한 페이지</h1>
	<%
		// 쿠키 꺼내오기!
		Cookie[] cookies = request.getCookies();
				
		// cookies 안에 있는 name과 values값 가져오기
		// name -> .getName()
		// value -> .getValue()
		// 출력결과는 ouet.print() 통해서 확인하기!
		
		for(Cookie c:cookies) {
			out.print("name : " + c.getName() + " ");
			out.print("values : " + c.getValue());
			out.print("<br>");
		}
	%>
	
	<a href="Ex03_RemoveCookie.jsp">쿠키 삭제</a>
	
	
	
</body>
</html>