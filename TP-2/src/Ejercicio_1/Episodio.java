package Ejercicio_1;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion;

    public Episodio(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        visto = false;
        calificacion = -1;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isVisto() {
        return visto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public void setCalificacion(int calificacion) {
        if(calificacion > 0 && calificacion <= 5) {
            this.calificacion = calificacion;
        }else {
            System.out.println("El valor ingresado no corresponde a los valores de calificacion");
        }
    }

}
