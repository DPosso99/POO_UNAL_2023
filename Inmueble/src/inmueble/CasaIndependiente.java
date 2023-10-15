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
public class CasaIndependiente extends CasaUrbana  {
    protected static double valorArea = 3000000;
public CasaIndependiente(int identificadorInmobiliario, int area, 
    String direccion, int numeroHabitaciones, int numeroBaños, int 
    numeroPisos) {
    super(identificadorInmobiliario, area, direccion, 
    numeroHabitaciones, numeroBaños, numeroPisos);
}
void imprimir() {
super.imprimir(); // Invoca al método imprimir de la clase padre
System.out.println();
}
}