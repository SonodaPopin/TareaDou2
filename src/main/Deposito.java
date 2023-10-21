package main;

import java.util.ArrayList;

/**
 * Esta clase sirve como deposito para guardar otros elementos
 * @param <T> - tipo de elementos que se van a almacenar
 */
public class Deposito<T>{
    private ArrayList<T> almacen;
    /**
     * Método para crear el depósito
     */
    public Deposito(){
        almacen = new ArrayList<T>();
    }
    /**
     * Método para añadir un objeto al depósito
     * @param a - objeto a añadir
     */
    public void addT(T a){
        almacen.add(a);
    }
    /**
     * Método para sacar un objeto del depósito
     * @return - objeto obtenido
     */
    public T getT(){
        T x = almacen.get(0);
        almacen.remove(0);
        return x;
    }
    /**
     * Método para saber la cantidad de objetos restantes en el depósito
     * @return - número de objetos restantes
     */
    public int getCantidad() {
    	return almacen.size();
    }
}
