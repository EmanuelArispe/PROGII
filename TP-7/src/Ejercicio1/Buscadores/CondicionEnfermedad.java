package Ejercicio1.Buscadores;

import Ejercicio1.Cultivo;
import Ejercicio1.Enfermedad;
import Ejercicio1.Quimico;

public class CondicionEnfermedad extends CondicionQuimico{
    private Cultivo cultComparar;

    public CondicionEnfermedad(Enfermedad enfermedadBuscada, Cultivo cultComparar) {
        super(enfermedadBuscada);
        this.cultComparar = cultComparar;
    }

    public  boolean trata(Quimico q1) {
        return !q1.getListaCultivos().contains(cultComparar) && super.trata(q1);
    }
}
