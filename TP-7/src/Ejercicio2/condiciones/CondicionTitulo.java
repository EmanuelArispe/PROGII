package Ejercicio2.condiciones;

import Ejercicio2.Documento;

public class CondicionTitulo extends Condicion{
    private Documento docs1;
    @Override
    public boolean cumple(Documento d1) {
        return docs1.getTitulo().equals(d1.getTitulo());
    }
}
