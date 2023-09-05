import Ejercicio_1.Persona;
import Ejercicio_2.Color;
import Ejercicio_2.Electrodomestico;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // PRUEBA CLASE PERSONA
        Persona p1 = new Persona(35418187,"Emanuel", LocalDate.of(1990,9,24));

        System.out.println("Fecha de nacimiento: " +p1.getNacimiento());
        System.out.println("Puede votar: " + p1.puedeVotar());
        System.out.println("Es mayor de edad: " + p1.mayorDeEdad());
        System.out.println("Es su cumple " + p1.esSuCumple());
        System.out.println(p1.toString());

        //FIN DE PRUEBA PERSONA

        // INICIO PRUEBA CLASE ELECTRODOMESTICO

        Electrodomestico heladera = new Electrodomestico("heladera",25000, Color.BLANCO,45,150);
        System.out.println("Es alta gama: " + heladera.esAltaGama());
        System.out.println("Su balance es: " +(int) heladera.balance());

        //FIN DE PRUUEBA ELECTRODOMESTICO
    }
}