package Ejercicio_2;

import java.util.ArrayList;


public class Agenda {
    private ArrayList<Reunion> listaReuniones;

    public Agenda() {
        listaReuniones = new ArrayList<>();
    }

    public void agregarReunion (Reunion reunionNueva){
        if(listaReuniones.size() == 0) {
            listaReuniones.add(reunionNueva);
        }else {
            insertarReunion(reunionNueva);
        }
    }

    public ArrayList<Reunion> reunionesDelDia (Reunion nuevaReunion){
        ArrayList<Reunion> listaReunionesDelDia = new ArrayList<>();
        for (Reunion reunion: listaReuniones) {
            if (reunion.getFecha().getDayOfMonth() == nuevaReunion.getFecha().getDayOfMonth()){
                listaReunionesDelDia.add(reunion);
            }
        }
        return listaReunionesDelDia;
    }
    public Reunion buscarReunionAnterior(ArrayList<Reunion> listaReunionesDelDia, Reunion nuevaReunion ){
        Reunion reunionAnt;
        int i = 0;
        while (i < listaReunionesDelDia.size() &&
                (listaReunionesDelDia.get(i).getHorarioFin().getHour() < nuevaReunion.getHorarioInicio().getHour())){
                i++;
            }
        if ((listaReunionesDelDia.size() > 0) && (listaReunionesDelDia.get(i+1).getHorarioInicio().getHour() <= nuevaReunion.getHorarioFin().getHour())){
            reunionAnt = listaReunionesDelDia.get(i);
        }else {
            reunionAnt = null;
        }
        return reunionAnt;
    }
    public void insertarReunion (Reunion nuevaReunion){
        ArrayList<Reunion> reuniones = reunionesDelDia(nuevaReunion);
        Reunion objPosicion = buscarReunionAnterior(reuniones,nuevaReunion);

        if(objPosicion != null){
            int posicion = listaReuniones.indexOf(objPosicion) + 1;
            listaReuniones.add(posicion,nuevaReunion);
        }else if (reuniones.size() == 0){
            listaReuniones.add(nuevaReunion);
            }else {
                System.out.println("No se puede agregar fecha ocupada");
            }
    }
    }
