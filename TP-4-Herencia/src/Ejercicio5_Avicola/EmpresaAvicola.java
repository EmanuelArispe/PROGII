package Ejercicio5_Avicola;

import java.util.ArrayList;

public class EmpresaAvicola {
    private ArrayList<Producto> listaProductos;

    public EmpresaAvicola() {
        listaProductos = new ArrayList<Producto>();
    }
public void addProducto (Producto nuevoProducto){
        listaProductos.add(nuevoProducto);
}

}
