package Ejercicio5_Avicola;

import java.time.LocalDate;

public class ProdFioNitrogeno extends ProductoFrio{
    private int salinidad;

    public ProdFioNitrogeno(LocalDate fechaVencimiento, int numeroLote, LocalDate fechaEnvasado, String granjaOrigen, int codOrganismo, double tempMant, int salinidad) {
        super(fechaVencimiento, numeroLote, fechaEnvasado, granjaOrigen, codOrganismo, tempMant);
        this.salinidad = salinidad;
    }

    public int getSalinidad() {
        return salinidad;
    }
}
