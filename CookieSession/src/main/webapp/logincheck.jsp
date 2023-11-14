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
		// 서블릿과 같은 기능을 수행하는 공간
		
		// 1. 인코딩
		request.setCharacterEncoding("UTF-8");
		
		// 2. 데이터 수집
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// 3. 기능 처리
		// 로그인에 성공할 수 있는지 없는지 판단!
		if (id.equals("test") && pw.equals("12345")) {	
			// 메인페이지 이동 시 회원의 닉네임을 공유할 수 있도록
			// session영역에 해당 내용을 저장!
			session.setAttribute("nickname", "쿠키몬스터");
			
			// 페이지 이동
			response.sendRedirect("main.jsp");
		}
		else
			response.sendRedirect("loginform.jsp");
	%>
</body>
</html>