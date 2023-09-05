package Ejercicio_3;

public class PuntoGeometrico {
    private int cordX;
    private int cordY;

    public PuntoGeometrico(int cordX, int cordY) {
        this.cordX = cordX;
        this.cordY = cordY;
    }
    public PuntoGeometrico(){
        this(0,0);
    }

    public int getCordX() {
        return cordX;
    }
    public int getCordY() {
        return cordY;
    }


    public void desplazarPunto(int despX, int despY){
        this.cordX+= despX;
        this.cordX+= despY;
    }
    public double distanciaEuclidea(PuntoGeometrico punto2){
        return Math.sqrt((Math.pow((getCordX() - punto2.getCordX()),2))+(Math.pow(getCordY() - punto2.getCordY(),2)));
    }
}
