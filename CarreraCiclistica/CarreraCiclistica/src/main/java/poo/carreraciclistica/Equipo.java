
package poo.carreraciclistica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Equipo {
    private String nombre; 
    private static double totalTiempo;
    List<Ciclista> listaCiclistas;
    private String pais;
    public Equipo(String nombre, String pais){
        this.nombre = nombre;
        this.pais = pais;
        totalTiempo = 0; 
        listaCiclistas = new ArrayList<>();
    }
       
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private String getPais() {
        return pais;
    }
    
    private void setPais(String pais) {
        this.pais = pais;
    }
 
    void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }
    
    void listarEquipo() {
        for (int i = 0; i < listaCiclistas.size() ; i++) {
            Ciclista c = listaCiclistas.get(i); 
            System.out.println(c.getNombre());
        }
    }
    
    void buscarCiclista() {
        Scanner sc = new Scanner(System.in); 
        String nombreCiclista = sc.next();
        for (int i = 0; i < listaCiclistas.size() ; i++) { 
            Ciclista c = listaCiclistas.get(i); 
            if (c.getNombre().equals(nombreCiclista)) { 
                System.out.println(c.getNombre());
            }
        }
    }
    
    void calcularTotalTiempo() {
        for (int i = 0; i < listaCiclistas.size() ; i++) {
            Ciclista c = listaCiclistas.get(i);
            totalTiempo = totalTiempo + c.getTiempoAcumulado();
        }
    }
  
    void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("País = " + pais);
        System.out.println("Total tiempo del equipo = " + totalTiempo);
    }
}
