package com.programandoenjava;

import com.programandoenjava.parte1.Parte1;
import com.programandoenjava.parte3.Biblioteca;
import com.programandoenjava.parte3.Libro;
import com.programandoenjava.parte3.LibroDigital;
import com.programandoenjava.parte3.Persona;

public class Main {

    public static void main(String[] args) {

//        Parte1 parte1 = new Parte1();
//        System.out.println(parte1.invertirPalabras("david quinones"));
//
//        Libro libro = new Libro();
//        System.out.println(libro.getIdLibro());
//
//        Libro libro1 = new Libro();
//        System.out.println(libro1.getIdLibro());
//
//        Biblioteca biblioteca = new Biblioteca();
//
//        biblioteca.addBook(libro);
//        biblioteca.addBook(libro1);
//
//        System.out.println(biblioteca.searchById(1).getIdLibro());
//        System.out.println(biblioteca.searchByIdStreams(2).getIdLibro());
//        System.out.println(biblioteca.searchByIdStreams(2).getClass());
//        Libro libro2 = biblioteca.searchByIdStreams(3);
//        if(libro2 == null) System.out.println("es null");

        //creamos una biblioteca
        Biblioteca biblioteca = new Biblioteca();
        //añadismos Lirbs

        biblioteca.addBook(new Libro("David El Gnmom", "Goliat", 1992));
        biblioteca.addBook(new Libro("Kimba", "David", 2017));
        biblioteca.addBook(new Libro("Ter", "Eulalia", 2020));
        //Creamos una persona reservamos y devolvemos
        Persona persona = new Persona("David", 31);
        persona.tomarPrestado(biblioteca.searchById(1));

        persona.devolverLibro(biblioteca.searchById(1));
        persona.devolverLibro(biblioteca.searchById(3));


        LibroDigital libroDigital = new LibroDigital();
        System.out.println(libroDigital.getIdLibro());

        LibroDigital libroDigital1 = new LibroDigital("Sol y Sombra", "Kimba", 2023, "www.com.es");
        System.out.println(libroDigital1);



    }
}