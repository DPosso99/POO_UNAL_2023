/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

public class cuentaAhorros extends Cuenta{
 private boolean activa;
 
 public cuentaAhorros (float saldo, float tasa) {
 super(saldo,tasa);
 if (saldo < 10000)
    activa = false;
else
activa = true;}
 
 public void retirar(float cantidad) {
if (activa) 
    super.retirar(cantidad); }
 
 public void consignar(float cantidad) {
if (activa) 
    super.consignar(cantidad); }
 
 public void extractoMensual() {
     if (numeroRetiros > 4) {
comisionMensual += (numeroRetiros - 4) * 1000;}
 super.extractoMensual(); 
 if ( saldo < 10000 )
 activa = false;
 }
 public void imprimir() {
System.out.println("Saldo = $" + saldo);
System.out.println("Comision mensual = $" + comisionMensual);
System.out.println("Numero de transacciones = " +(numeroConsignaciones + numeroRetiros));
System.out.println();
 }

}
