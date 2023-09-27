package Ejercicio2;

public class Compu extends Elemento{
    private int velocidad;

    public Compu(String nombre, int velocidad) {
        super(nombre);
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public boolean esMayor(Elemento e) {
        Compu compu1 = (Compu) e;
        return this.getVelocidad() > compu1.getVelocidad();
    }
}
