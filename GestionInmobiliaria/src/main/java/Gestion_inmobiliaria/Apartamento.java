
package Gestion_inmobiliaria;

/**
 *
 * @author Gianca
 */
public class Apartamento extends Inmueble_vivienda{
    
 public Apartamento(int Nid_inmueble, int area_inmueble, String Address_inmueble,int num_Habitacion, int num_Banos) {
 // Invoca al constructor de la clase padre
 
 super(Nid_inmueble, area_inmueble, Address_inmueble, num_Banos, num_Habitacion);
 }

 void imprimir() {
 super.imprimir(); // Invoca al método imprimir de la clase padre
 }
} 
    

