/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmueble;

public class Oficina extends Local { 
    protected static double valorArea = 3500000;
    protected boolean esGobierno;
public Oficina(int identificadorInmobiliario, int area, String 
        direccion, tipo tipoLocal, boolean esGobierno) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.esGobierno = esGobierno;}

void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Es oficina gubernamental = " + esGobierno);
    System.out.println();
    }
}
    

