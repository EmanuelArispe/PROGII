package Ejercicio3_Sueldos;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> listaEmpleados;

    public Empresa() {
    listaEmpleados =  new ArrayList<Empleado>();
    }
    public void addEmpleado(Empleado nuevoEmpleado){
        listaEmpleados.add(nuevoEmpleado);
    }

}
