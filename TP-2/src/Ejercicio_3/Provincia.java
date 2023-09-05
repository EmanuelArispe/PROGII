package Ejercicio_3;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Ciudad> listaCiudades;


    public Provincia(String nombre, ArrayList<Ciudad> listaCiudades) {
        this.nombre = nombre;
        this.listaCiudades = listaCiudades;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Ciudad> getListaCiudades() {
        return listaCiudades;
    }

    public void addCiudad (Ciudad ciudNueva){
        listaCiudades.add(ciudNueva);
    }

    public boolean estaEnDeficit (){
        int cantCiudades = 0;
        for (Ciudad ciudad: listaCiudades) {
            if( ciudad.getMontoRecaudado() < ciudad.gastosMantenimiento()){
                cantCiudades++;
            }
        }
        return ((listaCiudades.size() / 2) < cantCiudades);
    }

}
