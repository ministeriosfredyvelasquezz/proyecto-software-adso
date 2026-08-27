<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MEG - Registro del Sistema Integral</title>
    <style>
        body { font-family: Arial, sans-serif; background-color: #f4f6f9; margin: 0; padding: 20px; }
        .container { max-width: 500px; background: #fff; padding: 30px; margin: 20px auto; border-radius: 8px; box-shadow: 0 4px 15px rgba(0,0,0,0.1); }
        h2 { color: #1a365d; text-align: center; margin-bottom: 25px; border-bottom: 2px solid #3182ce; padding-bottom: 10px; }
        label { font-weight: bold; color: #2d3748; display: block; margin-top: 15px; }
        input[type="text"], input[type="email"], input[type="password"], select { width: 100%; padding: 10px; margin-top: 5px; box-sizing: border-box; border: 1px solid #cbd5e0; border-radius: 4px; }
        button { width: 100%; background-color: #3182ce; color: white; padding: 12px; margin-top: 25px; border: none; border-radius: 4px; font-size: 16px; font-weight: bold; cursor: pointer; transition: background 0.3s; }
        button:hover { background-color: #2b6cb0; }
        .footer-link { text-align: center; margin-top: 20px; }
        .footer-link a { color: #3182ce; text-decoration: none; font-weight: bold; }
    </style>
</head>
<body>

    <div class="container">
        <h2>MINISTRY EVANGELISTIC GLOBAL<br><small style="font-size: 14px; color: #718096;">Registro Único de Usuarios</small></h2>
        
        <!-- Método POST: Envía la información de forma segura al Servlet -->
        <form action="UsuarioServlet" method="POST">
            
            <label>Nombre Completo:</label>
            <input type="text" name="nombre" placeholder="Ej: Juan Pérez" required>

            <label>Número Telefónico:</label>
            <input type="text" name="telefono" placeholder="Ej: +57 3001234567" required>

            <label>Ubicación / Dirección:</label>
            <input type="text" name="direccion" placeholder="Ciudad, País" required>

            <label>Correo Electrónico:</label>
            <input type="email" name="correo" placeholder="correo@ejemplo.com" required>

            <label>Vocación / Ocupación Ministerial:</label>
            <input type="text" name="vocacion" placeholder="Ej: Evangelista, Líder, Pastor">

            <label>Tipo de Usuario (Rol Institucional):</label>
            <select name="tipoUsuario" required>
                <option value="" disabled selected>-- Seleccione un Rol --</option>
                <option value="cliente">Cliente / Beneficiario</option>
                <option value="consejero">Consejero Especializado</option>
                <option value="administrador">Administrador del Sistema</option>
            </select>

            <label>Contraseña de Acceso:</label>
            <input type="password" name="contrasena" placeholder="Mínimo 8 caracteres" required>

            <button type="submit">Crear Cuenta Institucional</button>
        </form>
        
        <div class="footer-link">
            <p><a href="buscarProductos.jsp">Ir al Buscador del Catálogo (GET) →</a></p>
        </div>
    </div>

</body>
</html>
