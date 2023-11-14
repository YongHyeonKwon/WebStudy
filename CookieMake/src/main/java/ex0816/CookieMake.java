package ex0816;

import java.io.IOException;
import java.util.Arrays;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieMake")
public class CookieMake extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		// 1. 인코딩
		request.setCharacterEncoding("UTF-8");
		
		// 2. 데이터 수집
		String[] products = request.getParameterValues("product");
		
		// 3. 기능 처리
		// 쿠키에 해당값들을 담아서 관리!
		for (int i = 0; i < products.length; i++) {
			String data = URLEncoder.encode(products[i], "UTF-8");
			Cookie cookie = new Cookie("item" + i, data);
			// "item" + 0 -> "item0"
			response.addCookie(cookie);
		}
		// 4. view 처리
		
		response.sendRedirect("Cookie.jsp");
	}

}
