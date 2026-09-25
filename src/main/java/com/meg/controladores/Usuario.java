/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.meg.controladores;

public class Usuario {

    // ATRIBUTOS PRIVADOS (Encapsulamiento estándar de codificación)
    private String nombre;
    private String correo;
    private String contrasena;

    // CONSTRUCTOR VACÍO (Requisito para frameworks y servlets)
    public Usuario() {
    }

    // CONSTRUCTOR CON PARÁMETROS (Permite inicializar el objeto fácilmente)
    public Usuario(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    // MÉTODOS GETTERS Y SETTERS (Estándar para lectura y escritura de datos)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}

