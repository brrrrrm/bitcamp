//서블릿 만들기 5 - HttpServlet 메소드 재정의 
package step01;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//GenericServlet을 상속받는 대신 HTTP 프로토콜을 다루는 기능이 추가된 HttpServlet을 상속받아 만든다


@WebServlet("/step01/exam05")
public class Exam05 extends HttpServlet {
//클라이언트가 실행을 요청하면 명령어에 따라
//적절한 메시지를 출력하도록 상속받은 메소드를 재정의하자

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //웹브라우저의 주소창에 URL을 넣고 엔터를 치면 
        //해당 서버에 get요청을 보낸다 
        //그러면 서블릿 컨테이너가 자바 클래스에 대해 service()를 호출할 것이고
//        이 클래스는 httpservlet을 상속받았기 때문에
//        HttpServlet의 service(ServletRequest,ServletResponse)를 호출할 것이다
        //이 메소드는 다시 오버로딩한 service를 호출할 것이다
//        그리고 이 오버로딩한 메소드는 클라이언트가 요청한 명령에 따라 doGet을 호출할 것이다
//        그래서 이 클래스는 doGet을 오버라이딩하여 우리가 원하는 작업을 수행하도록 하였다
        
        PrintWriter out = response.getWriter();
        out.println("GET 요청^^");
        
        super.doGet(request, response);
    }
}
