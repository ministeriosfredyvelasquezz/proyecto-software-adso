/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.meg.controladores;

public class UsuarioService {

    /**
     * LÓGICA DE NEGOCIO: Procesa el registro validando las reglas del sistema.
     * @param usuario Objeto con los datos capturados en la vista.
     * @return String con el mensaje de éxito o de error según la validación.
     */
    public String registrarUsuario(Usuario usuario) {
        
        // 1. REGLA DE ESTÁNDAR: Verificar que no lleguen datos vacíos o nulos
        if (usuario.getNombre() == null || usuario.getNombre().trim().isEmpty() ||
            usuario.getCorreo() == null || usuario.getCorreo().trim().isEmpty() ||
            usuario.getContrasena() == null || usuario.getContrasena().trim().isEmpty()) {
            
            return "Error: Campos incompletos. Todos los datos son obligatorios.";
        }

        // 2. REGLA DE NEGOCIO MISIONERA MEG: Simulación de almacenamiento correcto
        // En una etapa posterior, aquí se llamará al componente NoSQL o JPA persistence.
        System.out.println("LOG: Procesando inserción del usuario: " + usuario.getNombre());
        
        return "¡Usuario '" + usuario.getNombre() + "' registrado con éxito en la Agencia MEG usando Capa de Servicio!";
    }
}

