
package Gestion_inmobiliaria;

/**
 *
 * @author Gianca
 */
public class Casa extends Inmueble_vivienda{
    
 protected int num_Pisos;

 public Casa(int Nid_inmueble, int area_inmueble, String Address_inmueble,int num_Habitacion, int num_Banos, int num_Pisos) {
 // Invoca al constructor de la clase padre
 
 super(Nid_inmueble, area_inmueble, Address_inmueble, num_Banos, num_Habitacion);
 this.num_Pisos = num_Pisos;
 }

 void imprimir() {
 super.imprimir(); // Invoca al método imprimir de la clase padre
 System.out.println("Numero de pisos = " + num_Pisos);
 }
    
}
