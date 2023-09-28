package Ejercicio1;

import java.util.ArrayList;

public class Quimico {
    private String nombre;
    private ArrayList<Cultivo> listaCultivos;
    private ArrayList<String> listaPatologias;

    public Quimico(String nombre, ArrayList<String> listaPatologias) {
        this.nombre = nombre;
        this.listaPatologias = listaPatologias;
        listaCultivos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getListaPatologias() {
        // se tiene que realizar una copia de los elementos y pasarle sola la copia por seguridad
        return new ArrayList<String>(listaPatologias);
    }

    public ArrayList<Cultivo> getListaCultivos() {
        return new ArrayList<Cultivo> (listaCultivos);
    }
}
