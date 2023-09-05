package Ejercicio_1;

import java.util.ArrayList;

public class Serie {
    private String titulo;
    private String descripcion;
    private Genero genero;
    private String creador;
    private ArrayList<Temporada> listaTemporadas;

    public Serie(String titulo, String descripcion, Genero genero, String creador) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.genero = genero;
        this.creador = creador;
        listaTemporadas = new ArrayList<>();
    }
    public void agregarTemporada(Temporada tempNueva){
        listaTemporadas.add(tempNueva);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Genero getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public int episodiosVistos(){
        int count = 0;
        for (Temporada temp: listaTemporadas) {
            count += temp.totalEpisodioVisto();
        }
        return count;
    }
    public double calificacionSerie (){
        int suma = 0;
        for (Temporada temp: listaTemporadas) {
            suma += temp.calificacionTemporada();
        }
        return suma / listaTemporadas.size();
    }

    public boolean seVioTodo (){
        int count = 0;
        for (Temporada temp: listaTemporadas) {
            if(temp.totalEpisodioVisto() == temp.getListaEpisocios().size()){
                count++;
            }
        }
        return count == listaTemporadas.size();
    }
}
