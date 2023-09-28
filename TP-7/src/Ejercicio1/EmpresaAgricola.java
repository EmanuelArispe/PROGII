package Ejercicio1;

import Ejercicio1.Buscadores.Condicion;

import java.util.ArrayList;

public class EmpresaAgricola {
    private String nombre;
    private ArrayList<Quimico> agroquimicos;

    public EmpresaAgricola(String nombre, ArrayList<Quimico> agroquimicos) {
        this.nombre = nombre;
        this.agroquimicos = agroquimicos;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Quimico> buscar(Condicion condicionBusqueda){
        ArrayList<Quimico> listaBusqueda = new ArrayList<>();
        for (Quimico quimico: agroquimicos) {
            if(condicionBusqueda.trata(quimico)){
                listaBusqueda.add(quimico);
            }
        }
        return listaBusqueda;
    }
}
