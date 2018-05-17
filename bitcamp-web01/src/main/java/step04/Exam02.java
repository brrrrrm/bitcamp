//GET과 POST 
package step04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/step04/exam02")
public class Exam02 extends GenericServlet{

    private static final long serialVersionUID = 1L;

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        //테스트 방법:
        //http://localhost:8888/bitcamp-web01/step04/exam02_test.html
        
        //클라이언트가 보낸 값을 꺼낼 때에는 GET POST 구분 없이 동일한 방법으로 값을 꺼낸다
        request.setCharacterEncoding("UTF-8");
        String name= request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        
        
        //클라이언트가 요청한 방식을 알아내기
        //요청방식은 HTTP프로토콜에 대한 내용
        //ServletRequest에는 HTTP프로토콜에 대한 내용을 다룰 수 있는 기능이 없다 
        //해결책
//        ServletContainer가 service()를 호출할 때 넘겨 준 파라미터의 원래 타입으로 변환하라
//        서블릿컨테이너는 서비스를 호출할 때 HTTP 정보를 다룰 수 있는 
//        HttpServletRequest와 HttpServletResponse를 넘겼다
//        따라서 이 타입으로 형변환하면 된다 
        HttpServletRequest httpReq = (HttpServletRequest) request;
        
        //ServletRequest에는 HTTP메소드를 알아내는 메소드가 없다
        //원래 타입인 HttpServletRequest에는 Http method를 알아내는 메소드가 있다
        String method= httpReq.getMethod();
        
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


