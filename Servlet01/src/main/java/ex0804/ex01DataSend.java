package ex0804;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DataSend")
public class ex01DataSend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 요청받은 데이터 꺼내오기
		String data = request.getParameter("data");
		
		// 2. 화면에 출력하기
		// (1) 한글인코딩 잡아주기
		response.setContentType("text/html; charset=UTF-8");
		// (2) 출력 도구 꺼내오기
		PrintWriter out = response.getWriter();
		// (3) 췝 화면에 출력하기
		out.print("<h1>" + data + "</h1>");
	}

}
