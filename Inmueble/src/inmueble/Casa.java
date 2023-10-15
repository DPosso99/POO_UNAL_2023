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
public class Casa extends inmuebleVivienda {
protected int numeroPisos;
public Casa(int identificadorInmobiliario, int area, String dirección, 
    int numeroHabitaciones, int numeroBaños, int numeroPisos) {
    super(identificadorInmobiliario, area, dirección, 
    numeroHabitaciones, numeroBaños);
    this.numeroPisos = numeroPisos;
}
void imprimir() {
super.imprimir(); // Invoca al método imprimir de la clase padre
System.out.println("Numero de pisos = " + numeroPisos);
}
}

    
