package com.meg.controladores;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ProductoServlet", urlPatterns = {"/ProductoServlet"})
public class ProductoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Procesamos la petición GET para las consultas en el catálogo de MEG
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Configuramos codificación para tildes y caracteres especiales
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        
        // Captura de los criterios de búsqueda que viajan visibles en la URL (RF06)
        String criterio = request.getParameter("criterioBusqueda");
        String categoria = request.getParameter("categoria");
        
        // Respuesta dinámica para simular los resultados de la base de datos
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html lang='es'>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<title>MEG - Resultados de Consulta</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; background-color: #f4f6f9; padding: 40px; text-align: center; }");
            out.println(".card { max-width: 550px; background: white; padding: 30px; margin: 0 auto; border-radius: 8px; box-shadow: 0 4px 15px rgba(0,0,0,0.1); border-top: 5px solid #2b6cb0; }");
            out.println("h1 { color: #1a365d; margin-bottom: 20px; }");
            out.println(".info-box { background-color: #ebf8ff; color: #2b6cb0; padding: 15px; border-radius: 4px; text-align: left; margin-bottom: 20px; border-left: 4px solid #3182ce; }");
            out.println("ul { list-style: none; padding: 0; text-align: left; }");
            out.println("li { background: #f7fafc; padding: 12px; margin-bottom: 8px; border: 1px solid #e2e8f0; border-radius: 4px; }");
            out.println(".btn { display: inline-block; background-color: #4a5568; color: white; padding: 10px 20px; text-decoration: none; border-radius: 4px; font-weight: bold; margin-top: 25px; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            
            out.println("<div class='card'>");
            out.println("<h1>Resultados de Consulta (GET)</h1>");
            
            out.println("<div class='info-box'>");
            out.println("<strong>Término buscado:</strong> " + criterio + "<br>");
            out.println("<strong>Filtro aplicado:</strong> " + categoria.toUpperCase());
            out.println("</div>");
            
            out.println("<h3>Recursos Encontrados en la Agencia MEG:</h3>");
            out.println("<ul>");
            out.println("<li><strong>Manual de Capacitación de Liderazgo:</strong> Kit enfocado en la formación ministerial (Categoría: " + categoria + ").</li>");
            out.println("<li><strong>Guía Teológica Avanzada:</strong> Literatura para consejeros especializados (Categoría: " + categoria + ").</li>");
            out.println("</ul>");
            
            out.println("<a href='buscarProductos.jsp' class='btn'>← Nueva Búsqueda</a>");
            out.println("</div>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }
}
