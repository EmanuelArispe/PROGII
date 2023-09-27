package Ejercicio3;

import java.time.LocalDate;

public class Camion extends Transporte{
    private LocalDate fechaCarga;

    public Camion(String nombre, LocalDate fechaCarga) {
        super(nombre);
        this.fechaCarga = fechaCarga;
    }

    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

    @Override
    public boolean esMayor(Transporte t1) {
        return this.getFechaCarga().compareTo(((Camion) t1).getFechaCarga()) >= 0;
    }
}
