package Ejercicio2;

import java.util.ArrayList;

public class CasaLinaje extends Casa{
    public CasaLinaje(String nombre, int cantMax, ArrayList<Alumno> listaAlumnos, Cualidades requesitos) {
        super(nombre, cantMax, listaAlumnos, requesitos);
    }

    @Override
    public boolean cumpleRequisitos(Alumno nuevoAlum){
        return super.cumpleRequisitos(nuevoAlum) && tieneFamiliar(nuevoAlum);
    }

    private boolean tieneFamiliar(Alumno nuevoAlum){
        for (Alumno alum: this.getListaAlumnos()) { //lista de alumnos de la casa
            for (Alumno familiar: nuevoAlum.getLinaje()) { // lista de familiares(alumnos) de cada alumno
                if(alum.equals(familiar)){
                    return true;
                }
            }
        }
        return false;
    }
}
