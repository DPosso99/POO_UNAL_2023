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
public class Local extends Inmueble {
enum tipo {INTERNO,CALLE};
protected tipo tipoLocal; 

public Local(int identificadorInmobiliario, int area, String direccion, 
    tipo tipoLocal) {
    super(identificadorInmobiliario, area, direccion);
    this.tipoLocal = tipoLocal;
}
@Override
void imprimir() {
super.imprimir(); // Invoca al método imprimir de la clase padre
System.out.println("Tipo de local ="  + tipoLocal);
        
}
}

