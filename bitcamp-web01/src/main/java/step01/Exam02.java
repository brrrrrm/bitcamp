//서블릿 만들기 2 - 추상 클래스를 상속 받아 Servlet 인터페이스를 간접 구현하기 
package step01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//javax.servlet.Servlet 인터페이스를 직접 구현하는 것보다 미리 구현한 클래스를 상속받아
//필요한 메소드만 구현하거나 재정의하는 것이 편리

@WebServlet("/step01/exam02")
public class Exam02 extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //클라이언트가 이 서블릿의 실행을 요청할 때마다  호출된다
        //서블릿이 해야할 일을 처리하는 코드를 여기에 둔다
        System.out.println("Exam02.service()");
    }
    
    
}
