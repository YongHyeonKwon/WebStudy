<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 요청 데이터를 받아오는 페이지 -->
	<%
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String temp1 = request.getParameter("java");
		String temp2 = request.getParameter("web");
		String temp3 = request.getParameter("iot");
		String temp4 = request.getParameter("android");
		
		int java = Integer.parseInt(temp1);
		int web = Integer.parseInt(temp2);
		int iot = Integer.parseInt(temp3);
		int android = Integer.parseInt(temp4);
		
		int sum = java + web + iot + android;
		int avg = sum / 4;
		
		String grade;
		
		if (avg >= 95) 
			grade = "A+";
		else if (avg >= 90)
			grade = "A";
		else if (avg >= 85)
			grade = "B+";
		else if (avg >= 80)
			grade = "B";
		else 
			grade = "F";
		
		out.print("이름 : " + name);
		out.print("<br>");
		out.print("JAVA점수 : " + java);
		out.print("<br>");
		out.print("WEB점수 : " + web);
		out.print("<br>");
		out.print("IOT점수 : " + iot);
		out.print("<br>");
		out.print("ANDROID : " + android);
		out.print("<br>");
		out.print("학점 : <strong>" + grade + "</strong>");
	%>
	
</body>
</html>