package ex0808;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class ex01Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");	
		String pw = request.getParameter("pw");
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		if (id.equals("smart") && pw.equals("123")) {
			out.print("<h1>" + id + "님 환영합니다." + "</h1>");
		} else {
			out.print("<h1>" + "아이디와 비밀번호를 잘못 입력하셨습니다." + "</h1>");
		}
	}

}
