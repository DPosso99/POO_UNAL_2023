/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamensajeria;

/**
 *
 * @author David
 */
public class Usuario {
    
    private String nombre;
    private long id;
    private Fecha fecha_nacimiento;
    private String ciudad_nacimiento;
    private long tel;
    private String email;
    private Direccion dir;
    
    public Usuario() {
    }

    // Constructor con argumentos
    public Usuario(String nombre, long id) {
        this.nombre = nombre;
        this.id = id;
    }

    // Métodos configurar nombre, ID, fecha de nacimiento, ciudad de nacimiento, teléfono, email y dirección
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFecha_nacimiento(Fecha fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setCiudad_nacimiento(String ciudad_nacimiento) {
        this.ciudad_nacimiento = ciudad_nacimiento;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDir(Direccion dir) {
        this.dir = dir;
    }

    // Métodos obtener el nombre, ID, fecha de nacimiento, ciudad de nacimiento, teléfono, email y dirección
    public String getNombre() {
        return nombre;
    }

    public long getId() {
        return id;
    }

    public Fecha getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getCiudad_nacimiento() {
        return ciudad_nacimiento;
    }

    public long getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public Direccion getDir() {
        return dir;
    }

    // Método toString para imprimir la información del usuario
    @Override
    public String toString() {
        return String.format("Nombre: %s\nID: %d\nFecha de nacimiento: %s\nCiudad de nacimiento: %s\nTeléfono: %d\nEmail: %s\nDirección: %s",
                nombre, id, fecha_nacimiento, ciudad_nacimiento, tel, email, dir);
    }

    void leerBandejaEntrada() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void leerMensaje(int numeroMensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void recibirMensaje(Mensaje mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
