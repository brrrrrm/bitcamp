//클라이언트가 어떤 값을 보낼지 정해지지 않은 경우
package step03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/step03/exam07")
public class Exam07 extends GenericServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        
        Enumeration<String> names = request.getParameterNames();

        response.setContentType("text/plain; charset=UTF-8");
        PrintWriter out = response.getWriter();
        while(names.hasMoreElements()) {
            String name= names.nextElement();
            out.printf("%s : %s\n", name, request.getParameter(name));
        }
    }
}
