package Ejercicio5_Avicola;

import java.time.LocalDate;

public class ProdFioAgua extends ProductoFrio {
    private String metodoEmpleado;
    private int tiempoExposicion;

    public ProdFioAgua(LocalDate fechaVencimiento, int numeroLote, LocalDate fechaEnvasado, String granjaOrigen, int codOrganismo, double tempMant, String metodoEmpleado, int tiempoExposicion) {
        super(fechaVencimiento, numeroLote, fechaEnvasado, granjaOrigen, codOrganismo, tempMant);
        this.metodoEmpleado = metodoEmpleado;
        this.tiempoExposicion = tiempoExposicion;
    }

}
