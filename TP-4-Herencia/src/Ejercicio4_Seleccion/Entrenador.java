package Ejercicio4_Seleccion;

import java.time.LocalDate;

public class Entrenador extends Persona{
    public String ident;

    public Entrenador(String nombre, String apellido, int DNI, String pasaporte, LocalDate fechaNacimiento, Estado estado, String ident) {
        super(nombre, apellido, DNI, pasaporte, fechaNacimiento, estado);
        this.ident = ident;
    }

    public String getIdent() {
        return ident;
    }
}
