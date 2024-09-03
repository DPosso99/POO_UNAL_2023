/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamensajeria;

/**
 *
 * @author David
 */

import java.util.Date;

public class Mensaje {
    private String remitente;
    private String titulo;
    private String contenido;
    private Date fechaEnvio;

    public Mensaje(String remitente, String titulo, String contenido) {
        this.remitente = remitente;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaEnvio = new Date(); // Fecha y hora actuales
    }

    public String getRemitente() {
        return remitente;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    @Override
    public String toString() {
        return "De: " + remitente + "\nFecha: " + fechaEnvio + "\nTitulo: " + titulo + "\n\n" + contenido;
    }
}
