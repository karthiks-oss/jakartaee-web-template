package com.seenukarthi.jee9.servlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class WelcomeServlet extends HttpServlet {

    static String PAGE_HEADER = """
        <html lang="en">
            <head>
                <title>Welcome</title>
            </head>
            <body>""";
    static String PAGE_FOOTER = """
            </body>
        </html>""";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        try (PrintWriter writer = resp.getWriter()) {
            writer.println(PAGE_HEADER);

            writer.println("<h1>Welcome!</h1>");
            writer.println("<h3>This is a Jakarta EE 9 Servlet v5.0</h3>");

            writer.println(PAGE_FOOTER);
        }
    }
}
