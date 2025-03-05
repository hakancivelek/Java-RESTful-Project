package com.hakancivelek.javaRestfulProject;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/SelamWithAnnotation")
public class SelamServletWithAnnotation extends HttpServlet {
    private String message;

    public void init() {
        message = "Selam Servlet with annotation!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}