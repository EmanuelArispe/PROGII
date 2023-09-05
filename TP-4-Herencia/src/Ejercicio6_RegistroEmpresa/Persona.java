package Ejercicio6_RegistroEmpresa;

import java.util.Objects;

public class Persona {
    private int DNI;
    private String nombre;
    private String apellido;
    private int edad;
    private Cargo rol;

    public Persona(int DNI, String nombre, String apellido, int edad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public Cargo getRol() {
        return rol;
    }

    public void setRol(Cargo rol) {
        this.rol = rol;
    }

    public boolean equals(Persona p1) {
        return getDNI() == p1.getDNI();
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", rol=" + rol +
                '}';
    }
}
