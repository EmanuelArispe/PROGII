package Ejercicio6_RegistroEmpresa;

public class Empleado extends Persona{
    private int numLegajo;
    private double sueldo;

    public Empleado(int DNI, String nombre, String apellido, int edad, Cargo rol, int numLegajo, double sueldo) {
        super(DNI, nombre, apellido, edad);
        this.numLegajo = numLegajo;
        this.sueldo = sueldo;
        this.setRol(Cargo.EMPLEADO);
    }

    public int getNumLegajo() {
        return numLegajo;
    }

    public double getSueldo() {
        return sueldo;
    }

}
