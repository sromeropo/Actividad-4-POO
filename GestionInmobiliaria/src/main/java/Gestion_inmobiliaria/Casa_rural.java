
package Gestion_inmobiliaria;

/**
 *
 * @author Gianca
 */
public class Casa_rural extends Casa {
   
 protected static double valorArea = 1500000;
 protected int distancia_Cabera;
 protected int altitud_casa;

 public Casa_rural(int Nid_inmueble, int area_inmueble, String Address_inmueble,
         int num_Habitacion, int num_Banos, int num_Pisos, int distancia_Cabera, 
         int altitud_casa) {
 // Invoca al constructor de la clase padre

 super(Nid_inmueble, area_inmueble, Address_inmueble, num_Banos, num_Habitacion, 
         num_Pisos);

 this.distancia_Cabera = distancia_Cabera;
 this.altitud_casa = altitud_casa;
 }
 void imprimir() {
 super.imprimir(); // Invoca al método imprimir de la clase padre
 System.out.println("Distancia la cabecera municipal = " +
 distancia_Cabera + " km.");
 System.out.println("Altitud sobre el nivel del mar = " + altitud_casa +
 " metros.");
 System.out.println();
 } 
    
}
