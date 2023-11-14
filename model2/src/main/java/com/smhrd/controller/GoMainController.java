package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/goMain")
public class GoMainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// urlMapping에 go단어가 붙으면 해당하는 서블릿의 기능은
		// 페이지 이동 기능만 갖는다!
		
		// servlet -> servlet => redirect
		// servlet -> jsp => forward
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Main.jsp");
		rd.forward(request, response);
	}

}
