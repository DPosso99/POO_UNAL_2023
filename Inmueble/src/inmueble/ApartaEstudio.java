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
public class ApartaEstudio extends Apartamento {
    protected static double valorArea = 1500000;
    public ApartaEstudio(int identificadorInmobiliario, int área, String 
dirección, 
    int númeroHabitaciones, int númeroBaños) {
    super(identificadorInmobiliario, área, dirección, 1, 1);
    }
 void imprimir() {
    super.imprimir(); 
    System.out.println();
    
}
}