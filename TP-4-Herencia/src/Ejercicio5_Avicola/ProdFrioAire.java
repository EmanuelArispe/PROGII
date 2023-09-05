package Ejercicio5_Avicola;

import java.time.LocalDate;

public class ProdFrioAire extends ProductoFrio{
    private double porcNitrogeno;
    private double porcOxigeno;
    private double porcCarbono;
    private double porcvalorAgua;

    public ProdFrioAire(LocalDate fechaVencimiento, int numeroLote, LocalDate fechaEnvasado, String granjaOrigen, int codOrganismo, double tempMant, double porcNitrogeno, double porcOxigeno, double porcCarbono, double porcvalorAgua) {
        super(fechaVencimiento, numeroLote, fechaEnvasado, granjaOrigen, codOrganismo, tempMant);
        this.porcNitrogeno = porcNitrogeno;
        this.porcOxigeno = porcOxigeno;
        this.porcCarbono = porcCarbono;
        this.porcvalorAgua = porcvalorAgua;
    }

    public double getPorcNitrogeno() {
        return porcNitrogeno;
    }

    public double getPorcOxigeno() {
        return porcOxigeno;
    }

    public double getPorcCarbono() {
        return porcCarbono;
    }

    public double getPorcvalorAgua() {
        return porcvalorAgua;
    }

    @Override
    public String toString() {
        return super.toString() +  "ProdFrioAire{" +
                "porcNitrogeno=" + porcNitrogeno +
                ", porcOxigeno=" + porcOxigeno +
                ", porcCarbono=" + porcCarbono +
                ", porcvalorAgua=" + porcvalorAgua +
                '}';
    }
}
