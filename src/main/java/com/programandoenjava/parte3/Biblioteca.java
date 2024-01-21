package com.programandoenjava.parte3;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> biblioteca = new ArrayList<>();

    //metodo para añadir un libro
    public void addBook(Libro libro){
        biblioteca.add(libro);
        System.out.println("Libro " + libro.getTitle() + " añadido a la libreria.");
    }

    //Metodo para buscar un libro en array (version basica)
    public Libro searchById(int idLibro){
        for(Libro libro : biblioteca){
            if(libro.getIdLibro() == idLibro){
                return  libro;
            }
        }
        return null;
    }
    //Metodo para buscar un libro en array (version streams)
    public Libro searchByIdStreams(int idLibro){
        return biblioteca.stream() //convierto la lista en un stram
                .filter(libro -> libro.getIdLibro() == idLibro) //filtro con lambda (objeto y que hago)
                .findFirst() //buscar el primero
                .orElse(null); //sino encuntro retorna null
    }

}
