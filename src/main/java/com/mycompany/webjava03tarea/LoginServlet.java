/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webjava03tarea;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException {
        // Obtén los valores de usuario y clave desde el formulario
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");

        // Verifica las credenciales (simplemente como ejemplo)
        if ("MichellCG".equals(usuario) && "cgmichell23".equals(clave)) {
            // Credenciales válidas, redirige a servlets.html
            response.sendRedirect("servlets.html");
        } else {
response.sendRedirect("/WebJava03Tarea/error_acceso.html");
        }
    }
}

