//자동으로 페이지를 이동하는 방법 - Redirect(HTML 페이지에 삽입)
package step08.ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step08/ex1/exam03")
public class Exam03 extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset = 'UTF-8'>");
        out.println("<title>exam03</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>exam03</h1>");
        out.println("<p>이 내용이 화면에 출력될까????</p>\n");
        out.println("</body>");
        out.println("</html>");
        
        //리다이렉트(redirect)
        //  클라이언트 요청을 다른 서블릿으로 돌리고 싶을 때 사용한다
        //  이 방식도 일종의 페이지 자동 이동 효과를 제공한다
        
        response.sendRedirect("http://www.daum.net");
        
        //rediret의 응답 프로토콜
//        HTTP/1.1 302
//        Location: http://www.daum.net
//        Content-Type: text/html;charset=UTF-8
//        Content-Length: 0
//        Date: Fri, 18 May 2018 02:13:12 GMT

    }
}
