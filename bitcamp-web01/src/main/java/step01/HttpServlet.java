//GenericServlet + HttpProtocol기능 추가 = HttpServlet
package step01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//추상메소드가 없지만 이 메소드의 목적이 서브 클래스에게 공통 기능을 상속해주는 용도이기 때문에
//바로 사용할 수 없도록 추상 클래스로 선언한다 
public abstract class HttpServlet extends GenericServlet{
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // 파라미터로 넘어오는 것은 실제로 HTTP 프로토콜을 다룰 수 있는 객체가 넘어온다
        // 즉 ServletRequest 대신에 자식 객체인 HttpServletRequest가 넘어온다
        // ServletResponse 대신에 그 자식 객체인 HttpServletResponse 객체가 넘어온다
        // 따라서 이들 객체로 형변환해도 된다
        HttpServletRequest httpReqluest = (HttpServletRequest) req;
        HttpServletResponse httpResponse = (HttpServletResponse) res;
        this.service(httpReqluest, httpResponse);
    }
    
    //개발 편이를 위해 service메소드를 추가한다
    protected void service(
            HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //이 메소드는 클라이언트가 요청한 명령에 따라 또 다른 메소드를 호출한다 
        String command = request.getMethod();
        switch (command) {
        case "GET": doGet(request, response); break;
        case "POST": doGet(request, response); break;
        case "HEAD": doHead(request, response); break;
        default:
            throw new ServletException("해당 명령을 처리할 수 없습니다.");
       
        }
    }

    protected void doHead(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        throw new ServletException("해당 명령을 처리할 수 없습니다.");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        // TODO Auto-generated method stub
        throw new ServletException("해당 명령을 처리할 수 없습니다.");

    }
    
}
