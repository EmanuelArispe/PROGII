package Ejercicio2;



import Ejercicio2.condiciones.Condicion;

import java.util.ArrayList;

public class Historiador {
    private String nombre;
    private ArrayList<Documento> listaDocs;

    public Historiador(String nombre) {
        this.nombre = nombre;
        listaDocs = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public ArrayList<Documento> buscar(Condicion c1){
        ArrayList<Documento> docsBuscados = new ArrayList<>();
        for (Documento docs: listaDocs) {
            if(c1.cumple(docs)){
                docsBuscados.add(docs);
            }
        }
        return docsBuscados;
    }
}
