
package Gestion_inmobiliaria;

/**
 *
 * @author Gianca
 */
public class Inmueble {
    
 protected int Nid_inmueble;
 protected int area_inmueble; // Atributo que identifica el área de un inmueble
 protected String Address_inmueble; /* Atributo que identifica la dirección de
 un inmueble */
 protected double precioVenta;

 Inmueble(int Nid_inmueble, int area_inmueble, String Address_inmueble) {
 this.Nid_inmueble = Nid_inmueble;
 this.area_inmueble = area_inmueble;
 this.Address_inmueble = Address_inmueble;
 }

 double calcularPrecioVenta(double valorArea) {
 precioVenta = area_inmueble * valorArea;
 return precioVenta;
 }

 void imprimir() {
 System.out.println("Identificador inmobiliario = " +
 Nid_inmueble);
 System.out.println("Area = " + area_inmueble);
 System.out.println("Direccion = " + Address_inmueble);
 System.out.println("Precio de venta = $" + precioVenta);
 }
}
    

