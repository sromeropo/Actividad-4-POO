/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancaria;

public class CuentaAhorros extends Cuenta{
    
    protected boolean estadoCuenta;
    
    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        estadoCuenta = saldo<10000;
    }
    
    public void Consignar(float cant){
        if(estadoCuenta){
            super.consignar(cant);
        }
    }
    
    public void Retirar(float cant){
        if(estadoCuenta){
            super.retirar(cant);
        }
    }
    
    public void extractoMensual(){
        if(numRetiros > 4){
            comMensual += (numRetiros - 4)*1000;
        }
        super.extractoMensual();
        estadoCuenta = saldo<10000;
    }
    
    public void imprimir() {
        System.out.println("Saldo = $" + saldo);
        System.out.println("Comisión mensual = $"+ comMensual);
        System.out.println("Número de transacciones = " +(numConsig + numRetiros));
        System.out.println();
    }
}
