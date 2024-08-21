/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancaria;

public class Cuenta {
    
    protected float saldo, tasaAnual, comMensual = 0;
    protected int numConsig = 0, numRetiros = 0;
            
    public Cuenta(float saldo, float tasaAnual){
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    
    public void consignar(float cant){
        saldo += cant;
        numConsig += 1;
    }
    
    public void retirar(float cant){
        float saldoTemp = saldo - cant;
        
        if(saldoTemp >= 0){
            saldo -= cant;
            numRetiros += 1;
        } else {
            System.out.println("No tiene suficiente dinero para retirar");
        }
    }
     
    public void interesMensual(){
        float tasaMensual = tasaAnual/12;
        
        float interesMensual = saldo*tasaMensual;
        saldo +=interesMensual;
    }
    
    public void extractoMensual() {
        saldo -= comMensual;
        interesMensual();
    }
    
}
