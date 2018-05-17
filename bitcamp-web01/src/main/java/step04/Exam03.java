//GET과 POST 요청을 구분하기 - HttpServlet 클래스 
package step04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Http요청을 다루기 위해 형변환하는 것은 비효율적
//미리 형변환처리를 한 HttpServlet클래스를 사용한다 
@WebServlet("/step04/exam03")
public class Exam03 extends HttpServlet{

    private static final long serialVersionUID = 1L;

    //테스트 방법:
    //http://localhost:8888/bitcamp-web01/step04/exam03_test.html
    
    //service()메소드를 오버라이딩할 때도 Servlet인터페이스에 선언된 
    //원래의 service를 오버라이딩하지 말고 
    //HttpServlet클래스에서 추가한(오버로딩) service메소드를 오버라이딩하라
    //이 메소드는 파라미터 값으로 HttpServletRequest와 HttpServletResponse를 받는다
    //물론 서블릿 컨테이너가 이 메소드를 직접 호출하는 것이 아니라 
    //service(ServletRequest, ServletResponse)메소드를 호출하면
    //내부적으로 service(HttpServletRequest, HttpServletResponse)를 호출하는 것이다
    //
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name= request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        
        
        //이 메소드를 재정의 하면 파라미터 타입을 원래의 타입으로 형변화할 필요가 없다
        //즉 오리지널 service(ServletRequest, ServletResponse)를 재정의하는 것보다
        //이 메소드를 
//        HttpServletRequest httpReq = (HttpServletRequest) request;
       
        
        //ServletRequest에는 HTTP메소드를 알아내는 메소드가 없다
        //원래 타입인 HttpServletRequest에는 Http method를 알아내는 메소드가 있다
        String method= request.getMethod();
        
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.printf("요청방식 = %s\n", method);
        out.printf("name=%s\n", name);
        out.printf("age=%d\n", age);
    }
}


//HTTP 프로토콜 - GET 요청
//-request-URI에 데이터를 포함하여 보낸다 
//URI?파라미터명=값&파라미터명=값&파라미터명=값...
//GET /bitcamp-web01/step04/exam01?name=aaa&age=20 HTTP/1.1 <= request-line
//Host: localhost:8888 <===header(genera/request/entity)
//Connection: keep-alive
//Pragma: no-cache
//Cache-Control: no-cache
//Upgrade-Insecure-Requests: 1
//User-Agent: Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36
//Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8
//Referer: http://localhost:8888/bitcamp-web01/step04/exam01_test.html
//Accept-Encoding: gzip, deflate, br
//Accept-Language: en-US,en;q=0.9,ko;q=0.8



//HTTP 프로토콜 - POST 요청
//message-body(entity-body)에 데이터를 포함해서 보낸다
//post요청을 할 때는 보내는 데이터의 정보를 추가해서 보낸다 
//content-length, content-type헤더 추가 
//POST /bitcamp-web01/step04/exam01 HTTP/1.1  <==request-line
//Host: localhost:8888  <=header(general/request/entity)
//Connection: keep-alive
//Content-Length: 17  <==GET요청에는 없음, 빈 줄 다음에 읽어야할 바이트의 수 
//Pragma: no-cache
//Cache-Control: no-cache
//Origin: http://localhost:8888
//Upgrade-Insecure-Requests: 1
//Content-Type: application/x-www-form-urlencoded <==GET요청에는 없음
//User-Agent: Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36
//Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8
//Referer: http://localhost:8888/bitcamp-web01/step04/exam01_test.html
//Accept-Encoding: gzip, deflate, br <=gzip, deflate
//Accept-Language: en-US,en;q=0.9,ko;q=0.8 (빈줄) <==empty line
//<==post요청은 빈 줄 다음에 데이터를 보낸다


