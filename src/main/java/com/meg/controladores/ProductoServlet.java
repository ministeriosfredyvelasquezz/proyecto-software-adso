package com.meg.controladores;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ProductoServlet", urlPatterns = {"/ProductoServlet"})
public class ProductoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // 1. REQUISITO GET: Método para buscar productos o recursos misioneros
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        
        String productoBuscar = request.getParameter("productoBuscar");
        String mensajeResultado;
        
        if (productoBuscar != null && !productoBuscar.isEmpty()) {
            mensajeResultado = "El recurso educativo '" + productoBuscar + "' se encuentra disponible en el inventario de MEG.";
        } else {
            mensajeResultado = "No se especificó ningún término para la búsqueda.";
        }
        
        request.setAttribute("mensaje", mensajeResultado);
        request.setAttribute("metodo", "GET (Consulta de Recursos)");
        
        request.getRequestDispatcher("buscarProductos.jsp").forward(request, response);
    }

    // 2. REQUISITO POST: Método para registrar o ingresar un nuevo producto/recurso
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        
        String nombreProducto = request.getParameter("nombreProducto");
        String precio = request.getParameter("precio");
        
        String mensajeResultado = "¡Éxito! El material '" + nombreProducto + "' con un valor de $" + precio + " fue agregado al catálogo oficial.";
        
        request.setAttribute("mensaje", mensajeResultado);
        request.setAttribute("metodo", "POST (Registro de Materiales)");
        
        request.getRequestDispatcher("buscarProductos.jsp").forward(request, response);
    }
}
