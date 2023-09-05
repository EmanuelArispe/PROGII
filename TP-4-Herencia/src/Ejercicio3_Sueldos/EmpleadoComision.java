package Ejercicio3_Sueldos;

public class EmpleadoComision extends Empleado{
    private int cantVentas;
    private final double PORCENTAJE = 0.1;

    public EmpleadoComision(int salario, int DNI, String nombre) {
        super(salario, DNI, nombre);
    }

    public void addVenta(){
        cantVentas++;
    }

    public int getCantVentas() {
        return cantVentas;
    }
    public double calcularSueldo(){
        return (super.getSalario() + (super.getSalario() * (cantVentas * PORCENTAJE)) / 100);
    }
}
