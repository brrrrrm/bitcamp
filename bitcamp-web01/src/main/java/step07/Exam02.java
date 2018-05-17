//서블릿 생성과 load-on-starter 옵션
package step07;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//loadOnStartup = 생성 순서 
//번호가 빠른 순서대로 먼저 
@WebServlet(value = "/step07/exam02", loadOnStartup=1)
public class Exam02 extends HttpServlet{
    private static final long serialVersionUID = 1L;

    
    public Exam02() {
        //클라이언트로부터 최초로 실행 요청이 들어오면 객체가 생성된다  
        System.out.println("step07.exam02호출");
    }
    
    @Override
    public void init() throws ServletException {
        //서블릿컨테이너가 init(ServletConfig)를 호출하면 본 메소드를 호출된다
        //따라서 서블릿이 작업하는데 필요한 자원을 준비하고 싶다면 본 메소드를 오버라이딩 하면 된다
        System.out.println("step07.exam02.init() 호출");
    }

    //다른 서블릿들을 위해 초기화 작업을 수행하는 서블릿인 경우 굳이 service()나 do~()를 만들 필요가 없다
    //왜? 클라이언트에서 실행할 서블릿이 아니기 때문이다
    @Override
    protected void doGet(
            HttpServletRequest request, HttpServletResponse response) 
                    throws ServletException, IOException {
        //클라이언트가 GET요청을 했을 때 호출된다
        System.out.println("step07.exam02.service() 호출");
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("헬로");
    }
}
