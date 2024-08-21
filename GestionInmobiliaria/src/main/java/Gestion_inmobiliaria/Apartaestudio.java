
package Gestion_inmobiliaria;

/**
 *
 * @author Gianca
 */
public class Apartaestudio extends Apartamento {
    
    protected static double valorArea = 1500000;
      
    public Apartaestudio (int Nid_inmueble, int area_inmueble, String Address_inmueble,
                        int num_Habitacion, int num_Banos) {
        
        super(Nid_inmueble, area_inmueble, Address_inmueble, 1, 1);
        
            
    }
    
 void imprimir() {
 super.imprimir(); // Invoca al método imprimir de la clase padre
 System.out.println();
    
}
 
}