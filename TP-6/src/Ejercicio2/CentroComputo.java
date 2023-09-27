package Ejercicio2;

import java.util.ArrayList;

public class CentroComputo {
    private String nombre;
    private ColaElemento listaCompus;
    private ColaElemento listaProcesos;

    public CentroComputo(String nombre) {
        this.nombre = nombre;
        listaProcesos = new ColaElemento();
        listaCompus = new ColaElemento();
    }

    public String getNombre() {
        return nombre;
    }

    public void asignarProceso(Proceso nuevoPorc){
        if(listaCompus.cantElem() > 0){
            Compu comp = (Compu) listaCompus.pedirElemento();
            // la compu corre el proceso hasta que se termina y finaliza
        }else {
            listaProcesos.agregarOrdenado(nuevoPorc);
        }

    }

}
