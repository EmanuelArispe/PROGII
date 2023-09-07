package Ejercicio2;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private Cualidades cualidades;
    private ArrayList<Alumno> linaje;
    private boolean tieneCasa;
    private int identificador;
    private static int id = 0;

    public Alumno(String nombre, Cualidades cualidades) {
        this.nombre = nombre;
        this.cualidades = cualidades;
        tieneCasa = false;
        linaje = new ArrayList<Alumno>();
        identificador = id;
        id++;
    }

    public String getNombre() {
        return nombre;
    }

    public Cualidades getCualidades() {
        return cualidades;
    }

    public ArrayList<Alumno> getLinaje() {
        return linaje;
    }

    public int getIdentificador() {
        return identificador;
    }

    public boolean isTieneCasa() {
        return tieneCasa;
    }

    public void setTieneCasa(boolean tieneCasa) {
        this.tieneCasa = tieneCasa;
    }

    public boolean equals(Alumno alumComp){
        return this.identificador == alumComp.getIdentificador();
    }

    private boolean estaFamiliar(Alumno familiar){
        int i =0;
        while (i < linaje.size() && !linaje.get(i).equals(familiar)){
            i++;
        }
        return i < linaje.size();
    }
    public void addFamiliar(Alumno familiar){
        if(!estaFamiliar(familiar)){
            linaje.add(familiar);
        }else{
            System.out.println("El linaje ya se  encuentra cargado");
        }
    }
}
