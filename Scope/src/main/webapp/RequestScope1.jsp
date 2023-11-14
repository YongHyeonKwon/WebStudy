<%@page import="org.apache.tomcat.util.http.fileupload.RequestContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>RequestScope1</h1>
	
	<%
		request.setAttribute("nick", "둥둥");
		String nick = (String) request.getAttribute("nick");
	%>
	
	${requestScope.nick}
	
	<%	
		// 응답에 대한 페이지 이동
		// response.sendRedirect("RequestScope2.jsp");
		
		// sendRedirect는 요청과 응답이 각각 두번씩 진행되므로 
		// 정보를 공유할 수 없다!
				
		// 이를 해결하기 위해 forward방식을 사용!
		RequestDispatcher rd = request.getRequestDispatcher("RequestScope2.jsp");
		rd.forward(request, response);
	%>
	
</body>
</html>