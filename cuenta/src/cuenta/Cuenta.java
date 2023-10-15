/*
 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float comisionMensual = 0;
    protected float tasaAnual;

   
    
public Cuenta(float saldo, float tasaAnual) {
 this.saldo = saldo;
 this.tasaAnual = tasaAnual;}

public void consignar(float cantidad) {
 saldo = saldo + cantidad; 
 numeroConsignaciones = numeroConsignaciones + 1;
}

public void retirar(float cantidad) {
float nuevoSaldo = saldo - cantidad;
if (nuevoSaldo >= 0) {
  saldo -= cantidad;
  numeroRetiros = 1 + numeroRetiros;
 }else{
     System.out.println("la cantidad excede el saldo actual");
 }
}
public void calcularInterés() {
float tasaMensual = tasaAnual / 12; 
float interesMensual = saldo * tasaMensual;
saldo += interesMensual; 
}
public void extractoMensual() {
saldo -= comisionMensual;
calcularInterés();
}
}

    

