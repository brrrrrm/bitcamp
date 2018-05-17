// 서블릿 인터페이스가 구현해야 할 메소드를 미리 이 클래스에서 구현해 둔다
package step01;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


//서블릿 인터페이스에 선언된 메소드 중 개발자가 관심 없는 클래스를 이 클래스에서 미리 구현해 둔다
//그러면 개발자는 Servlet 인터페이스를 직접 구현하기 보다는 
//이 클래스를 상속 받음으로써 개발이 간결해질 것이다 

//service 메소드를 이 클래스에서 구현하지 않고 서브 클래스에서 구현하도록 추상 클래스로 만들었다
//service 클래스는 어차피 서브클래스에서 만들 것이고, 반드시 구현해야 하기 때문에 
public abstract class GenericServlet implements Servlet{

    ServletConfig config;
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public String getServletInfo() {
        return this.getClass().getName();
    }

    @Override
    public void destroy() {
        
    }

}
