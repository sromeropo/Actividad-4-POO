
package Gestion_inmobiliaria;

/**
 *
 * @author Gianca
 */
public class Local_comercial extends Local {
    
 protected static double valorArea = 3000000;
 protected String centro_Comercial;

 public Local_comercial(int Nid_inmueble, int area_inmueble, String Address_inmueble, 
         tipo tipo_Local, String centro_Comercial){
 // Invoca al constructor de la clase padre
 super(Nid_inmueble, area_inmueble, Address_inmueble, tipo_Local);
 this.centro_Comercial = centro_Comercial;
 }

 void imprimir() {
 super.imprimir(); // Invoca al método imprimir de la clase padre
 System.out.println("Centro comercial = " + centro_Comercial);
 System.out.println();
 }
    
}
