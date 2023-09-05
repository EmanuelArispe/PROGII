package Ejercicio_1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private LocalDate nacimiento;
    private int DNI;
    private Genero sexo;
    private double peso;
    private double altura;
    private final double INDICEMENOR = 18.5;
    private final int INDICEMAYOR = 25;
    private final int MAYOREDAD = 18;
    private final int MAYORPARAVOTAR = 16;

    public Persona(int DNI,String nombre, LocalDate nacimiento,  Genero sexo, double peso, double altura) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public Persona(int DNI){
        this(DNI, "NN", LocalDate.of(2000,1,1), Genero.FEMENINO, 1, 1);
    }

    public Persona(int DNI, String nombre, LocalDate nacimiento, Genero sexo, double peso) {
        this(DNI, nombre, nacimiento, sexo, peso, 1);
    }

    public Persona( int DNI, String nombre, LocalDate nacimiento, Genero sexo) {
        this(DNI, nombre, nacimiento, sexo, 1, 1);
    }

    public Persona(int DNI,String nombre, LocalDate nacimiento) {
        this(DNI, nombre, nacimiento, Genero.FEMENINO, 1, 1);
    }

    public Persona(int DNI,LocalDate nacimiento) {
        this(DNI, "NN", nacimiento, Genero.FEMENINO, 1, 1);
    }

    public Persona(int DNI,String nombre) {
        this(DNI, nombre, LocalDate.of(2000,1,1), Genero.FEMENINO, 1, 1);
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public int getDNI() {
        return DNI;
    }

    public Genero getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setSexo(Genero sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double indiceMasaCorporal(){
        return getPeso()/getAltura();
    }
    public boolean estaEnForma(){
        return ((indiceMasaCorporal() > INDICEMENOR) && (indiceMasaCorporal() < INDICEMAYOR));
    }
    public boolean esSuCumple (){
            Period periodo = Period.between(LocalDate.now(),getNacimiento());
        return periodo.getDays() == 0;
    }
    public boolean mayorDeEdad(){
        return (LocalDate.now().getYear() - getNacimiento().getYear()) >= MAYOREDAD;
    }

    public boolean puedeVotar(){
        return (LocalDate.now().getYear() - getNacimiento().getYear()) >= MAYORPARAVOTAR;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", nacimiento=" + nacimiento +
                ", DNI=" + DNI +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
