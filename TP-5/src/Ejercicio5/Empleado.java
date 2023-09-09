package Ejercicio5;

public class Empleado {
    private String nombre;
    private String apellido;
    private int dni;
    private Categoria sueldo;

    public Empleado(String nombre, String apellido, int dni, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldo = new CategoriaBasica(sueldo);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setCategoria (Categoria nuevoSueldo){
        sueldo = nuevoSueldo;
    }
    public double getSueldo(){
        return this.sueldo.calcularSueldo();
    }
}
