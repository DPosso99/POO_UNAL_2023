/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmueble;

/**
 *
 * @author win 10 pro
 */
public class LocalComercial extends Local {
protected static double valorArea = 3000000;
protected String centroComercial;

public LocalComercial(int identificadorInmobiliario, int area, String 
direccion,tipo tipoLocal, String centroComercial) {
// Invoca al constructor de la clase padre
super(identificadorInmobiliario, area, direccion, tipoLocal);
this.centroComercial = centroComercial;}

@Override
    void imprimir() {
    super.imprimir(); 
    System.out.println("Centro comercial = " + centroComercial);
    System.out.println();
    }
}


