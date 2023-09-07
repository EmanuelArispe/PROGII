package Ejercicio2;

import java.util.ArrayList;

public class CasaEnemiga extends Casa{
    private ArrayList<Casa> casasEnemigas;

    public CasaEnemiga(String nombre, int cantMax, ArrayList<Alumno> listaAlumnos, Cualidades requesitos, int idEnemistad) {
        super(nombre, cantMax, listaAlumnos, requesitos);
        casasEnemigas = new ArrayList<Casa>();
    }

    public void addCasaEnemiga(Casa enemigaNueva){
        //Falta verificar que la casa a agregar no se encuentre agregada
        casasEnemigas.add(enemigaNueva);
    }

    public boolean NOesAceptado(Alumno nuevoAlum){
        int contador = 0;
        for (Casa casaEnem: casasEnemigas) {
            if(!casaEnem.cumpleRequisitos(nuevoAlum)){
                contador++;
            }
        }
        return contador == casasEnemigas.size();
    }
    @Override
    public boolean cumpleRequisitos (Alumno nuevoAlumno){
        return super.cumpleRequisitos(nuevoAlumno) && NOesAceptado(nuevoAlumno);
    }
}
