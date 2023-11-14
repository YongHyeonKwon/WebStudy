package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.smhrd.model.Board;
import com.smhrd.model.BoardDAO;
import com.smhrd.model.Member;
import com.smhrd.model.MemberDAO;
import com.smhrd.model.Message;
import com.smhrd.model.MessageDAO;

// *.do -> 어떤 페이지가 요청을 하더라도 요청 시 .do가 달려있다면
// frontcontroller에서 모든 요청을 받을 수 있다.
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// FrontController 역할!
		// : 클라이언트가 어떤 요청을 하더라도 가장 먼저
		// 요청을 받는 서블릿
		// : 서블릿 니에서 공통적으로 사용되는 코드를 줄이거나
		//   여러개 생성되어 있는 서블릿을 하나의 서블릿으로 통제하기 위하여 사용한다!
		
		// 1. 클라이언트의 요청에 대하여 한곳으로 모일 수 있는 구조 만들기! -> 
		// - "*.do" 활용
		// - 요청하는 시점에서 상상 .do를 붙여서 요청하기!
		
		// 2. 클라이언트가 요청한 주소가 어디인지 판단!
		
		// 3. 판단된 결과에 따라 조건문을 사용하여 기능을 분리
		

		// 1. 클라이언트 요청 받아오기!
		// http://localhost:8090/MessageSystem/goMain.do

		request.setCharacterEncoding("UTF-8");

		String uri = request.getRequestURI();
		System.out.println("요청된 uri : " + uri);

		// 2. 어떤 요청이 들어왔는지 판단 하기!
		String contextpath = request.getContextPath();
		System.out.println("프로젝트 명 : " + contextpath);

		// 요청된 서블릿의 이름만 가져오기!
		String result = uri.substring(contextpath.length());
		System.out.println("요청 이름 : " + result);

		// 3. 실제 해당하는 기능이 수행되도록 연결하기!

		HttpSession session = request.getSession();
		String moveurl = "";

		if (result.equals("/goMain.do")) {
			// 메인으로 이동할 수 있는 기능 작성
			moveurl = "WEB-INF/Main.jsp";
		} else if (result.equals("/Join.do")) {

			String email = request.getParameter("email");
			String pw = request.getParameter("pw");
			String phone = request.getParameter("phone");
			String address = request.getParameter("address");

			MemberDAO dao = new MemberDAO();
			Member m = new Member(email, pw, phone, address);

			String url = "";

			try {
				int cnt = dao.Join(m);
				moveurl = "WEB-INF/JoinSuccess.jsp";
				request.setAttribute("email", email);
			} catch (Exception e) {

			}
		} else if (result.equals("/Login.do")) {
			
			LoginService service = new LoginService();
			service.execute(request, response);
//			String email = request.getParameter("email");
//			String pw = request.getParameter("pw");
//
//			MemberDAO dao = new MemberDAO();
//			Member m = new Member(email, pw, "", "");
//
//			Member info = dao.Login(m);
//
//			if (info != null) {
//				moveurl = "WEB-INF/Main.jsp";
//				session.setAttribute("info", info);
//			}
		} else if (result.equals("/goLogout.do")) {
			session.removeAttribute("info");
		} else if (result.equals("/Message.do")) {

			String sendName = request.getParameter("sendName");
			String receiveEmail = request.getParameter("receiveEmail");
			String message = request.getParameter("message");

			// 3. 기능처리
			Message msg = new Message();
			msg.setSendName(sendName);
			msg.setReceiveEmail(receiveEmail);
			msg.setMessage(message);

			MessageDAO dao = new MessageDAO();

			int cnt = dao.insertMsg(msg);

			moveurl = "WEB-INF/Main.jsp";

		} else if (result.equals("/OneMsgDel.do")) {

			String temp = request.getParameter("num");
			int num = Integer.parseInt(temp);

			MessageDAO dao = new MessageDAO();

			dao.deleteOne(num);

			moveurl = "WEB-INF/Main.jsp";

		} else if (result.equals("/Update.do")) {

		} else if (result.equals("/goUpdate.do")) {
			moveurl = "WEB-INF/UpdateMember.jsp";
		} else if (result.equals("/AllMsgDel.do")) {

			Member info = (Member) session.getAttribute("info");
			MessageDAO dao = new MessageDAO();

			int cnt = dao.deleteAll(info.getEmail());

			moveurl = "WEB-INF/Main.jsp";

		} else if (result.equals("/goBoard.do")) {
			moveurl = "WEB-INF/BoardMain.jsp";
		} else if (result.equals("/Board.do")) {

			String path = request.getServletContext().getRealPath("file");

			int maxSize = 1024 * 1024 * 5;

			String encoding = "UTF-8";

			MultipartRequest multi = new MultipartRequest(request, path, maxSize, encoding,
					new DefaultFileRenamePolicy());

			String title = multi.getParameter("title");
			String writer = multi.getParameter("writer");
			String content = multi.getParameter("content");
			String filename = multi.getFilesystemName("filename");

			BoardDAO dao = new BoardDAO();
			Board b = new Board();

			b.setTitle(title);
			b.setWriter(writer);
			b.setFilename(filename);
			b.setContent(content);

			int cnt = dao.write(b);

			if (cnt > 0) {
				moveurl = "WEB-INF/BoardMain.jsp";
			}

		} else if (result.equals("/goWrite.do")) {
			moveurl = "WEB-INF/BoardWrite.jsp";
		} else if (result.equals("/goDetail.do")) {

			String temp = request.getParameter("num");

			int num = Integer.parseInt(temp);

			BoardDAO dao = new BoardDAO();
			Board board = new Board();

			board = dao.showDetail(num);

			request.setAttribute("board", board);

			moveurl = "WEB-INF/BoardDetail.jsp";

		}

		RequestDispatcher rd = request.getRequestDispatcher(moveurl);
		rd.forward(request, response);

	}

}
