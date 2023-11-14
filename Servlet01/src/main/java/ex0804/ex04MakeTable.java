package ex0804;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ex04MakeTable
 */
@WebServlet("/MakeTable")
public class ex04MakeTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String temp = request.getParameter("num");
		
		int num = Integer.parseInt(temp);
		
		PrintWriter out = response.getWriter();
		
		out.print("<table border=\"1px solid black\">");
		out.print("<tr>");
		for (int i = 1; i <= num; i++) {
			out.print("<td>" + i + "</td>");
		}
		out.print("</tr>");
		out.print("</table>");
	}

}
