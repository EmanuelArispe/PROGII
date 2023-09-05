package Ejercicio_3;

public class Impuesto {
    private int monto;
    private String tipo;
    private String descripcion;

    public Impuesto(int monto, String tipo, String descripcion) {
        this.monto = monto;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public int getMonto() {
        return monto;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
