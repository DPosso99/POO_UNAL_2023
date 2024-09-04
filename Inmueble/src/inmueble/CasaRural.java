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
public class CasaRural extends Casa {
    protected static double valorArea = 1500000;
    protected int distanciaCabera;
    protected int altitud;
    
    public CasaRural(int identificadorInmobiliario, int area, String 
        direccion, int numeroHabitaciones, int numeroBaños, int 
        numeroPisos, int distanciaCabera, int altitud){
        super(identificadorInmobiliario,area,direccion, 
        numeroHabitaciones, numeroBaños, numeroPisos);
        this.distanciaCabera = distanciaCabera;
        this.altitud = altitud;
    }
    @Override
   void imprimir() {
    super.imprimir(); 
    System.out.println("Distancia la cabecera municipal = " + distanciaCabera + " km.");
    System.out.println("Altitud sobre el nivel del mar = " + altitud + 
            "metros.");
    System.out.println();
}

}
    

