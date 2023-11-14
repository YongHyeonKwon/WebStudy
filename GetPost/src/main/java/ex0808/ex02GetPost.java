package ex0808;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetPost")
public class ex02GetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 0. post방식으로 요청이 들어온 경우 요청데이터에 대한 한글인코딩 잡아주는 것
		request.setCharacterEncoding("UTF-8");
		// ★ 반드시 요청받은 데이터를 꺼내오기 전에 한글인코딩을 잡아줄 것 ★
		// 1. 요청받은 데이터 꺼내오기
		String name = request.getParameter("name");
		// 2. 한글인코딩 잡아주기
		response.setContentType("text/html; charset = UTF-8");
		// 3. 출력하는 도구 꺼내주기
		PrintWriter out = response.getWriter();
		// 4. 출력하기
		out.print("입력받은 이름 : " + name);
	}

}
