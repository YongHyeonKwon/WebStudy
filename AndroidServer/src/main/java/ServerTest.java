

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServerTest")
public class ServerTest extends HttpServlet {
   private static final long serialVersionUID = 1L;
   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      
      
      System.out.println("서버 요청 들어옴!");
      
      String id = request.getParameter("id");
      String pw = request.getParameter("pw");
     
      
      System.out.println(id + "/" + pw);
      
      PrintWriter out = response.getWriter();
      out.print("{\"result\":\"1\"}");
      out.print("{\"result\":\"2\"}");
    
      
      
   }

}