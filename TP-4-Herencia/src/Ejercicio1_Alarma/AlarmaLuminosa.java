package Ejercicio1_Alarma;

public class AlarmaLuminosa extends Alarma {

    private Luz luz;

    public AlarmaLuminosa(){
        super();
        luz = new Luz();
    }

    public void comprobar(){
        if(super.isSensorApertura() || super.isSensorVidrio() || super.isSensorMovimiento()){
            super.hacerSonar();
            this.luz.enceder();
        }
    }
}
