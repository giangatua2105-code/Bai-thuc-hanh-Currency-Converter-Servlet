package com.codegym;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ConverterServlet", urlPatterns = {"/convert"})
public class ConverterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            try {
                float rate = Float.parseFloat(request.getParameter("rate"));
                float usd = Float.parseFloat(request.getParameter("usd"));
                float vnd = rate * usd;
                
                out.println("<!DOCTYPE html><html><head><meta charset='UTF-8'><title>Result</title>");
                out.println("<style>body{font-family:Arial;display:flex;justify-content:center;align-items:center;min-height:100vh;background:linear-gradient(135deg,#667eea,#764ba2);margin:0;}.box{background:white;padding:40px;border-radius:12px;box-shadow:0 20px 40px rgba(0,0,0,0.2);text-align:center;min-width:350px;}h2{color:#1b2a7a;}h3{color:#27ae60;font-size:24px;}a{display:inline-block;margin-top:20px;padding:10px 20px;background:#1b2a7a;color:white;text-decoration:none;border-radius:6px;}</style>");
                out.println("</head><body><div class='box'>");
                out.println("<h2>KET QUA CHUYEN DOI</h2>");
                out.println("<p style='font-size:18px;'>Ti gia: " + rate + " VND/USD</p>");
                out.println("<p style='font-size:18px;'>So tien USD: " + usd + "</p>");
                out.println("<h3>Thanh tien: " + String.format("%,.0f", vnd) + " VND</h3>");
                out.println("<a href='index.jsp'>Quay lai</a>");
                out.println("</div></body></html>");
                
            } catch (NumberFormatException e) {
                out.println("<!DOCTYPE html><html><head><meta charset='UTF-8'></head><body>");
                out.println("<h2 style='color:red;text-align:center;margin-top:100px;'>Loi: Vui long nhap so hop le!</h2>");
                out.println("<div style='text-align:center;'><a href='index.jsp'>Quay lai</a></div>");
                out.println("</body></html>");
            }
        }
    }
}