/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmueble;

public class inmuebleVivienda extends Inmueble {
protected int númeroHabitaciones;
protected int númeroBaños;

public inmuebleVivienda(int identificadorInmobiliario, int área, String 
direccion, int númeroHabitaciones, int númeroBaños) {
    super(identificadorInmobiliario, área, direccion); 
    this.númeroHabitaciones = númeroHabitaciones;
    this.númeroBaños = númeroBaños;
}
void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Número de habitaciones = " + 
    númeroHabitaciones);
    System.out.println("Número de baños = " + númeroBaños);


}
}