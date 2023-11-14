<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
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
			int number = Integer.parseInt(request.getParameter("number"));
		%>
		<fieldset>
		<legend align="center">랜덤당첨작성</legend>
			<form action="ex03randomWinner.jsp" method="post">
				<table align="center">
					<tr>
						<td>주제 : </td>
						<td><input type="text" name="subject"></td>	
					</tr>
					<% 
						for (int i = 1; i <= number; i++) {%>
							<tr>
								<td>
									아이템<%=i %> : 
								</td>
								<td>
									<input type="text" name="items">
								</td>
							</tr>					
					<%}%>
					<tr>
						<td colspan="2" align="center">
							<input type="submit" value="시작">
						</td>
					</tr>
				</table>
			</form>
	</fieldset>
	<!-- <c:forEach begin="1" end="${param.number}" var="i">
			<tr>
				<td>아이템${i}</td>
				<td><input type="text" name="item" value=""></td>
			<tr>
		</c:forEach>
		
			for (int i = 1; i <= number; i++) {
				out.print("<tr>");
				out.print("<td>");
				out.print("아이템" + i + " :");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type='text' name='item' value=name>");
				out.print("</td>");
				out.print("</tr>");
			}
	-->

</body>
</html>