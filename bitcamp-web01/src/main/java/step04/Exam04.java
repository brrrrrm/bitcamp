//GET과 POST 요청을 구분하기 - HttpServlet 클래스의 doXxx() 사용하기  
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
@WebServlet("/step04/exam04")
public class Exam04 extends HttpServlet{

    private static final long serialVersionUID = 1L;

    //테스트 방법:
    //http://localhost:8888/bitcamp-web01/step04/exam04_test.html
    
    /*
     * 서블릿 컨테이너는 service(ServletRequest, ServletResponse)를 호출하면
     * 다음 절차를 거치며 메소드가 호출된다
     * service(ServletRequest, ServletResponse)
     *  => service(HttpServletRequest, HttpServletResponse)
     *    => doGet(HttpServletReuqet, HttpServletResponse)
     *    => doPost(HttpServletReuqet, HttpServletResponse)
     *    => ...
     * 따라서 GET요청을 처리하고 싶다면 Service대신 doGET을 오버라이딩하면 된다
     * POST도 마찬가지 
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //클라이언트가 GET요청을 하면 이 메소드가 최종적으로 호출된다
        request.setCharacterEncoding("UTF-8");
        String name= request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        
        
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.printf("doGet()\n");
        out.printf("name=%s\n", name);
        out.printf("age=%d\n", age);
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //클라이언트가 POST요청을 하면 이 메소드가 최종적으로 호출된다
        request.setCharacterEncoding("UTF-8");
        String name= request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        
        
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.printf("doPost()\n");
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


