/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamensajeria;

/**
 *
 * @author David
 */
class Direccion {
    
    private String calle;
    private String nomenclatura;
    private String barrio;
    private String ciudad;
    private String edificio;
    private String apto;


    // Métodos calle, nomenclatura, barrio, ciudad, edificio y apto
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNomenclatura(String nomenclatura) {
        this.nomenclatura = nomenclatura;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public void setApto(String apto) {
        this.apto = apto;
    }

    // Métodos obtener la calle, nomenclatura, barrio, ciudad, edificio y apto
    public String getCalle() {
        return calle;
    }

    public String getNomenclatura() {
        return nomenclatura;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEdificio() {
        return edificio;
    }

    public String getApto() {
        return apto;
    }

    // Método toString para imprimir la dirección en formato "calle nomenclatura barrio ciudad edificio apto"
    @Override
    public String toString() {
        String edif = (edificio != null && !edificio.isEmpty()) ? edificio + ", " : "";
        String apt = (apto != null && !apto.isEmpty()) ? apto : "";
        return String.format("%s %s %s %s %s %s", calle, nomenclatura, barrio, ciudad, edif, apt);
    }
}