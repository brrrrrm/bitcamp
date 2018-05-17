//서블릿 만들기 3 - 추상클래스를 상속받아 간접 구현 
package step01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//javax.servlet.Servlet 인터페이스를 직접 구현하는 것보다 미리 구현한 클래스를 상속받아
//필요한 메소드만 구현하거나 재정의하는 것이 편리
//JAVA에서 이미 GenericServlet이란 클래스를 제공하고 있다
//GenericServlet은 Serializable인터페이스를 상속 받음 

@WebServlet("/step01/exam03")
public class Exam03 extends javax.servlet.GenericServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //클라이언트가 이 서블릿의 실행을 요청할 때마다  호출된다
        //서블릿이 해야할 일을 처리하는 코드를 여기에 둔다
        System.out.println("Exam02.service()");
    }
    
}
