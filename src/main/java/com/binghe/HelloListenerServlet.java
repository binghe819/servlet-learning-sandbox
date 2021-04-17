package com.binghe;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloListenerServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("HelloListenerServlet init()");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        System.out.println("HelloListenerServlet doGet()");
        PrintWriter out = resp.getWriter();
        ServletContext context = req.getServletContext();
        out.println("<html>"+
            "<body>"+
            "<h1 align=center>Hello " + context.getAttribute("name") + "</h1>"+
            "<br>"+
            "</body>"+
            "</html>");
    }

    @Override
    public void destroy() {
        System.out.println("HelloListenerServlet destroy()");
    }
}
