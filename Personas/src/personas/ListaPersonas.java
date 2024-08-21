package personas;


import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class ListaPersonas {
    private List<Persona> lista;

    public ListaPersonas() {
        lista = new ArrayList<>();
    }

    public void añadirPersona(Persona p) {
        lista.add(p);
    }

    public void eliminarPersona(int i) {
        lista.remove(i);  
    }

    public void borrarLista() {
        lista.clear();
    }
}
