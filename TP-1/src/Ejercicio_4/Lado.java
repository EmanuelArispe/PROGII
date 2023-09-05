package Ejercicio_4;

public class Lado {
    private Direccion direc;
    private int longuitud;

    public Lado(Direccion direc, int longuitud) {
        this.direc = direc;
        this.longuitud = longuitud;
    }

    public Direccion getDirec() {
        return direc;
    }

    public int getLonguitud() {
        return longuitud;
    }
}
