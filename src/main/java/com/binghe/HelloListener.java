package com.binghe;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HelloListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Hello Listener init()");
        sce.getServletContext().setAttribute("name", "binghe");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Hello Listner destory()");
    }
}
