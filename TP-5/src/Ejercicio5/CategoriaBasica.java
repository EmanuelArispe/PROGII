package Ejercicio5;

public class CategoriaBasica extends Categoria{
public final int CANT_VENTAS_INICIALES = 0;
public final int MONTO_VENTA_INICIAL = 0;

    public CategoriaBasica(Double sueldo) {
        setMontoSueldo(sueldo);
        setCantVentas(CANT_VENTAS_INICIALES);
        setMontoVentasTotales(MONTO_VENTA_INICIAL);
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
