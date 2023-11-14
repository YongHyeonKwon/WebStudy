<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>session 확인 페이지</h1>
	<%
		// .getAttribute()의 반환값은 Object 타입!
		// 해당하는 타입을 일정한 타입에 저장하기 위해선 다운캐스팅이 필요하다!
		String name = (String) session.getAttribute("name");
		String address = (String) session.getAttribute("address");
		Integer age = (Integer) session.getAttribute("age");
		
		// 정수형을 사용하는 경우 session의 값이 삭제되는 경우를 생각하여
		// 기본 자료형인 int가 아니라 객체타입인 integer를 사용한다!
		
		// session 값 수정하기 -> 수정하고 싶은 데이터의 name에
		// 데이터 값만 덮어쓰기를 해준다!
		session.setAttribute("name", "손지영");
	%>
	
	이름 : <%=name %> <br>
	주소 : <%=address %> <br>
	나이 : <%=age %> <br>
	
	<a href="Ex01_CreateSession.jsp">세션생성</a> <br>
	<a href="Ex03_RemoveSession.jsp">세션삭제</a> <br>
	<a href="Ex04_invalidateSession.jsp">세션모두삭제</a>
	
</body>
</html>