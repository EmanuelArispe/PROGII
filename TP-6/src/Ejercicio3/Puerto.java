package Ejercicio3;

import Ejercicio2.Compu;
import Ejercicio2.Proceso;

public class Puerto {
    private String nombre;
    private ColaTransporte listaCamiones;
    private ColaTransporte listaBarcos;

    public Puerto(String nombre) {
        this.nombre = nombre;
        listaBarcos = new ColaTransporte();
        listaCamiones = new ColaTransporte();
    }

    public String getNombre() {
        return nombre;
    }

    // FALTA LA LOGICA DE VER SI HAY BARCOS DISPONIBLES PARA CARGAR
    // SI NO ALMACENAR CAMIONES EN LISTA DE CAMIONES
}
