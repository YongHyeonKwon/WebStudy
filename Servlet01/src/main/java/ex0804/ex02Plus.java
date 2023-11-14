package ex0804;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Plus")
public class ex02Plus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 요청받은 데이터 2개 꺼내오기
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		
		// 2. 숫자로 형변환
		int num1= Integer.parseInt(data1);
		int num2= Integer.parseInt(data2);

		// 3. 출력도구 꺼내오기
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		// 4. 출력하기
		out.print(data1 + "+" + data2 + "=" + (num1 + num2));

	}

}
