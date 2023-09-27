package Ejercicio3;

public class Barco extends Transporte {
    private int capacidadCarga;

    public Barco(String nombre, int capacidadCarga) {
        super(nombre);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    @Override
    public boolean esMayor(Transporte t1) {
        return this.capacidadCarga > ((Barco) t1).getCapacidadCarga();
    }
}
