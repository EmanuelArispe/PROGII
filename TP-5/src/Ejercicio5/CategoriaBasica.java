package Ejercicio5;

public class CategoriaBasica extends Categoria{


    public CategoriaBasica(Double sueldo) {
        setMontoSueldo(sueldo);
        setCantVentas(0);
        setMontoVentasTotales(0);
    }

    @Override
    public double calcularSueldo() {
        return getMontoSueldo();
    }

    public void addCantVentas(){
        setCantVentas(getCantVentas()+1);
    }
    public void addVenta(double montoNuevaVenta){
        setMontoVentasTotales(getMontoVentasTotales()+montoNuevaVenta);
    }
}
