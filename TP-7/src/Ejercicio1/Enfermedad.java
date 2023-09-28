package Ejercicio1;

import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> listaPatologias;

    public Enfermedad(String nombre, ArrayList<String> listaPatologias) {
        this.nombre = nombre;
        this.listaPatologias = listaPatologias;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getListaPatologias() {
        return new ArrayList<String> (listaPatologias);
    }
}
