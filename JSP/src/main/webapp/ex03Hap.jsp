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
		// 1. 결과값을 담을 수 있는 변수 선언
		int sum = 0;
		// 2. 1~100까지의 합을 구해서 sum에 담아주기
		for (int i = 0; i < 101; i++) {
			sum += i;
		}
	%>

	<h1>1~100까지의 합 : <%=sum%></h1>

</body>
</html>