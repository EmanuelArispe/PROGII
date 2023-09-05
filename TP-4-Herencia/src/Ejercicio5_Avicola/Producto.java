package Ejercicio5_Avicola;

import java.time.LocalDate;

public class Producto {
    private LocalDate fechaVencimiento;
    private int numeroLote;
    private LocalDate fechaEnvasado;
    private String granjaOrigen;

    public Producto(LocalDate fechaVencimiento, int numeroLote, LocalDate fechaEnvasado,String granjaOrigen) {
        this.fechaVencimiento = fechaVencimiento;
        this.numeroLote = numeroLote;
        this.fechaEnvasado = fechaEnvasado;
        this.granjaOrigen = granjaOrigen;
    }


    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "fechaVencimiento=" + fechaVencimiento +
                ", numeroLote=" + numeroLote +
                ", fechaEnvasado=" + fechaEnvasado +
                ", granjaOrigen='" + granjaOrigen + '\'' +
                '}';
    }
}
