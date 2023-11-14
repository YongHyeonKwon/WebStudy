package com.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.Member;
import com.smhrd.model.MemberDAO;

public class LoginService implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String moveurl = "";
		
		HttpSession session = request.getSession();

		MemberDAO dao = new MemberDAO();
		Member m = new Member(email, pw, "", "");

		Member info = dao.Login(m);

		if (info != null) {
			moveurl = "WEB-INF/Main.jsp";
			session.setAttribute("info", info);
		}
		
		return moveurl;
	}

}
