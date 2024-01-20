package com.programandoenjava.parte1;

public class Parte1 {

    /**
     * Escribe un programa en Java que reciba una cadena de texto y devuelva la
     * misma cadena pero con cada palabra invertida. Por ejemplo, para la entrada "Hola Mundo",
     * la salida debería ser "aloH odluM".
     * @param cadena cadena de entrada
     * @return cadena invertida
     */
    public String invertirPalabras(final String cadena) {
        //controlar si cadena es null
        if(cadena == null) return "";

        //passamos la palabra a array,partimos la palabra con una expresion regular:
        // trantdo los espacios como la propia palabra y los signos
        String [] palabras =  cadena.split("(?<=\\s)|(?=\\s+)");

        //creeem la cadena invertida
        StringBuilder stringBuilder = new StringBuilder();

        //recorremos el array de Strings
        for (String palabra : palabras) {
            // a la cadena añadimos , nuevo string builder para crear de cada palabra invertida
            stringBuilder.append(new StringBuilder(palabra).reverse());
        }
        //retornamos el string builder
        return stringBuilder.toString();

    }
}
