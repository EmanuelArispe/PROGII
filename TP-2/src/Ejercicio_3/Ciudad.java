package Ejercicio_3;

import java.util.ArrayList;

public class Ciudad {
    private String nombre;
    private int cantHabitantes;
    private ArrayList<Impuesto> listaImpuestos;
    private double montoRecaudado;

    public Ciudad(String nombre, int cantHabitantes, ArrayList<Impuesto> listaImpuestos, double montoRecaudado) {
        this.nombre = nombre;
        this.cantHabitantes = cantHabitantes;
        this.listaImpuestos = listaImpuestos;
        this.montoRecaudado = montoRecaudado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantHabitantes() {
        return cantHabitantes;
    }

    public ArrayList<Impuesto> getListaImpuestos() {
        return listaImpuestos;
    }

    public double getMontoRecaudado() {
        return montoRecaudado;
    }

    public void setCantHabitantes(int cantHabitantes) {
        this.cantHabitantes = cantHabitantes;
    }

    public double gastosMantenimiento (){
        double sumaGastos = 0;
        for (Impuesto imp: listaImpuestos) {
            sumaGastos+= imp.getMonto();
        }
        return sumaGastos;
    }

}
