package Ejercicio3_Sueldos;

public class EmpleadoHora extends Empleado {
    private int cantHoras;
    private int valorHora;

    public EmpleadoHora(int salario, int DNI, String nombre, int valorHora) {
        super(salario, DNI, nombre);
        this.valorHora = valorHora;
    }

    public void addHora() {
        cantHoras++;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public double calcularSalario(){
        return super.getSalario()+(cantHoras*valorHora);
    }
}
