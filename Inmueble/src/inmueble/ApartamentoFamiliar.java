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
public class ApartamentoFamiliar extends Apartamento {
    protected static double valorArea = 2000000;
    protected int valorAdministracion;
    
public ApartamentoFamiliar(int identificadorInmobiliario, int area, 
    String direccion, int númeroHabitaciones, int númeroBaños, int 
    valorAdministracion) {
    super(identificadorInmobiliario, area, direccion, 
    númeroHabitaciones, númeroBaños);
    this.valorAdministracion = valorAdministracion;
}
void imprimir() {
    super.imprimir(); 
    System.out.println("Valor de la administración = $" + 
    valorAdministracion);
    System.out.println();
}
}


