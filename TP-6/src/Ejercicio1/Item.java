package Ejercicio1;

public abstract class Item {
    private int diasAvencer;

    public Item(int diasAvencer) {
        this.diasAvencer = diasAvencer;
    }

    public int getDiasAvencer() {
        return diasAvencer;
    }

    public abstract boolean estaDisponible();
    public abstract String toString();
}
