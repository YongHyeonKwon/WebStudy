package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;

import com.smhrd.model.Member;
import com.smhrd.model.MemberDAO;

@WebServlet("/Login")
public class LoginProgram extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 인코딩
		request.setCharacterEncoding("UTF-8");
		
		// 데이터 수집
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		// String name = request.getParameter("name");
		
		// 기능 처리
		MemberDAO dao = new MemberDAO();
		Member m = new Member(id, pw, "");
//		m.setId(id);
//		m.setPw(pw);
		
		String name = dao.Login(m);
		
		// view 처리
		String url ="";
		
		if (name != null) {
			url = "WEB-INF/LoginSuccess.jsp";
			request.setAttribute("name", name);
		} else {
			url = "WEB-INF/LoginFail.jsp";
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
