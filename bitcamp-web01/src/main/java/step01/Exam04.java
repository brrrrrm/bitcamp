//서블릿 만들기 4 - HTTP 프로토몰을 다루는 기능이 추가된 HttpServlet 상속받아 간접 구현 
package step01;


import javax.servlet.annotation.WebServlet;

//GenericServlet을 상속받는 대신 HTTP 프로토콜을 다루는 기능이 추가된 HttpServlet을 상속받아 만든다


@WebServlet("/step01/exam04")
public class Exam04 extends HttpServlet {
    //클라이언트가 실행을 요청하면 
//    Http프로토콜의 명령에 따라 상속받은 메소드 중
//    doGet, doPost, doHead가 호출될 것이다
//    그런데 이 메소드들을 오버라이딩하지 않았기 때문에 
//    원래 작성된 대로 예외를 던진다
}
