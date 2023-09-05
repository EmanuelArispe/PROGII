package Ejercicio_2;


public class Electrodomestico {
    private String nombre;
    private double precioBase;
    private Color color;
    private int consumo;
    private double peso;
    private final int BAJOCONSUMO = 45;
    private final int MAYORBALANCE = 3;

    public Electrodomestico(String nombre, double precioBase, Color color, int consumo, double peso) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Electrodomestico(String nombre, double precioBase, Color color, int consumo) {
        this(nombre,precioBase,color,consumo,2);
    }

    public Electrodomestico(String nombre, double precioBase, Color color) {
        this(nombre,precioBase,color,10,2);
    }

    public Electrodomestico(String nombre, double precioBase) {
        this(nombre,precioBase,Color.GRIS_PLASTA,10,2);
    }

    public Electrodomestico(String nombre) {
        this(nombre,100,Color.GRIS_PLASTA,10,2);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double balance (){
        return getPrecioBase() / getPeso();
    }
    public boolean esAltaGama(){
        return balance() > MAYORBALANCE;
    }
}
