package Ejercicio3;

import Ejercicio2.Elemento;

import java.util.ArrayList;

public class ColaTransporte {
    private ArrayList<Transporte> listaTransporte;

    public ColaTransporte() {
        listaTransporte = new ArrayList<>();
    }

    public void agregarOrdenado(Transporte nuevoTransp){
        for (Transporte transporte: listaTransporte) {
            if(nuevoTransp.esMayor(transporte)){
                int pos = listaTransporte.indexOf(transporte);
                listaTransporte.add(pos,nuevoTransp);
                return;
            }
        }
        listaTransporte.add(nuevoTransp);
    }

    public Transporte pedirElemento(){
        return listaTransporte.remove(0);
    }

    public int cantElem(){
        return listaTransporte.size();
    }
}
