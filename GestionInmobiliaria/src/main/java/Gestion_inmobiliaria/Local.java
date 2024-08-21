
package Gestion_inmobiliaria;

/**
 *
 * @author Gianca
 */
public class Local extends Inmueble{
    
 enum tipo {INTERNO,CALLE};
 protected tipo tipo_Local;

 public Local(int Nid_inmueble, int area_inmueble, String Address_inmueble, tipo tipo_Local) {
 // Invoca al constructor de la clase padre
 
 super(Nid_inmueble, area_inmueble, Address_inmueble);
 this.tipo_Local = tipo_Local;
 }

 void imprimir() {
 super.imprimir(); // Invoca al método imprimir de la clase padre
 System.out.println("Tipo de local = " + tipo_Local);
 }
    
}
