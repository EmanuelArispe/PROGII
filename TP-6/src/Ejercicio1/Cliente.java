package Ejercicio1;

public class Cliente {
    private static int numCliente = 0;
    private int idCliente;
    private String nombre;

    public Cliente(String nombre) {
        idCliente = numCliente;
        this.nombre = nombre;
        numCliente++;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Cliente: {" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
