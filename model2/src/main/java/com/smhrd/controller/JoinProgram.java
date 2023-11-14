package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.Member;
import com.smhrd.model.MemberDAO;

@WebServlet("/Join")
public class JoinProgram extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 0. url Mapping (생략)
		
		// 1. 인코딩
		request.setCharacterEncoding("UTF-8");
		
		// 2. 데이터 수집
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		// 3. 기능 처리
		// package
		// com.smhrd.controller
		// com.smhrd.
		
		// - DB 연결 정보 정리! -> db.properties -> 일반 File생성
		// - DB 정보를 활용(연결)할 수 있는 파일 (xml) -> config.xml
		//   -> 일반 xml 생성 (관련 코드 : Mybatis 사이트 활용!)
		//   -> sql 파일(Mapper.xml)연결 경로 지정
		// - Mapper.xml 생성 -> Mybatis전용 xml 생성!
		// - MemberDAO 클래스 / Member 클래스 생성
	
		MemberDAO dao = new MemberDAO();
		Member m = new Member(id, pw, name);
		
		int cnt = dao.Join(m);

		// 4. view 처리
		String url = "";
		
		if (cnt > 0) {
			url = "WEB-INF/Main.jsp";
			// response.sendRedirect("goMain");
		} else {
			url = "WEB-INF/Login.jsp";			
			// response.sendRedirect("goLogin");
		}
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
