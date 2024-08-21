
package Gestion_inmobiliaria;

/**
 *
 * @author Gianca
 */
public class Casa_urbana extends Casa{
    
 public Casa_urbana(int Nid_inmueble, int area_inmueble, String Address_inmueble, int num_Habitacion, int num_Banos, int num_Pisos) {
 // Invoca al constructor de la clase padre
 super(Nid_inmueble, area_inmueble, Address_inmueble, num_Banos, num_Habitacion, 
         num_Pisos);
 }

 @Override
 void imprimir() {
 super.imprimir(); // Invoca al método imprimir de la clase padre
 }

    
}
