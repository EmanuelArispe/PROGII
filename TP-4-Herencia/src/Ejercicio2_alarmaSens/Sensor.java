package Ejercicio2_alarmaSens;

public class Sensor {
    private String nombreZona;
    private boolean activado;

    public Sensor(String nombreZona) {
        this.nombreZona = nombreZona;
        activado = false;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public boolean isActivado() {
        return activado;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "nombreZona='" + nombreZona + '\'' +
                ", activado=" + activado +
                '}';
    }
}
