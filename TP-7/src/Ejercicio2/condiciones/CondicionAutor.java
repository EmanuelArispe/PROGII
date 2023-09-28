package Ejercicio2.condiciones;

import Ejercicio2.Documento;


public class CondicionAutor extends Condicion{
    private Documento doc;

    public CondicionAutor(Documento doc) {
        this.doc = doc;
    }

    @Override
    public boolean cumple(Documento d1) {

        for (String autor: doc.getAutores()) {
            if(d1.getAutores().contains(autor)){
                return true;
            }
        }
        return false;
    }
}
