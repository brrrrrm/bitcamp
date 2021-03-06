//쿠키 : 한글데이터 꺼내기
package step10.ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step10/ex1/exam04")
public class Exam04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Cookie[] cookies = request.getCookies();
        
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("클라이언트가 보낸 쿠키들:");
        for(Cookie cookie: cookies) {
            out.printf("%s=%s\n", cookie.getName(), cookie.getValue());
            //만약 웹브라우저가 보낸 쿠키의 값이 URL인코딩되어 있다면 직접  URL 디코딩해야한다
            //톰캣 9에서는 자동으로 처리하기 때문에 디코딩을 안 해줘도 되지만
            //실무 이하 버전에서는 반드시 디코딩해한다
            
        }
        
    }
}
