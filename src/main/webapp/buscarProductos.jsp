<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MEG - Catálogo y Servicios Institucionales</title>
    <style>
        body { font-family: Arial, sans-serif; background-color: #f4f6f9; margin: 0; padding: 20px; }
        .container { max-width: 600px; background: #fff; padding: 30px; margin: 20px auto; border-radius: 8px; box-shadow: 0 4px 15px rgba(0,0,0,0.1); }
        h2 { color: #1a365d; text-align: center; margin-bottom: 25px; border-bottom: 2px solid #3182ce; padding-bottom: 10px; }
        label { font-weight: bold; color: #2d3748; display: block; margin-top: 15px; }
        input[type="text"], select { width: 100%; padding: 10px; margin-top: 5px; box-sizing: border-box; border: 1px solid #cbd5e0; border-radius: 4px; }
        button { width: 100%; background-color: #2b6cb0; color: white; padding: 12px; margin-top: 25px; border: none; border-radius: 4px; font-size: 16px; font-weight: bold; cursor: pointer; transition: background 0.3s; }
        button:hover { background-color: #1a365d; }
        .footer-link { text-align: center; margin-top: 20px; }
        .footer-link a { color: #3182ce; text-decoration: none; font-weight: bold; }
    </style>
</head>
<body>

    <div class="container">
        <h2>MINISTRY EVANGELISTIC GLOBAL<br><small style="font-size: 14px; color: #718096;">Buscador del Catálogo de Recursos Misioneros</small></h2>
        
        <!-- Método GET: Los parámetros viajan de forma visible en la URL -->
        <form action="ProductoServlet" method="GET">
            
            <label>Palabra clave o término de búsqueda:</label>
            <input type="text" name="criterioBusqueda" placeholder="Ej: Biblia, Capacitación, Guía" required>

            <label>Filtrar por Categoría Institucional:</label>
            <select name="categoria">
                <option value="todos">Todos los Recursos y Servicios</option>
                <option value="literatura">Literatura y Libros de Consejería</option>
                <option value="cursos">Cursos de Formación Teológica</option>
                <option value="brigadas">Agendas de Apoyo y Misiones</option>
            </select>

            <button type="submit">Consultar Catálogo Oficial</button>
        </form>
        
        <div class="footer-link">
            <p><a href="registro.jsp">← Volver al Registro de Usuarios (POST)</a></p>
        </div>
    </div>

</body>
</html>
