package Ejercicio2;

import java.util.ArrayList;

public class Documento {
    private String titulo;
    private ArrayList<String> autores;
    private String contTextual;
    private ArrayList<String> palabrasClaves;

    public Documento(String titulo, String contTextual) {
        this.titulo = titulo;
        this.contTextual = contTextual;
        autores = new ArrayList<>();
        palabrasClaves = new ArrayList<>();
    }

    public void addAutor(String nuevoAutor){
        autores.add(nuevoAutor);
    }
    public void addPalabraClav (String nuevaPal){
        palabrasClaves.add(nuevaPal);
    }
    public String getTitulo() {
        return titulo;
    }

    public String getContTextual() {
        return contTextual;
    }

    public ArrayList<String> getAutores() {
        return new ArrayList<String> (autores);
    }

    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<String> (palabrasClaves);
    }

}
