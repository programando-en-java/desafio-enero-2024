package com.programandoenjava.parte1;

public class Parte1 {

    /**
     * Escribe un programa en Java que reciba una cadena de texto y devuelva la
     * misma cadena pero con cada palabra invertida. Por ejemplo, para la entrada "Hola Mundo",
     * la salida debería ser "aloH odluM".
     *
     * @param cadena cadena de entrada
     * @return cadena invertida
     */
    public String invertirPalabras(final String cadena) {

        // Verify if we have a valid input
        if (cadena == null || cadena.equals("")) {
            return "";
        }

        String[] arrayElement = cadena.split(" ");
        String result = cadena;

        // Iterate over the array of words and reverse each word
        for (
                int indexCounter = 0;
                indexCounter < arrayElement.length;
                indexCounter++
        ) {
            String reverseWord = new StringBuilder(arrayElement[indexCounter]).reverse().toString();
            result = result.replace(arrayElement[indexCounter],reverseWord);
        }

        return result;
    }
}
