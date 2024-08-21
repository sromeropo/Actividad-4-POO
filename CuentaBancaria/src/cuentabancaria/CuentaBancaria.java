/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabancaria;
import java.util.*;

public class CuentaBancaria {

    public static void main(String[] args) {
        
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial= $ ");
        Scanner input = new Scanner(System.in);
        float saldoInicial = input.nextFloat();
        
        System.out.print("Ingrese tasa de interes= ");
        float tasaAhorros = input.nextFloat();
        
        CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicial, tasaAhorros);
        System.out.print("Ingresar cantidad a consignar: $ ");
        float cantidadDepositar = input.nextFloat();
        cuenta1.consignar(cantidadDepositar);
        
        System.out.print("Ingresar cantidad a retirar: $ ");
        float cantidadRetirar = input.nextFloat();
        cuenta1.retirar(cantidadRetirar);
        cuenta1.extractoMensual();
        cuenta1.imprimir();
    }
    
}
