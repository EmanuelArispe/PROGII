package Ejercicio2_alarmaSens;

import java.util.ArrayList;

public class Alarma {
    private ArrayList<Sensor> listaSensores;
    private Timbre timbre;
    private Luz luz;

    public Alarma (){
        listaSensores = new ArrayList<Sensor>();
        timbre = new Timbre();
    }
    public void addSensor (Sensor newSensor){
        listaSensores.add(newSensor);
    }

    public void controlar(){
        for (Sensor sensor: listaSensores) {
            if (sensor.isActivado()) {
                timbre.hacerSonar();
                sensor.toString();
                luz.enceder();
            }else {
                System.out.println("no hay sensores activados");
            }
        }
    }
}
