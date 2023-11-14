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
		// 로그아웃 페이지로 session에 저장된 회원의 정보를 삭제하고
		// 다시 loginform.jsp로 이동할 수 있도록 한다!
		session.removeAttribute("nickname");
		response.sendRedirect("loginform.jsp");
		
		System.out.print("nick : " + session.getAttribute("nick"));
	%>
</body>
</html>