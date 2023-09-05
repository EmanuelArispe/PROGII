package Ejercicio6_RegistroEmpresa;

import java.util.ArrayList;

public class Jerarquico extends Empleado {
    private ArrayList<Empleado> empleadosACargo;

    public Jerarquico(int DNI, String nombre, String apellido, int edad, Cargo rol, int numLegajo, double sueldo, ArrayList<Empleado> empleadosACargo) {
        super(DNI, nombre, apellido, edad, rol, numLegajo, sueldo);
        empleadosACargo = new ArrayList<Empleado>();
        this.setRol(Cargo.JERARQUICO);
    }

    public void addEmpleado(Empleado nuevoEmpleado){
        if(!estaPersonaNueva(nuevoEmpleado))
            empleadosACargo.add(nuevoEmpleado);
        else System.out.println("El empleado ya esta cargado");
    }
    private boolean estaPersonaNueva (Empleado nuevoEmpleado){
        int i = 0;
        while ((i< empleadosACargo.size()) && !(empleadosACargo.get(i).equals(nuevoEmpleado))){
            i++;
        }
        return i < empleadosACargo.size();
    }
}
