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

String name = request.getParameter("name");

String fruit[] = request.getParameterValues("fruit");

%>

<table border="1px solid black">
        <tr>
            <td align="center" colspan="2">이름</td>
            <td align="center" colspan="2">
				<%=name %>
			</td>
        </tr>
        <tr>
            <td align="center" colspan="2">좋아하는 과일</td>
            <td align="center" colspan="2">
				<% 
						for (int i = 0; i < fruit.length; i++) {%>
						<%=fruit[i]%>
						<%}%>
			</td>
            <!--셀을 세로로 병합할 때는 rowspan="합칠 값"-->
        </tr>
      
    </table>
    
</body>
</html>