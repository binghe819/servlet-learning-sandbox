package com.binghe;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloFilterServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("HelloFilterServlet init()");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        System.out.println("HelloFilterServlet doGet()");
        PrintWriter out = resp.getWriter();
        out.println("<html>"+
            "<body>"+
            "<h1 align=center>Hello World Servlet</h1>"+
            "<br>"+
            "</body>"+
            "</html>");
    }

    @Override
    public void destroy() {
        System.out.println("HelloFilterServlet destroy()");
    }
}
