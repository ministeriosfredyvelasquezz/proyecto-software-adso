package com.meg.controladores;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "UsuarioServlet", urlPatterns = {"/UsuarioServlet"})
public class UsuarioServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Procesamos la petición POST para el registro de usuarios de MEG
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Configuramos la codificación de caracteres para admitir tildes y eñes
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        
        // Captura de los datos institucionales provenientes del formulario JSP (RF01)
        String nombre = request.getParameter("nombre");
        String telefono = request.getParameter("telefono");
        String direccion = request.getParameter("direccion");
        String correo = request.getParameter("correo");
        String vocacion = request.getParameter("vocacion");
        String tipoUsuario = request.getParameter("tipoUsuario");
        
        // Respuesta HTML dinámica enviada al navegador del usuario
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html lang='es'>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<title>MEG - Confirmación de Registro</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; background-color: #f4f6f9; padding: 40px; text-align: center; }");
            out.println(".card { max-width: 550px; background: white; padding: 30px; margin: 0 auto; border-radius: 8px; box-shadow: 0 4px 15px rgba(0,0,0,0.1); border-top: 5px solid #2f855a; }");
            out.println("h1 { color: #2f855a; margin-bottom: 20px; }");
            out.println("table { width: 100%; border-collapse: collapse; margin-top: 20px; text-align: left; }");
            out.println("th, td { padding: 10px; border-bottom: 1px solid #e2e8f0; }");
            out.println("th { background-color: #f7fafc; color: #4a5568; }");
            out.println(".btn { display: inline-block; background-color: #3182ce; color: white; padding: 10px 20px; text-decoration: none; border-radius: 4px; font-weight: bold; margin-top: 25px; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            
            out.println("<div class='card'>");
            out.println("<h1>¡Registro de Cuenta Exitoso!</h1>");
            out.println("<p>Los datos ministeriales han sido procesados de forma segura mediante el método <strong>POST</strong>.</p>");
            
            out.println("<table>");
            out.println("<tr><th>Campo Institucional</th><th>Información Registrada</th></tr>");
            out.println("<tr><td><strong>Nombre Completo:</strong></td><td>" + nombre + "</td></tr>");
            out.println("<tr><td><strong>Teléfono:</strong></td><td>" + telefono + "</td></tr>");
            out.println("<tr><td><strong>Ubicación / Dirección:</strong></td><td>" + direccion + "</td></tr>");
            out.println("<tr><td><strong>Correo de Contacto:</strong></td><td>" + correo + "</td></tr>");
            out.println("<tr><td><strong>Vocación Ministerial:</strong></td><td>" + (vocacion.isEmpty() ? "No especificada" : vocacion) + "</td></tr>");
            out.println("<tr><td><strong>Rol Institucional:</strong></td><td><span style='color:#2b6cb0; font-weight:bold;'>" + tipoUsuario.toUpperCase() + "</span></td></tr>");
            out.println("</table>");
            
            out.println("<a href='registro.jsp' class='btn'>← Registrar Nuevo Usuario</a>");
            out.println("</div>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }
}
