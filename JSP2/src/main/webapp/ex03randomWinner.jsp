<%@ page import="java.util.Random"%>
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
		
		// 1. 한글인코딩 잡아주기
		request.setCharacterEncoding("UTF-8");
		// 2. 요청받은 데이터들을 꺼내오기(title, items)
		String subject = request.getParameter("subject");
		String[] items = request.getParameterValues("items");
		// 3. item들 중 랜덤한 결과 하나만 뽑아올 수 있도록 로직 작성!
		Random rd = new Random();
		String result = items[rd.nextInt(items.length)];
	%>
	
		<fieldset>
		<legend align="center">랜덤당첨결과</legend>
				<table align="center">
					<tr>
						<td align="center">
							<%=subject %>
						</td>	
					</tr>
					<tr>
						<td align="center">
							<%=result %>
						</td>
					</tr>
				</table>
	</fieldset>
	
</body>
</html>