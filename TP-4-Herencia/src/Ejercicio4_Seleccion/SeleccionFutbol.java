package Ejercicio4_Seleccion;

import java.util.ArrayList;

public class SeleccionFutbol {
    private ArrayList<Persona> contingente;
    private String nombre;

    public SeleccionFutbol(String nombre) {
        this.nombre = nombre;
        contingente = new ArrayList<Persona>();
    }

    public void addPersona(Persona nuevaPersona){
        if(verificarExistencia(nuevaPersona)){
            System.out.println("No se puede cargar, La persona ya existe");
        }else{
            contingente.add(nuevaPersona);
        }
    }

    private boolean verificarExistencia (Persona p1){
        int i = 0;
        while (i < contingente.size() & !contingente.get(i).equals(p1)){
            i++;
        }
        return i < contingente.size();
        }

}
