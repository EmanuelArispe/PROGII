package Ejercicio1;

public class Pila {
    private Object[] lista;
    private int MAX = 10;

    public Pila(){
        lista = new Object[MAX];
    }

    public void push(Object nuevoObj){
        int pos = ultimaPos();
        if(pos < MAX){
            lista[pos] = nuevoObj;
        }else{
            ampliarTamanio();
            lista[pos] = nuevoObj;
        }
    }
    private int ultimaPos (){
        int i = 0;
        while ((i < MAX) && (lista[i] != null)){
            i++;
        }
    return i;
    }
    private void ampliarTamanio(){
        int MAX_AUX = MAX*2;
        Object[] aux = new Object[MAX_AUX];
        for(int i = 0; i < MAX; i++){
            aux[i] = lista[i];
        }
        MAX = MAX_AUX;
        lista = aux;
    }
    public Object top(){
        int i = 0;
        while (i<MAX && lista[i] != null){
            i++;
        }
        return lista[i];
    }

    public Object pop(){
        int i = 0;
        while (i<MAX && lista[i] != null){
            i++;
        }
        Object aux = lista[i];
        lista[i] = null;
        return aux;
    }
    public int size(){
        int i = 0;
        while (i<MAX && lista[i] != null){
            i++;
        }
        return i;
    }

    public Object[] copy(){
        Object[] aux = new Object[MAX];
        for(int i=0; i<MAX;i++){
            aux[i] = lista[i];
        }
        return aux;
    }
    public Object[] reverse(){
        Object[] aux = new Object[MAX];
        for(int i=0; i<MAX;i++){
            aux[i] = lista[MAX-1-i];
        }
        return aux;
    }
    private void corrimientoIzq(int pos){
        for (int i = pos; i<MAX-1;i++){
            lista[i] = lista[i+1];
        }
    }
}
