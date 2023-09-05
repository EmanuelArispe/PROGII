package Ejercicio3_Sueldos;

public class Empleado {
    private int salario;
    private int DNI;
    private String nombre;

    public Empleado(int salario, int DNI, String nombre) {
        this.salario = salario;
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public int getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }
}
