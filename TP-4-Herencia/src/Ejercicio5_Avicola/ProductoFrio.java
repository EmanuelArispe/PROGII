package Ejercicio5_Avicola;

import java.time.LocalDate;

public class ProductoFrio extends Producto{
    private int codOrganismo;
    private double tempMant;

    public ProductoFrio(LocalDate fechaVencimiento, int numeroLote, LocalDate fechaEnvasado, String granjaOrigen, int codOrganismo, double tempMant) {
        super(fechaVencimiento, numeroLote, fechaEnvasado, granjaOrigen);
        this.codOrganismo = codOrganismo;
        this.tempMant = tempMant;
    }

    public int getCodOrganismo() {
        return codOrganismo;
    }

    public double getTempMant() {
        return tempMant;
    }

    @Override
    public String toString() {
        return super.toString() + "ProductoFrio{" +
                "codOrganismo=" + codOrganismo +
                ", tempMant=" + tempMant +
                '}';
    }
}
