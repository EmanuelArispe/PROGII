package Ejercicio4_Seleccion;

import java.time.LocalDate;

public class Mesajista extends Persona{
    private String titulo;
    private int anioExp;

    public Mesajista(String nombre, String apellido, int DNI, String pasaporte, LocalDate fechaNacimiento, Estado estado, String titulo, int anioExp) {
        super(nombre, apellido, DNI, pasaporte, fechaNacimiento, estado);
        this.titulo = titulo;
        this.anioExp = anioExp;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioExp() {
        return anioExp;
    }
}
