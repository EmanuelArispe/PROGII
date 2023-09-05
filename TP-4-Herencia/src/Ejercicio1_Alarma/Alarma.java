package Ejercicio1_Alarma;

import java.util.ArrayList;

public class Alarma {
    private boolean sensorVidrio;
    private boolean sensorApertura;
    private boolean sensorMovimiento;
    private Timbre timbre;

    public Alarma (){
        sensorApertura = false;
        sensorVidrio = false;
        sensorMovimiento = false;
        timbre = new Timbre();
    }

    public void comprobar(){
        if(this.sensorMovimiento || this.sensorVidrio || this.sensorApertura){
            this.timbre.hacerSonar();
        }
    }

    public boolean isSensorVidrio() {
        return sensorVidrio;
    }

    public boolean isSensorApertura() {
        return sensorApertura;
    }

    public boolean isSensorMovimiento() {
        return sensorMovimiento;
    }

    public Timbre getTimbre() {
        return timbre;
    }

    public void hacerSonar(){
        this.timbre.hacerSonar();
    }
    public void romperCristal(){
        this.sensorVidrio = true;
    }
    public void abrirAbertura(){
        this.sensorApertura = true;
    }
    public void setMovimiento(){
        this.sensorMovimiento = true;
    }
}
