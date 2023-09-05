import Ejercicio5_Avicola.ProdFioAgua;
import Ejercicio5_Avicola.ProdFrioAire;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("-------------EJERCICIO AVICOLA-----------");
        ProdFrioAire salchica = new ProdFrioAire(LocalDate.of(2023,10,20),45826,LocalDate.of(2024,10,20),"granjita",45,-42,15.5,75.10,5.2,85.4);
        System.out.println(salchica.toString());
        System.out.println(salchica.getFechaVencimiento());
        System.out.println(salchica.getGranjaOrigen());
        System.out.println(salchica.getTempMant());
        System.out.println(salchica.getPorcNitrogeno());
        System.out.println("------------------------------------");
    }
}