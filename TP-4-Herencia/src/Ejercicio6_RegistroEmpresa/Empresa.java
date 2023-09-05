package Ejercicio6_RegistroEmpresa;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Persona> listaPersonas;

    public Empresa (){
        listaPersonas = new ArrayList<Persona>();
    }
    public void addPersona(Persona nuevaPersona){
        if (!estaPersonaNueva(nuevaPersona)) {
            listaPersonas.add(nuevaPersona);
        }else {
            System.out.println("La persona ya existe");
        }
    }
    private boolean estaPersonaNueva (Persona nuevaPersona){
        int i = 0;
        while ((i< listaPersonas.size()) && !(listaPersonas.get(i).equals(nuevaPersona))){
            i++;
        }
        return i < listaPersonas.size();
    }

    public void listadoPersonasAsociadas(){
        for (Persona persona: listaPersonas) {
            persona.toString();
        }
    }
}
