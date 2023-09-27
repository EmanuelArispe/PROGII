package Ejercicio1;

public class Auto extends Item {
    private String marca;
    private int km;
    private String patente;
    private String tipo;
    private boolean alquilado;

    public Auto(int diasAvencer,String marca, int km, String patente, String tipo) {
        super(diasAvencer);
        this.marca = marca;
        this.km = km;
        this.patente = patente;
        this.tipo = tipo;
        alquilado = false;
    }

    public String getMarca() {
        return marca;
    }

    public int getKm() {
        return km;
    }

    public String getPatente() {
        return patente;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    @Override
    public boolean estaDisponible() {
        return isAlquilado();
    }

    @Override
    public String toString() {
        return "Auto: {" +
                "marca='" + marca + '\'' +
                ", patente='" + patente + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
