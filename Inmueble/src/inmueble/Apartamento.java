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
public class Apartamento extends inmuebleVivienda {
 public Apartamento(int identificadorInmobiliario, int area, String 
    dirección, int numeroHabitaciones, int númeroBaños) {
    super(identificadorInmobiliario, area, dirección, 
    numeroHabitaciones, númeroBaños);
}
void imprimir() {
super.imprimir(); // Invoca al método imprimir de la clase padre
}
}

