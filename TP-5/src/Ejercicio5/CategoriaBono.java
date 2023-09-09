package Ejercicio5;

public class CategoriaBono extends Categoria{
    private double montoBono;
    private int minimoVentas;

    public CategoriaBono(double sueldo, double montoBono, int minimoVentas) {
        setMontoSueldo(sueldo);
        this.montoBono = montoBono;

    }

    public double getMontoBono() {
        return montoBono;
    }

    public void setMontoBono(double montoBono) {
        this.montoBono = montoBono;
    }

    public int getMinimoVentas() {
        return minimoVentas;
    }

    public void setMinimoVentas(int minimoVentas) {
        this.minimoVentas = minimoVentas;
    }

    private boolean superaVentas(){
        return getCantVentas() >= getMinimoVentas();

    }
    @Override
    public double calcularSueldo() {
        if(superaVentas()){
            return getMontoBono()+getMontoSueldo();
        }else {
            return getMontoSueldo();
        }
    }
}
