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
		// 1. 한글 인코딩 잡아주기
		request.setCharacterEncoding("UTF-8");
	
		// 2. 요청 데이터 꺼내오기(5개)
		String name = request.getParameter("name");
		String temp1 = request.getParameter("java");
		String temp2 = request.getParameter("web");
		String temp3 = request.getParameter("iot");
		String temp4 = request.getParameter("android");
		
		// 3. 정수형태로 점수들을 형변환
		int java = Integer.parseInt(temp1);
		int web = Integer.parseInt(temp2);
		int iot = Integer.parseInt(temp3);
		int android = Integer.parseInt(temp4);
		
		// 4, 평균을 계산하기
		float avg = ((float)java + web + iot + android) / 4;
		
		// 5. 학점을 계산하기
		String grade = "";
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
	%>
	
	<fieldset>
		<legend>학점확인프로그램</legend>
				<table align="center">
					<tr>
						<td>이름</td>
						<td> <%=name %> </td>
					</tr>
					<tr>
						<td>JAVA점수</td>
						<td> <%=java %> </td>
					</tr>
					<tr>
						<td>WEB점수</td>
						<td> <%=web %> </td>
					</tr>
					<tr>
						<td>IOT점수</td>
						<td> <%=iot %> </td>
					</tr>
					<tr>
						<td>ANDROID점수</td>
						<td> <%=android %> </td>
					</tr>
					<tr>
						<td>평균</td>
						<td> <%=avg %> </td>
					</tr>
					<tr>	
						<td>학점</td>
						<td> <strong><%=grade %></strong> </td>
					</tr>
				</table>
	</fieldset>
	
</body>
</html>