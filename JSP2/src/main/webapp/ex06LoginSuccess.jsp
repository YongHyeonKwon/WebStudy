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
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
	%>
	
		<fieldset style="border:dotted">
			<table align="center">
				<tr>
					<td><h1><%=id %>님 환영합니다!</h1></td>
				</tr>
				<tr>
					<td><a href="#">로그아웃<a></td>
				</tr>				
			</table>
		</fieldset>
</body>
</html>