package com.programandoenjava.parte3;

public class Libro {

    protected String title;
    protected String autor;
    protected int publishYear;
    //variable de id per objecte
    protected final int idLibro;
    //variable id (contador per tots els objectes)
    protected static int uiidContador;

    public Libro(){
        this.idLibro = ++Libro.uiidContador;
    }

    public Libro(String title, String autor, int publishYear){
        this(); //llamamos el contructor vacio per assignar id (primir incfrementem i despres asignem)
        this.title = title;
        this.autor = autor;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public static int getUiidContador() {
        return uiidContador;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", publishYear=" + publishYear +
                ", idLibro=" + idLibro +
                '}';
    }
}
