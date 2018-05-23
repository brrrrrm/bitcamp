//쿠키 : 쿠키를 사용할 범위 지정하기 
package step10.ex2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step10/ex2/exam03")
public class Exam03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Cookie cookie1 = new Cookie("c1", "aaa");
        cookie1.setPath("/");
        //웹브라우저가 쿠키를 받은 서버에 요청할 때 "/"로 시작하는 요청에 대해서는 c1쿠키를 보낸다
        Cookie cookie2 = new Cookie("c2", "123");
        cookie2.setPath("/bitcamp-web01/step10/ex2");
        //웹브라우저가 쿠키를 받은 서버에 요청할 때 bitcamp-web01/step10로 시작하는 경우 c2쿠키를 보낸다
        
        Cookie cookie3 = new Cookie("c3", "ccc");
        cookie3.setPath("/bitcamp-web01/step10/ex2/exam04");
        //웹브라우저가 쿠키를 받은 서버에 요청할 때 "/bitcamp-web01/step10/ex2/exam04"로 시작하는 경우 c3쿠키를 보낸다
        
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        response.addCookie(cookie3);
        
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("쿠키 보냄");
        
//        쿠키를 클라이언트로 보내는 Http 프로토콜?
//        HTTP/1.1 200
//        Set-Cookie: c1=aaa; Path=/
//        Set-Cookie: c2=123; Path=/bitcamp-web01/step10
//        Set-Cookie: c3=ccc; Path=/bitcamp-web01/step10/ex2/exam04
//        Content-Type: text/plain;charset=UTF-8
//        Content-Length: 15
//        Date: Wed, 23 May 2018 02:25:11 GMT

        
    }
}
