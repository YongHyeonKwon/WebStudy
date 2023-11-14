<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>PageScope2</h1>
	
	<%
		String data = (String) pageContext.getAttribute("data");
	%>
	
	표현식 : <%=data %> <br>
	el 표기법 : ${pageScope.data}
	
</body>
</html>