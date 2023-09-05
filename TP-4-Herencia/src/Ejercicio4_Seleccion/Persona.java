package Ejercicio4_Seleccion;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int DNI;
    private String pasaporte;
    private LocalDate fechaNacimiento;
    private Estado estado;

    public Persona(String nombre, String apellido, int DNI, String pasaporte, LocalDate fechaNacimiento, Estado estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.pasaporte = pasaporte;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado nuevoEstado){
        estado = nuevoEstado;
    }

    public boolean equals(Persona p1) {
    return this.DNI == p1.getDNI();
    }
    public boolean estaDisponible(){
        return this.estado == Estado.PAIS_ORIGEN;
    }
}
