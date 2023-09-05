package Ejercicio_3;

public class Rectangulo {
    PuntoGeometrico vertice1;
    PuntoGeometrico vertice2;
    PuntoGeometrico vertice3;
    PuntoGeometrico vertice4;

    public Rectangulo(PuntoGeometrico vertice1, PuntoGeometrico vertice2, PuntoGeometrico vertice3, PuntoGeometrico vertice4) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
        this.vertice4 = vertice4;
    }

    public PuntoGeometrico getVertice1() {
        return vertice1;
    }

    public void setVertice1(PuntoGeometrico vertice1) {
        this.vertice1 = vertice1;
    }

    public PuntoGeometrico getVertice2() {
        return vertice2;
    }

    public void setVertice2(PuntoGeometrico vertice2) {
        this.vertice2 = vertice2;
    }

    public PuntoGeometrico getVertice3() {
        return vertice3;
    }

    public void setVertice3(PuntoGeometrico vertice3) {
        this.vertice3 = vertice3;
    }

    public PuntoGeometrico getVertice4() {
        return vertice4;
    }

    public void setVertice4(PuntoGeometrico vertice4) {
        this.vertice4 = vertice4;
    }

    public void desplazarRectangulo(int despX, int despY){
        vertice1.desplazarPunto(despX,despY);
        vertice2.desplazarPunto(despX,despY);
        vertice3.desplazarPunto(despX,despY);
        vertice4.desplazarPunto(despX,despY);
   }
   public double areaRectangulo(){
    return this.baseRec() * this.alturaRec();
   }

   public int baseRec(){
        int base = 0;
       if (vertice1.getCordY() == vertice2.getCordY()) {
           base = Math.abs(vertice1.getCordX() - vertice2.getCordX());
       }else if (vertice2.getCordY() == vertice3.getCordY()) {
               base = Math.abs(vertice1.getCordX() - vertice2.getCordX());
       }
       return base;
   }
    public int alturaRec(){
        int altura = 0;
        if (vertice1.getCordX() == vertice2.getCordX()) {
            altura = Math.abs(vertice1.getCordY() - vertice2.getCordY());
        }else if (vertice2.getCordX() == vertice3.getCordX()) {
            altura = Math.abs(vertice1.getCordY() - vertice2.getCordY());
        }
        return altura;
    }
   public int compararRectangulo (Rectangulo rect1){
        return Double.compare(rect1.areaRectangulo(), this.areaRectangulo());
   }
   public boolean esCuadrado(){
        return this.baseRec() == this.alturaRec();
   }
   public boolean estaAcostado (){
        return this.baseRec() > this.alturaRec();
   }
}
