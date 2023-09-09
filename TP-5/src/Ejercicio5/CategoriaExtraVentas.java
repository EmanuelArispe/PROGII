package Ejercicio5;

public class CategoriaExtraVentas extends Categoria{
    private double prtjeGanancia;

    public CategoriaExtraVentas(double sueldo, double prtjeGanancia) {
        setMontoSueldo(sueldo);
        this.prtjeGanancia = prtjeGanancia;
    }

    public double getPrtjeGanancia() {
        return prtjeGanancia;
    }

    public void setPrtjeGanancia(double prtjeGanancia) {
        this.prtjeGanancia = prtjeGanancia;
    }

    @Override
    public double calcularSueldo() {
        return getMontoVentasTotales()*getPrtjeGanancia()/100 + getMontoSueldo();
    }
}
