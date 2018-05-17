//요청 파라미터의 값이 한글일 경우 깨지는 현상 해결
package step03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/step03/exam04")
public class Exam04 extends GenericServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {


        //tomcat7 이하 버전 : 
        //get요청으로 한글 문자열을 파라미터로 보낼 때 
        //서버에서 꺼내면 한글이 깨진다
        //http://localhost:8888/test01/step03/exam04?name=홍길동&age=20
        
        //URL인코딩을 통해 변환해주어야함 
        //웹브라우저 : 입력한 값 -> 인코딩 
        //톰캣서버 : URL 디코딩 -> 
        //UTF-16문자표에 따라 String객체로 만든다
        
        //클라이언트가 보낸 데이터가 어떤 문자표에 따라 만든 데이터인지 알려주지 않으면 
        //ISO-8859-1(ISO latin-1)이라 가정하고 무조건 0x00을 붙인다
       //영어인 경우에는 UTF-16으로 변함이 없으나
        //한글일 경우에는 UTF-8 각 바이트에 붙이면 올바르지 않은 UTF-16코드가 되기 때문에 
        //출력할 때 이상한 글자가 보인다 
        
        //해결책? 
        //1)POST 명령으로 보낸 데이터인 경우
        //값을 최초로 꺼내기 전에(getParameter를 최초로 호출하기 전)
        //클라이언트가 보낸 문자가 어떤 문자 코드로 되어 있는지 알려줘야 한다
        //2)GET명령으로 보낸 데이터의 경우(톰캣서버)
        //server.xml파일에서 다음과 같이 태그에 URIEncoding 속성을 추가 
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));


        response.setContentType("text/plain; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.printf("이름 : %s\n",  name);
        out.printf("나이 : %d\n", age);

    }

}
