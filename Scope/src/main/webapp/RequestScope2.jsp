<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>RequestScope2</h1>
	
	<%
		// RequestScope1 페이지에서 지정한 "nick"값이
		// 실제로 가지고 올 수 있는지 확인해 보기!
		String nick = (String) request.getAttribute("nick");
	%>
	
	${requestScope.nick}

</body>
</html>