package com.binghe;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("HelloFilter init()");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
        System.out.println("HelloFilter doFilter() - 서블릿 전");
        chain.doFilter(request, response);
        System.out.println("HelloFilter doFilter() - 서블릿 후");
    }

    @Override
    public void destroy() {
        System.out.println("HelloFilter destroy()");
    }
}
