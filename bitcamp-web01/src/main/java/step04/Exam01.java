//GET과 POST 요청의 HTTP프로토콜 비교
package step04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/step04/exam01")
public class Exam01 extends GenericServlet{

    private static final long serialVersionUID = 1L;

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        //테스트 방법:
        //http://localhost:8888/bitcamp-web01/step04/exam01_test.html
        
        //클라이언트가 보낸 값을 꺼낼 때에는 GET POST 구분 없이 동일한 방법으로 값을 꺼낸다
        request.setCharacterEncoding("UTF-8");
        String name= request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
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


