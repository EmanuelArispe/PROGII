package Ejercicio3;

public abstract class Transporte {
    private String nombre;

    public Transporte(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public abstract boolean esMayor(Transporte t1);
}
