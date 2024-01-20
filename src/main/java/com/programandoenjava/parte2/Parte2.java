package com.programandoenjava.parte2;

import java.util.ArrayList;

/**
 * Implementa en Java que tenga un método
 * para agregar números enteros y otro método para calcular
 * la suma de todos los elementos en la lista.
 */
public class Parte2 {

    private ArrayList<Integer> arrayList = new ArrayList<Integer>();

    /**
     * Calcula la suma de todos los números enteros.
     *
     * @return La suma de los números enteros.
     */
    public int sumarNumeros() {
        int sumatori = 0;

        for(int numero : arrayList){
            sumatori+= numero;
        }

        return sumatori;
    }

    /**
     * Agrega un número entero a la lista.
     *
     * @param numero El número entero que se va a agregar.
     */
    public void agregarNumero(int numero) {
        this.arrayList.add(numero);
    }
}
