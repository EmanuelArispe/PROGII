package Ejercicio1;

public class Pelicula extends Item{

    private String nombre;
    private String genero;
    private int copiasDisponibles;
    public final int COPIASMINIMAS = 1;

    public Pelicula(int diasAvencer, String nombre, String genero, int copiasDisponibles) {
        super(diasAvencer);
        this.nombre = nombre;
        this.genero = genero;
        this.copiasDisponibles = copiasDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles += copiasDisponibles;
    }

    @Override
    public boolean estaDisponible() {
        if(copiasDisponibles >= COPIASMINIMAS) {
            setCopiasDisponibles(-1);
            return true;
        }else{
        return false;
        }
    }

    @Override
    public String toString() {
        return "Pelicula {" +
                "nombre='" + nombre +
                '}';
    }
}
