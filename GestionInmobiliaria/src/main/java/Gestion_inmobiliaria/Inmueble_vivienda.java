
package Gestion_inmobiliaria;

/**
 *
 * @author Gianca
 */
public class Inmueble_vivienda extends Inmueble {
    
 protected int num_Habitacion;
 protected int num_Banos;

 public Inmueble_vivienda(int Nid_inmueble, int area_inmueble, String Address_inmueble,int num_Habitacion, int num_Banos) {
 super(Nid_inmueble, area_inmueble, Address_inmueble); /* Invoca al constructor de la clase padre */
 this.num_Habitacion = num_Habitacion;
 this.num_Banos = num_Banos;
 }

 void imprimir() {
 super.imprimir(); // Invoca al método imprimir de la clase padre
 System.out.println("Numero de habitaciones = " +
 num_Habitacion);
 System.out.println("Numero de banos = " + num_Banos);
 } 
    
}
