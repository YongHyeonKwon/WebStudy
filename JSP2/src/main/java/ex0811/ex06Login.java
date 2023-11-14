package ex0811;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class ex06Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// 1 .요청데이터 꺼내오기(id, pw)
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		// 2. id가 smart 그리고 pw 123과 일치하는지 확인
		if (id.equals("smart") && pw.equals("123"))
			// 3. 일치한다면 ex06LoginSuccess.jsp 이동
			response.sendRedirect("ex06LoginSuccess.jsp?id="+id);
			// 앞쪽 url (http://localhost:8090/JSP2)이 동일하다면,
			// 뒤쪽에 있는 url pattern만 작성해주면 된다!!!!!
			
		else
			// 3. 일치한다면 ex06LoginFail.jsp 이동
			response.sendRedirect("ex06oginFail.jsp");
	}
}
