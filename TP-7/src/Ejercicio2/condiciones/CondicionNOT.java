package Ejercicio2.condiciones;

import Ejercicio2.Documento;

public class CondicionNOT extends Condicion{
    private Condicion c1;
    private Condicion c2;

    public CondicionNOT(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Documento d1) {
        return c1.cumple(d1) || c2.cumple(d1);
    }
}
