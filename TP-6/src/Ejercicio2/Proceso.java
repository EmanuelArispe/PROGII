package Ejercicio2;

public class Proceso extends Elemento{
    private int memoria;

    public Proceso(String nombre, int memoria) {
        super(nombre);
        this.memoria = memoria;
    }

    public int getMemoria() {
        return memoria;
    }

    @Override
    public boolean esMayor(Elemento elem2) {
        Proceso pros1 = (Proceso) elem2;
        return this.getMemoria() > pros1.getMemoria();
    }
}
