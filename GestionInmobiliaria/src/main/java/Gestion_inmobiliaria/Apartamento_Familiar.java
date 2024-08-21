package Gestion_inmobiliaria;

/**
 *
 * @author Gianca
 */
public class Apartamento_Familiar extends Apartamento {
    
    protected static double valorArea = 2000000;
    protected int valor_Administracion;
    
    public Apartamento_Familiar (int Nid_inmueble, int area_inmueble, String Address_inmueble,
                        int num_Habitacion, int num_Banos, int valor_Administracion ) {
        
        super(Nid_inmueble, area_inmueble, Address_inmueble, num_Banos, num_Habitacion);
        this.valor_Administracion = valor_Administracion; 
            
    }
    
 void imprimir() {
 super.imprimir(); // Invoca al método imprimir de la clase padre
 System.out.println("Valor de la administración = $" +
 valor_Administracion);
 System.out.println();
 } 
    
}
    
