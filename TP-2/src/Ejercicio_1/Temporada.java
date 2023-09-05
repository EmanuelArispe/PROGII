package Ejercicio_1;

import java.util.ArrayList;

public class Temporada {
    private ArrayList<Episodio> listaEpisocios;



    public Temporada() {
        listaEpisocios = new ArrayList<>();
    }
    public ArrayList<Episodio> getListaEpisocios() {
        return listaEpisocios;
    }
    public void addEpisodio(Episodio epiNuevo){
        listaEpisocios.add(epiNuevo);
    }
    public void deleteEpisodio (Episodio epiDelete){
        listaEpisocios.remove(epiDelete);
    }

    public int totalEpisodioVisto (){
        return (int) listaEpisocios.stream().filter(Episodio::isVisto).count();
    }

    public double calificacionTemporada (){
        int suma = 0;
        int count = 0;
        for (Episodio episodio: listaEpisocios) {
            if(episodio.getCalificacion() > 0 ) {
                suma += episodio.getCalificacion();
                count ++;
            }

        }
        return suma / count;
    }

}
