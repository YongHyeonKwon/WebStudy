package ex0808;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserInfo")
public class ex03UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 0. 요청데이터 한글 인코딩 잡아주기
		request.setCharacterEncoding("UTF-8");
		
		// 1. 요청데이터 꺼내오기
		String position = request.getParameter("position");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		// name값은 하나인데 어러 개의 데이터를 받아와야할 때 사용하는 메소드
		// >> request.getParameterValues("name값")
		// >> 리턴타입 String[]
		
		// 2. 응답데이터 한글 인코딩 잡아주기
		response.setContentType("text/html;charset=UTF-8");
		
		// 3. 출력도구 꺼내오기
		PrintWriter out = response.getWriter();
		
		// 4. 화면 출력하기
		out.print("<h1>" + "직업 : " + position + "</h1>");
		out.print("<h1>" + "성별 : " + gender + "</h1>");
		out.print("<h1>" + "취미 : " 
		+ Arrays.toString(hobby).replace("[", "").replace("]", "") 
		+ "</h1>");
		// (1) 반복문 for문 돌리기
		// (2) Arrays.toString() 사용하기
	
	}

}