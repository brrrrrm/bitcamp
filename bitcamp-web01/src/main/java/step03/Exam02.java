package step03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/step03/exam02")
public class Exam02 extends GenericServlet {
    
    private static final long serialVersionUID = 1L;

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        //출력스트림을 꺼낼 때 문자를 출력 때 사용할 문자표를 지정하지 않으면 기본으로 ISO-8859-1 문자표를 사용한다 
        //즉 다음과 같이 클라이언트로 문자열을 보낸다
        //String 객체(UTF-16) ==> ISO-8859-1 코드표에 따라 변환하여 클라이언트로 보낸다 
        
        //출력할 컨텐츠의 타입(MIME type)이 무엇이고, 어떤 캐릭터셋을 사용하여 변환할지 지정한다
        response.setContentType("text/css; charset=UTF-8");
        PrintWriter out = response.getWriter();

        
        out.println("Hello");
        
        //문제는 한글이다
        //한글은 ISO-8859-1에 코드가 명시되어 있지 않기 때문에 ISO-8859-1 코드 값으로 바꿀 수 없다
        //바꾸지 못했다면 그 의미로 ?를 대신 보낸다 
        
        out.println("안녕하세요");
        
        //해결책?
        ///ServletResponse객체에서 출력스트림을 꺼내기 전에 어떤 character set을 사용할지 설정해야 한다 
        //출력하기 전에 지정! 
        
    }

}
