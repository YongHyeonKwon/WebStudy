<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>PageScope1</h1>
	<% 
		// 1. page 영역에 저장하고자 하는 데이터 입력!
		// page 영역 -> pageContext 객체 -> JSP 내장객체
		pageContext.setAttribute("data", "장지웅");
		
		// 2. 영역에 저장된 데이터 꺼내오기
		String data = (String) pageContext.getAttribute("data");
	%>

	표현식 : <%=data %> <br>
	el표기법 : ${pageScope.data} <br>
	
	<a href="PageScope2.jsp">페이지 이동</a>
	
</body>
</html>