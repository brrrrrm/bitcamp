//세션 : 생성 
package step10.ex3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/step10/ex3/exam01")
public class Exam01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //세션 생성
        HttpSession session = request.getSession();
        
        //세션에 값 저장
        //서버 쪽에 저장하는 것이기 때문에 어떤 값이라도 저장할 수 있다ㄴ
        //즉 문자열 외에 숫자, 객체 모두 저장할 수 있다
        session.setAttribute("s1", "aaa");
        session.setAttribute("s2", 200); //autoboxing 수행하여 객체로 변환 후 저장
        session.setAttribute("s3", new Date());
        
        response.setContentType("text/plain;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("세션을 만들고 세션에 값을 저장했습니다.");
        out.println("그리고 세션이 아이디를 쿠키로 보냈습니다.");
        
        //세션 생성
        //- getSession()을 호출하면 우선 웹브라우저가 보낸 쿠키 중에서 세션 아이디가 있는지 확인한다
//        만약 없다면 새 세션 객체(HttpSession)를 생성한 후 그 세션 객체를 리턴한다
//        응답할 때 새로 생성한 세션 객체의 아이디를 웹브라우저로 쿠키에 담아 전달한다
//        HTTP 응답 프로토콜 예
        
//        HTTP/1.1 200
//        Set-Cookie: JSESSIONID=826653BC4001B221514CDD5B68AE6BC9; Path=/bitcamp-web01; HttpOnly
//        Content-Type: text/plain;charset=utf-8
//        Content-Length: 119
//        Date: Wed, 23 May 2018 05:22:52 GMT
        
    }
}
