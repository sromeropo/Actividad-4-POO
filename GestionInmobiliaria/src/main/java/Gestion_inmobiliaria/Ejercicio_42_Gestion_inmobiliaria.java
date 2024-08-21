
package Gestion_inmobiliaria;

/**
 *
 * @author Gianca
 */
public class Ejercicio_42_Gestion_inmobiliaria {

    public static void main(String[] args) {
        Apartamento_Familiar apto1 = new Apartamento_Familiar(103067,120,
        "Avenida Santander 45-45",3,2,200000);

        System.out.println("Datos apartamento");
        apto1.calcularPrecioVenta(Apartamento_Familiar.valorArea);
        apto1.imprimir();
        
        System.out.println("Datos Casa Gianca");
        Casa_independiente casa1 = new Casa_independiente (12345,44,"Mz a Casa 6, Rosales 1",5,3,3);
        casa1.calcularPrecioVenta(Casa_independiente.valorArea);
        casa1.imprimir();

        
    }
}
