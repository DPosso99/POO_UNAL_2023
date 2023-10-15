/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;
import java.util.*;

/**
 *
 * @author win 10 pro
 */
public class PruebaClase {
    public static void main(String args[]) {
Scanner input = new Scanner(System.in);
System.out.println("Cuenta de ahorros");
System.out.println("Ingrese saldo inicial= $");
float saldoInicialAhorros = input.nextFloat(); 
System.out.print("Ingrese tasa de interes= ");
float tasaAhorros = input.nextFloat();
cuentaAhorros cuenta1 = new cuentaAhorros(saldoInicialAhorros, tasaAhorros);
System.out.print("Ingresar cantidad a consignar: $");
float cantidadDepositar = input.nextFloat();
cuenta1.consignar(cantidadDepositar);
System.out.print("Ingresar cantidad a retirar: $");
float cantidadRetirar = input.nextFloat();
cuenta1.retirar(cantidadRetirar);
cuenta1.extractoMensual();
cuenta1.imprimir();
 }}


