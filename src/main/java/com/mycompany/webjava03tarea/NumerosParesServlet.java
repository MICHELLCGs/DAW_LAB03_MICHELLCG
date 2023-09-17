/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webjava03tarea;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Michell
 */
@WebServlet("/NumerosParesServlet")
public class NumerosParesServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        // Obtén el parámetro "n" del formulario
        String nParam = request.getParameter("n");

        // Verifica si nParam es nulo o está vacío
        if (nParam == null || nParam.isEmpty()) {
            response.setContentType("text/html");
            response.getWriter().println("<html><body><h2>Debe "
                    + "ingresar un valor para 'n'.</h2></body></html>");
            return;
        }

        // Convierte el parámetro "n" a un entero
        int n = Integer.parseInt(nParam);

        // Genera y muestra los n primeros números pares
        response.setContentType("text/html");
        response.getWriter().println("<html><body><h2>Números"
                + " Pares:</h2>");
        for (int i = 2; i <= 2 * n; i += 2) {
            response.getWriter().println(i + "<br>");
        }
        response.getWriter().println("</body></html>");
    }
}
