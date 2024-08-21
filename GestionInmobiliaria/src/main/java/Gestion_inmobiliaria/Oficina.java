
package Gestion_inmobiliaria;

/**
 *
 * @author Gianca
 */
public class Oficina extends Local {
    
 protected static double valorArea = 3500000;
 protected boolean Gobierno;

 public Oficina(int Nid_inmueble, int area_inmueble, String Address_inmueble, 
         tipo tipo_Local, boolean Gobierno) {
 // Invoca al constructor de la clase padre
 super(Nid_inmueble, area_inmueble, Address_inmueble, tipo_Local);
 this.Gobierno = Gobierno;
 }

 void imprimir() {
 super.imprimir(); // Invoca al método imprimir de la clase padre
 System.out.println("Es oficina gubernamental = " + Gobierno);
 System.out.println();
 }
    
}
