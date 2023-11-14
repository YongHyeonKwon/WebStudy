package ex0803;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URLmapping
@WebServlet("/TableAnswer")
public class ex02TableAnswer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1) 출력을 도와주는 도구 꺼내오기
		PrintWriter out = response.getWriter();
		
		// 2) 1행 6열 테이블 출력
		out.print("<table border=\"1px solid black\">");
		out.print("<tr>");
		for (int i = 1; i < 10; i++) {
			out.print("<td>" + i + "</td>");
		}
		out.print("</tr>");
		out.print("</table>");
		
	}

}
