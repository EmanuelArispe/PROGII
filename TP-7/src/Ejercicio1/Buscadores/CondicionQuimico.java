package Ejercicio1.Buscadores;

import Ejercicio1.Enfermedad;
import Ejercicio1.Quimico;

public class CondicionQuimico extends Condicion {
    private Enfermedad enfermedadBuscada;

    public CondicionQuimico(Enfermedad enfermedadBuscada) {
        this.enfermedadBuscada = enfermedadBuscada;
    }

    @Override
    public boolean trata(Quimico q1) {
        int cont = 0;
        for (String patoligia: q1.getListaPatologias()) {
            if (enfermedadBuscada.getListaPatologias().contains(patoligia)){
                cont++;
            }
        }
        return q1.getListaPatologias().size() == cont;
    }
}
