//웹 어플리케이션 컴포넌트 : 필터
package step09.ex1;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/step09/ex1/exam02")
public class Filter2 implements Filter {
    
    FilterConfig config;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //최초로 필터 객체가 생성될 때 호출 
        //필터가 작업할 때 사용할 도구를 준비시킨다
        this.config = filterConfig;
        System.out.println("Filter2.init()");
    }
    
    @Override
    public void destroy() {
        //웹 어플리케이션을 멈추거나 서블릿 컨테이너를 멈출 때 호출된다
        //필터가 init 을 통해 준비했던 도구나 자원을 해제하는 코드를 둔다
        System.out.println("Filter2.destroy()");
    }
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        //서블릿을 실행하기 전에 필터가 적용될 때마다 호출된다
        //서블릿이 작업하는 데 필요한 것들을 여기에서 준비한다
        System.out.println("Filter2.doFilter() : before");
        //필터의 작업을 수행한 후 다음 필터를 실행한다 
        //만약 다음 필터가 없으면 원래 목적지인 서블릿을 실행한다
        
        chain.doFilter(request, response);
        
        //서블릿을 실행한 후 실행할 작업이 있다면 바로 chian.doFileter()다음에 두어라 
        System.out.println("Fileter2.doFilter(): after");
    }

}
