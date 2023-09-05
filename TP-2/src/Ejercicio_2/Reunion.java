package Ejercicio_2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;

public class Reunion {
    private String Lugar;
    private String tema;
    private LocalDate fecha;
    private LocalTime horarioInicio;
    private LocalTime horarioFin;


    private ArrayList<Asistente> listaParticipantes;

    public Reunion(String lugar, String tema, LocalDate fecha, LocalTime horarioInicio, LocalTime horarioFin) {
        Lugar = lugar;
        this.tema = tema;
        this.fecha = fecha;
        this.horarioInicio = horarioInicio;
        this.horarioFin = horarioFin;
       listaParticipantes = new ArrayList<>();
    }

    public String getLugar() {
        return Lugar;
    }

    public String getTema() {
        return tema;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHorarioInicio() {
        return horarioInicio;
    }

    public LocalTime getHorarioFin() {
        return horarioFin;
    }

    public ArrayList<Asistente> getListaParticipantes() {
        return listaParticipantes;
    }

    public void agregarParticipante (Asistente persona){
        listaParticipantes.add(persona);
    }
    public void eliminarParticipante (Asistente persona){
        listaParticipantes.remove(persona);
    }
    public int duracion(){
        return Duration.between(horarioInicio,horarioInicio).toMinutesPart();
    }
}
