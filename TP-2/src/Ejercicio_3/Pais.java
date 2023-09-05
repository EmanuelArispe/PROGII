package Ejercicio_3;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private ArrayList<Provincia> listaProvincias;
    private final int MINPOBLACION =  100000;

    public Pais(String nombre, ArrayList<Provincia> listaProvincias) {
        this.nombre = nombre;
        this.listaProvincias = listaProvincias;
    }
    public void addProvincia(Provincia provNueva){
        listaProvincias.add(provNueva);
    }
    public void ciudadesEnDeficit (){
        System.out.println("Ciudades que estan en deficit que superan el minimo poblacional");
        for (Provincia prov: listaProvincias) {
            for (Ciudad ciudad: prov.getListaCiudades()) {
                if (superaMinHabit(ciudad) && enDeficit(ciudad)){
                    System.out.println(ciudad.getNombre());
                }
            }
        }
    }

    private boolean superaMinHabit (Ciudad ciudad){
        return ciudad.getCantHabitantes() > MINPOBLACION;
    }
    private boolean enDeficit (Ciudad ciudad){
        return ciudad.gastosMantenimiento() > ciudad.getMontoRecaudado();
    }

    public void provEnDeficil(){
        System.out.println("Provincias en deficit:");
        for (Provincia prov: listaProvincias) {
            if (prov.estaEnDeficit()){
                System.out.println(prov.getNombre());
            }
        }
    }
}
