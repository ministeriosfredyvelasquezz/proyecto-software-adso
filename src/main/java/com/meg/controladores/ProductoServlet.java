package com.meg.controladores;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * CONTROLADOR: ProductoServlet
 * OBJETIVO: Gestionar las peticiones de búsqueda del catálogo de recursos misioneros.
 * EVIDENCIA: GA7-220501096-AA3-EV01
 * ESTÁNDAR: Estándares de codificación Java con especificación Jakarta EE
 */
@WebServlet(name = "ProductoServlet", urlPatterns = {"/ProductoServlet"})
public class ProductoServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * Procesa las peticiones mediante el método HTTP POST desde el formulario.
     * @param request Petición del cliente con los parámetros del catálogo.
     * @param response Respuesta enviada a la vista del navegador.
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // 1. Configuración de codificación para soporte de caracteres especiales (Calidad)
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        // 2. Captura de los datos del formulario de búsqueda
        String palabraClave = request.getParameter("palabraClave");
        String categoria = request.getParameter("categoria");

        // 3. Simulación y control de la lógica de negocio del módulo
        if (palabraClave != null && !palabraClave.trim().isEmpty()) {
            // Guarda el resultado para mostrarlo en la interfaz de usuario
            request.setAttribute("resultadoBusqueda", "Resultados encontrados para: '" + palabraClave + "'");
        } else {
            request.setAttribute("mensajeError", "El término de búsqueda no puede estar vacío.");
        }

        // 4. Redirección interna para refrescar los datos en la vista JSP
        request.getRequestDispatcher("/buscarProductos.jsp").forward(request, response);
    }

    /**
     * Procesa peticiones HTTP GET redirigiendo al flujo principal.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
