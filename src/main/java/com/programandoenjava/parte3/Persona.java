package com.programandoenjava.parte3;

import java.util.ArrayList;
import java.util.Iterator;

public class Persona {

    private final int idPersona;
    private static int uiidPersones;
    private String name;
    private int edad;

    private ArrayList<Libro> reserves = new ArrayList<>();

    public Persona () {
        this.idPersona = ++Persona.uiidPersones;
    }

    public Persona (String name, int edad) {
        this();
        this.name = name;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdPersona(){
        return idPersona;
    }

    public void tomarPrestado (Libro libro) {
        reserves.add(libro);
        System.out.println("Libro reservado " + libro.getTitle()+ " por " + this.getName());
    }

    public void devolverLibro (Libro libro) {
        if(existeLibro(libro)) {
            Iterator<Libro> iterator = reserves.iterator();
            while (iterator.hasNext()) {
                Libro book = iterator.next();
                if(book.getIdLibro() == libro.getIdLibro()){
                    iterator.remove();
                    break;
                }
            }
            System.out.println("Libro devuelto");
        }else {System.out.println("Libro no tienes assignado.");}

    }

    private boolean existeLibro(Libro libro) {
        return reserves.stream().anyMatch(e-> libro.getIdLibro() == e.getIdLibro());
    }

}
