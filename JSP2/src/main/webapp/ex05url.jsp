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
		String url = request.getParameter("url");
		response.sendRedirect(url);
	%>
	
	<!-- 
		String url2 = "";
		
		if (url.equals("네이버"))
			url2 = "https://www.naver.com";
		else if (url.equals("다음"))
			url2 = "https://www.daum.net";
		else if (url.equals("구글"))
			url2 = "https://www.google.com";
	 -->
</body>
</html>