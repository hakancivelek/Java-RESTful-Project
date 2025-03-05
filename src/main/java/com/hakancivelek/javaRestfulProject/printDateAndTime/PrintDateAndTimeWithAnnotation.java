package com.hakancivelek.javaRestfulProject.printDateAndTime;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "PrintDateAndTimeWithAnnotation", value = "/PrintDateAndTimeWithAnnotation")
public class PrintDateAndTimeWithAnnotation extends HttpServlet {
    Date now = new Date();

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + now + "</h1>");
        out.println("</body></html>");
    }
}
