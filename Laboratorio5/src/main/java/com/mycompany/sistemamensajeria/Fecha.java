/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamensajeria;

/**
 *
 * @author David
 */
class Fecha {
    private short dd; // Día
    private short mm; // Mes
    private short aa; // Año

    // Constructor
    public Fecha(short dd, short mm, short aa) {
        this.dd = dd;
        this.mm = mm;
        this.aa = aa;
    }

    // Método establecer dia, mes, año
    public void setDia(short dd) {
        this.dd = dd;
    }

    public void setMes(short mm) {
        this.mm = mm;
    }

    public void setA(short aa) {
        this.aa = aa;
    }

    // Metodos obtener día, mes y año
    public short getDia() {
        return dd;
    }

    public short getMes() {
        return mm;
    }

    public short getA() {
        return aa;
    }

    @Override
    public String toString() {
        return String.format("%02d - %02d - %02d", dd, mm, aa);
    }
}