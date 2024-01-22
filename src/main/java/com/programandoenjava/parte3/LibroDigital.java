package com.programandoenjava.parte3;

public class LibroDigital extends Libro {

    private String urlDescarga;

    public LibroDigital(){
        super();
    }

    public LibroDigital(String title, String autor, int publishYear, String urlDescarga){
        this();
        this.title = title;
        this.autor = autor;
        this.publishYear = publishYear;
        this.urlDescarga = urlDescarga;
    }

}
