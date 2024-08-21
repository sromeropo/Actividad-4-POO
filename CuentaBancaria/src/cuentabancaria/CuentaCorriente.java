/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancaria;

public class CuentaCorriente extends Cuenta{
    protected float sobregiro;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        sobregiro = 0;
    }
    
    public void retirar(float cant) {
        float saldoTemp = saldo - cant;
        if (saldoTemp < 0) {
            sobregiro -= saldoTemp;
            saldo = 0;
        } else {
            super.retirar(cant);
        }
    }
    
    public void consignar(float cant) {
        float residuo = sobregiro - cant;
        if (sobregiro > 0) {
            if ( residuo > 0) {
                sobregiro = 0;
                saldo = residuo;
            } else{
                sobregiro -= residuo;
                saldo = 0;
            } 
        }else {
            super.consignar(cant);
        }
    }
    
    public void extractoMensual() {
        super.extractoMensual();
    }
    
    public void imprimir() {
        System.out.println("Saldo = $" + saldo);
        System.out.println("Cargo mensual = $" + comMensual);
        System.out.println("Número de transacciones =" + (numConsig + numRetiros));
        System.out.println("Valor de sogregiro = $" + (numConsig + numRetiros));
        System.out.println();
    }
    
}