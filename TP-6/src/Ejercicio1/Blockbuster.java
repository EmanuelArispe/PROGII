package Ejercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import static java.time.LocalDate.now;

public class Blockbuster {
    private String nombre;
    private ArrayList<Item> listaItems;
    private ArrayList<Alquiler> listaAlquileres;
    private ArrayList<Cliente> listaClientes;

    public Blockbuster(String nombre) {
        this.nombre = nombre;
        listaItems = new ArrayList<Item>();
        listaAlquileres = new ArrayList<Alquiler>();
        listaClientes = new ArrayList<Cliente>();
    }

    public void alquilar(Item item, Cliente cliente){
        if(item.estaDisponible()){
            Alquiler nuevoAlquiler = new Alquiler(item,cliente, now());
            addAlquileres(nuevoAlquiler);
        }else{
            System.out.println("El item no esta disponible para ser alquilado");
        }
    }
    public void addItem(Item nuevoItem){
        //Verificar si ya esta creado
        listaItems.add(nuevoItem);
    }
    private void addAlquileres(Alquiler nuevoAlquiler){
        listaAlquileres.add(nuevoAlquiler);
    }
    public void addCliente(Cliente nuevoCliente){
        listaClientes.add(nuevoCliente);
    }

    public void finalizarAlquiler(Alquiler alq){
       listaAlquileres.remove(alq);
    }
    public void alquileresVencidos(){
        System.out.println("Listado de alquileres vencidos");
        for (Alquiler alq: listaAlquileres) {
            Period period = Period.between(LocalDate.now(), alq.getFechaAlquiler());
            if(period.getDays() >= alq.getItemAlquilado().getDiasAvencer()){
                System.out.println(alq.toString());
            }
        }
    }
}
