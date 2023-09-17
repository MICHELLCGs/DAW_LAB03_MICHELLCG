
package com.mycompany.webjava03tarea;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TablasMultiplicarServlet")
public class TablasMultiplicarServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String nParam = request.getParameter("n");

        if (nParam == null || nParam.isEmpty()) {
            response.setContentType("text/html");
            response.getWriter().println("<html><body><h2>Debe ingresar un valor para"
                    + " 'n'.</h2></body></html>");
            return;
        }

        int n = Integer.parseInt(nParam);

        response.setContentType("text/html");
        response.getWriter().println("<html><body><h2>Tablas de Multiplicar:</h2>");
        for (int i = 1; i <= n; i++) {
            response.getWriter().println("<h3>Tabla del " + i + ":</h3>");
            for (int j = 1; j <= 10; j++) {
                response.getWriter().println(i + " x " + j + " = " + (i * j) + "<br>");
            }
        }
        response.getWriter().println("</body></html>");
    }
}
