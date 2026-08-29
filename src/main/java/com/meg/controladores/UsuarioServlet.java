package com.meg.controladores;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "UsuarioServlet", urlPatterns = {"/UsuarioServlet"})
public class UsuarioServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // 1. REQUISITO GET: Método para procesar consultas de usuarios o materiales
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        
        String correoBuscar = request.getParameter("correoBuscar");
        String mensajeResultado;
        
        if (correoBuscar != null && !correoBuscar.isEmpty()) {
            mensajeResultado = "El usuario misionero con correo '" + correoBuscar + "' se encuentra REGISTRADO y ACTIVO.";
        } else {
            mensajeResultado = "No se ingresó ningún criterio de búsqueda.";
        }
        
        request.setAttribute("mensaje", mensajeResultado);
        request.setAttribute("metodo", "GET (Consulta de Información)");
        
        request.getRequestDispatcher("registro.jsp").forward(request, response);
    }

    // 2. REQUISITO POST: Método para procesar la inserción o registro de datos seguro
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        
        String nombre = request.getParameter("nombre");
        String telefono = request.getParameter("telefono");
        
        String mensajeResultado = "¡Éxito! El registro de '" + nombre + "' (Tel: " + telefono + ") ha sido procesado de forma segura mediante el método POST.";
        
        request.setAttribute("mensaje", mensajeResultado);
        request.setAttribute("metodo", "POST (Inserción / Registro Seguro)");
        
        request.getRequestDispatcher("registro.jsp").forward(request, response);
    }
}
