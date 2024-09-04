/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmueble;

public class Inmueble {

protected int identificadorInmobiliario;
protected int area; 
protected String direccion; 
protected double precioVenta; 
Inmueble(int identificadorInmobiliario, int area, String dirección) {
this.identificadorInmobiliario = identificadorInmobiliario;
this.area = area;
this.direccion = direccion;
}

double calcularPrecioVenta(double valorArea) {
precioVenta = area * valorArea;
return precioVenta;
}
void imprimir() {
System.out.println("Identificador inmobiliario = " + 
identificadorInmobiliario);
System.out.println("Area = " + area);
System.out.println("Direccion = " + direccion);
System.out.println("Precio de venta = $" + precioVenta);
}
}

    