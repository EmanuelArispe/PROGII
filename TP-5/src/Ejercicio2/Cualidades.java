package Ejercicio2;

public class Cualidades {
    private double  habilidad;
    private double fuerza;
    private double resistencia;
    private double agilidad;
    private double coraje;

    public Cualidades(double habilidad, double fuerza, double resistencia, double agilidad, double coraje) {
        this.habilidad = habilidad;
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.agilidad = agilidad;
        this.coraje = coraje;
    }

    public double getHabilidad() {
        return habilidad;
    }

    public double getFuerza() {
        return fuerza;
    }

    public double getResistencia() {
        return resistencia;
    }

    public double getAgilidad() {
        return agilidad;
    }

    public double getCoraje() {
        return coraje;
    }

    @Override
    public String toString() {
        return "Cualidades{" +
                "habilidad=" + habilidad +
                ", fuerza=" + fuerza +
                ", resistencia=" + resistencia +
                ", agilidad=" + agilidad +
                ", coraje=" + coraje +
                '}';
    }


    public boolean equals(Cualidades cualidadesAcomparar) {
        return this.getAgilidad() >= cualidadesAcomparar.getAgilidad() && this.getCoraje() >= cualidadesAcomparar.getCoraje()
                && this.getFuerza() >= cualidadesAcomparar.getFuerza() && this.getHabilidad() >= cualidadesAcomparar.getHabilidad()
                && this.getResistencia() >= cualidadesAcomparar.getResistencia();
    }
}
