<%@ page errorPage="ErrorPage.jsp"%>
<!-- page 지시자 : 내부 페이지에서 로직에 문제가 발생했을 때 이동할 에러페이지 설정 -->
<%@ page import="java.util.ArrayList"%>
<!-- page 지시자 : import구문 작성 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- page 지시자 : jsp페이지의 전체적인 환경설정 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		ArrayList<String> list = new ArrayList<String>();
		int result = 2/0;
	%>
	
	<!-- 
		지시자 (Directive) 
		: Web Container가 jsp를 .java 파일로 변환할 때,
		  필요한 정보들을 기술하기 위한 구성요소
		(1) page 지시자 
		(2) include 지시자
		(3) taglib 지시자		  
	 -->
	 
	 <%--
	 	구성요소용 주석
	 	지시자 : <%@%>
	 	스크립트릿 : <%%>
	 	표현식 : <%=%>
	 	선언문 : <%!%>
	  --%>
	
</body>
</html>