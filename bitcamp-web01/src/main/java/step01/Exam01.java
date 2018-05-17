//서블릿 만들기
package step01;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//javax.servlet.Servlet 규칙에 따라 클래스를 만들어야 한다 
//Servlet 인터페이스 
//를 호출하는 것은? 서블렛 컨테이너 
//예) 톰캣 서버
//일반적으로 실행할 수 있는 자바 클래스를 만들듯이 main()클래스를 만들어봐야 소용 없다
//서블릿 컨테이너가 호출할 클래스이기 때문에 
//서블릿 컨테이너가 호출하는 메소드를 갖는 클래스를 만들어야 한다
//서블릿 컨테이너가 어떤 메소드를 호출할지 이미 규칙으로 정의되어 있다
//바로 그 규칙이 Servlet 인터페이스다

//이렇게 만든 서블릿을 실행하려면 서블릿 컨테이너에 등록해야 한다
//@WebServlet("실행할 때 사용할 이름")
//=>실행할 때 사용할 이름 : root 경로(/)로 시작, 웹 브라우저에서 요청할 때 사용, 파일 경로처럼 중간에 슬래시를 사용하여 이름을 길게 지을 수 있다
//ex)/member/list, /team/member/list

//웹 브라우저에서 이 서블릿의 실행을 요청하는 방법
//주소창에 다음 형식으로 url을 입력
//http://서버주소:포트번호/웹어플리케이션이름/서블릿이름
//예)http://localhost:8888/bitcamp-web01/step01/Exam01

@WebServlet("/step01/exam01")
public class Exam01 implements Servlet {
    
    ServletConfig config;
    
    public Exam01() {
        System.out.println("Exam01()");
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        // TODO Auto-generated method stub
        //객체 생성(생성자가 호출된) 후 호출된다. => 서블릿이 작업하는 데에 필요한 자원을 준비하는 코드를 여기에 두면 된다
        System.out.println("Exam01.init()");
        this.config = config;
        
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //클라이언트가 이 서블릿의 실행을 요청할 때마다  호출된다
        //서블릿이 해야할 일을 처리하는 코드를 여기에 둔다
        System.out.println("Exam01.service()");
        
    }
    
    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        //웹 어플리케이션을 멈추거나 서블릿 컨테이너를 종료할 때 호출된다
        //=>init()에서 준비한 자원을 해제하는 코드를 여기에 둔다 
        System.out.println("Exam01.destory()");
        
    }
    
    @Override
    public String getServletInfo() {
        // TODO Auto-generated method stub
        // 서버 관리자 메뉴에서 서블릿에 대한 간단한 정보를 출력하려 할 때 호출된다
        // 서블릿에 대한 간단한 정보를 리턴한다
        return "Exam01 서블릿!";
    }
    
    @Override
    public ServletConfig getServletConfig() {
        // TODO Auto-generated method stub
        // 서블릿 프로그래밍을 하면서 서블릿에 대한 설정 정보가 필요할 때 호출한다
        //=> init()에서 파라미터로 받은 객체를 그대로 리턴한다
        return this.config;
    }
    
}
