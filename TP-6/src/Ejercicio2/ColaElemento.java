package Ejercicio2;

import java.util.ArrayList;

public class ColaElemento {
    private ArrayList<Elemento> listaElementos;

    public ColaElemento() {
        listaElementos = new ArrayList<>();
    }
    public void agregarOrdenado(Elemento nuevoElem){
        for (Elemento elem: listaElementos) {
            if(nuevoElem.esMayor(elem)){
                int pos = listaElementos.indexOf(elem);
                listaElementos.add(pos,nuevoElem);
                return;
            }
        }
        listaElementos.add(nuevoElem);
    }

    public Elemento pedirElemento(){
        return listaElementos.remove(0);
    }

    public int cantElem(){
        return listaElementos.size();
    }
}
