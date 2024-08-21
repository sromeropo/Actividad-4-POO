
package Gestion_inmobiliaria;

/**
 *
 * @author Gianca
 */
public class Casa_conjunto_cerrado extends Casa_urbana {

 protected static double valorArea = 2500000;
 protected int valAdmin;
 protected boolean Piscina;
 protected boolean Campos_Deportivos;

 public Casa_conjunto_cerrado(int Nid_inmueble, int area_inmueble, String Address_inmueble,
         int num_Habitacion, int num_Banos, int num_Pisos, int valAdmin, 
         boolean Piscina, boolean Campos_Deportivos){
 // Invoca al constructor de la clase padre
 super(Nid_inmueble, area_inmueble, Address_inmueble, num_Banos, num_Habitacion, 
         num_Pisos);
 this.valAdmin = valAdmin;
 this.Piscina = Piscina;
 this.Campos_Deportivos = Campos_Deportivos;
 }

 void imprimir() {
 super.imprimir(); // Invoca al método imprimir de la clase padre
 System.out.println("Valor de la administracion = " +
 valAdmin);
 System.out.println("Tiene piscina? = " + Piscina);
 System.out.println("Tiene campos deportivos? = " +
 Campos_Deportivos);
 System.out.println();
 } 
}
