package Ejercicio1;

import java.time.LocalDate;

public class Alquiler {
    private Item itemAlquilado;
    private Cliente cliente;
    private LocalDate fechaAlquiler;

    public Alquiler(Item itemAlquilado, Cliente cliente, LocalDate fechaAlquiler) {
        this.itemAlquilado = itemAlquilado;
        this.cliente = cliente;
        this.fechaAlquiler = fechaAlquiler;
    }

    public Item getItemAlquilado() {
        return itemAlquilado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "fechaAlquiler=" + fechaAlquiler +
                '}'
                + itemAlquilado.toString()
                + cliente.toString();
    }
}
