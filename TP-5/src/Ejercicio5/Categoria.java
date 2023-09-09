package Ejercicio5;

public abstract class Categoria {
    private double montoSueldo;
    private int cantVentas;
    private double montoVentasTotales;

    public double getMontoSueldo() {
        return montoSueldo;
    }

    public int getCantVentas() {
        return cantVentas;
    }

    public void setMontoSueldo(double montoSueldo) {
        this.montoSueldo = montoSueldo;
    }

    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }

    public double getMontoVentasTotales() {
        return montoVentasTotales;
    }

    public void setMontoVentasTotales(double montoVentasTotales) {
        this.montoVentasTotales = montoVentasTotales;
    }

    public abstract double calcularSueldo();

}
