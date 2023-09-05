package Ejercicio4_Seleccion;

import java.time.LocalDate;

public class Futbolista extends Persona{
    private String posicion;
    private String piernaHabil;
    private int cantGoles;

    public Futbolista(String nombre, String apellido, int DNI, String pasaporte, LocalDate fechaNacimiento, Estado estado, String posicion, String piernaHabil) {
        super(nombre, apellido, DNI, pasaporte, fechaNacimiento, estado);
        this.posicion = posicion;
        this.piernaHabil = piernaHabil;
        cantGoles = 0;
    }

    public String getPosicion() {
        return posicion;
    }

    public String getPiernaHabil() {
        return piernaHabil;
    }

    public int getCantGoles() {
        return cantGoles;
    }

    public void addCantGoles(int cantGoles){
        this.cantGoles+= cantGoles;
    }
}
