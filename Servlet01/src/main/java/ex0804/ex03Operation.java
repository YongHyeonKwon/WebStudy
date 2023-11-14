package ex0804;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ex03Operation
 */
@WebServlet("/Operation")
public class ex03Operation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//  1. 요청받은 데이터 3개 꺼내오기
		String temp1 = request.getParameter("num1");
		String temp2 = request.getParameter("num2");
		String op = request.getParameter("op");
		
		// 2. num1, num2는 숫자형식으로 형변한
		int num1 = Integer.parseInt(temp1);
		int num2 = Integer.parseInt(temp2);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		// 3. 연산기호의 모양에 따라 연산결과 계산
		// 4. 출력해주는 도구 꺼내오기
		// 5. 결과값 출력하기
		if(op.equals("+"))
			out.print(num1 + op + num2 + "=" + (num1 + num2));
		else if(op.equals("-"))
			out.print(num1 + op + num2 + "=" + (num1 - num2));
		else if(op.equals("*"))
			out.print(num1 + "×" + num2 + "=" + (num1 * num2));
		else if(op.equals("/"))
			out.print(num1 + "÷" + num2 + "=" + (num1 / num2));
	}

}
