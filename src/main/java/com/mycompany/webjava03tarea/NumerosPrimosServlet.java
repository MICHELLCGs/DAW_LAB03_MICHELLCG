package com.mycompany.webjava03tarea;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/NumerosPrimosServlet")
public class NumerosPrimosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nParam = request.getParameter("n");
        if (nParam == null || nParam.isEmpty()) {
            response.setContentType("text/html");
            response.getWriter().println("<html><body><h2>Debe ingresar un valor"
                    + " para 'n'.</h2></body></html>");
            return;}
        int n = Integer.parseInt(nParam);

        response.setContentType("text/html");
        response.getWriter().println("<html><body><h2>Números Primos:</h2>");
        int count = 0;
        int number = 2;
        while (count < n) {
            if (isPrime(number)) {
                response.getWriter().println(number + "<br>");
                count++;
            }
            number++;}
        response.getWriter().println("</body></html>");}
    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }}
        return true;
    }}