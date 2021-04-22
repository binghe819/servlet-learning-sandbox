package com.binghe;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

public class IoCHelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("IoCHelloServlet init()");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        System.out.println("HelloListenerServlet doGet()");

        // 서블릿 컨텍스트에서 스프링 IoC 컨테이너 가져오기
        ApplicationContext context = (ApplicationContext) getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);

        // IoC 컨테이너에서 관리하는 빈 가져오기
        HelloService helloService = context.getBean(HelloService.class);

        PrintWriter out = resp.getWriter();
        out.println("<html>"+
            "<body>"+
            "<h1 align=center>Hello " + helloService.getName() +"</h1>"+
            "<br>"+
            "</body>"+
            "</html>");
    }

    @Override
    public void destroy() {
        System.out.println("IoCHelloServlet destroy()");
    }
}
