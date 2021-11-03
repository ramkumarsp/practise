package com.practise.java.abstractClassAndInterfaces;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AdvanceJavaConcepts extends HttpServlet {
    private String output;

    @Override
    public void init() throws ServletException {
        output = "Advance Java Concepts";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println(output);
    }

    @Override
    public void destroy() {
        System.out.println("Over");
    }
}
