package Ejercicio2;

import java.util.ArrayList;

public class Casa {
    private String nombre;
    private int cantMax;
    private ArrayList<Alumno> listaAlumnos;
    private Cualidades requesitos;

    public Casa(String nombre, int cantMax, ArrayList<Alumno> listaAlumnos, Cualidades requesitos) {
        this.nombre = nombre;
        this.cantMax = cantMax;
        this.listaAlumnos = listaAlumnos;
        this.requesitos = requesitos;;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantMax() {
        return cantMax;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        ArrayList<Alumno> aux = new ArrayList<Alumno>();
        for (Alumno alum: listaAlumnos) {
            aux.add(alum);
        }
        return aux;
    }

    public Cualidades getRequesitos() {
        return requesitos;
    }

    public boolean hayLugar(){
        return listaAlumnos.size() < getCantMax();
    }
    public boolean cumpleRequisitos(Alumno nuevoAlum){
        return !nuevoAlum.isTieneCasa() && nuevoAlum.getCualidades().equals(this.getRequesitos()) && hayLugar();
    }
    public void addAlumno (Alumno nuevoAlum){
        if(this.cumpleRequisitos(nuevoAlum)){
            listaAlumnos.add(nuevoAlum);
            System.out.println("Alumno: " + nuevoAlum.getNombre()+ " Ingresado correctamente");
            nuevoAlum.setTieneCasa(true);
        }else {
            System.out.println("El alumno no puede ingresar a la casa : " + this.getNombre());
        }
    }

}
