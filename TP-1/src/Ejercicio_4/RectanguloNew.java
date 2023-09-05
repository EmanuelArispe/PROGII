package Ejercicio_4;

import Ejercicio_3.PuntoGeometrico;

public class RectanguloNew {
    private PuntoGeometrico vertice;
    private Lado base;
    private Lado altura;

    public RectanguloNew (PuntoGeometrico v1, PuntoGeometrico v2, PuntoGeometrico v3, PuntoGeometrico v4){
        vertice = v1;
        base = calcularBase(v1,v2);
        altura = calcularAltura(v1,v3);
    }

    public RectanguloNew(PuntoGeometrico vertice, Lado base, Lado altura) {
        this.vertice = vertice;
        this.base = base;
        this.altura = altura;
    }

    public Lado calcularBase(PuntoGeometrico v1, PuntoGeometrico v2){
       int longuitud = 0;
       Direccion direc = Direccion.SIN_DIREC;
       if(v1.getCordY() == v2.getCordY()){
           longuitud = Math.abs(v1.getCordX() - v2.getCordX());
           if (v1.getCordX() < v2.getCordX()){
               direc = Direccion.DERECHA;
           }else {
               direc = Direccion.IZQUIERDA;
           }
       }
        Lado base = new Lado(direc, longuitud);
       return base;
    }
    public Lado calcularAltura(PuntoGeometrico v1, PuntoGeometrico v3){
        int longuitud = 0;
        Direccion direc = Direccion.SIN_DIREC;
        if(v1.getCordX() == v3.getCordX()){
            longuitud = Math.abs(v1.getCordY() - v3.getCordY());
            if (v1.getCordY() < v3.getCordY()){
                direc = Direccion.ARRIBA;
            }else {
                direc = Direccion.ABAJO;
            }
        }
        Lado altura = new Lado(direc, longuitud);
        return altura;
    }
    public void desplazarRec(int despX, int despY){
        vertice.desplazarPunto(despX,despY);
    }
    public double areaRec(){
        return base.getLonguitud() * altura.getLonguitud();
    }

    public int compRectangulo(RectanguloNew rec1){
        return Double.compare(this.areaRec(), rec1.areaRec());
    }

    public boolean esCuadrado(){
        return base.getLonguitud() == altura.getLonguitud();
    }
    public boolean estaAcostado(){
        return base.getLonguitud()> altura.getLonguitud();
    }
}
