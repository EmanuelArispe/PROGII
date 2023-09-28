package Ejercicio2.condiciones;

import Ejercicio2.Documento;

public class CondiocionOR extends Condicion {
    private Condicion c1;

    @Override
    public boolean cumple(Documento d1) {
        return !c1.cumple(d1);
    }
}
