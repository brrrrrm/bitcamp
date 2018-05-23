package bitcamp.java106.pms.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bitcamp.java106.pms.servlet.support.WebApplicationContextUtils;

@WebListener
public class ContextLoaderListener implements ServletContextListener{
    static ApplicationContext container;
    
    public static ApplicationContext getApplicationContext() {
        return container;
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();
        String configClassName = sc.getInitParameter("contextConfigLocation");
        //서블릿 컨테이너가 시작되면 스프링 IoC 컨테이너를 준비한다
        try {
            ApplicationContext iocContainer = 
             new AnnotationConfigApplicationContext(Class.forName(configClassName));
             
             container = iocContainer;
             WebApplicationContextUtils.containers.put(sce.getServletContext(), iocContainer);
             
        } catch (Exception e) {
            e.printStackTrace();
        }
        //서블릿에서 스프링 IoC컨테이너를 꺼내 쓸 수 있도록 WebApplicationContextUtils에 보관한다
        
        //왜 이렇게 복잡하게 하는가 
        //스프링을 모방하기 위함
    }
}
