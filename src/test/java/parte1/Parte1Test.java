package parte1;

import com.programandoenjava.parte1.Parte1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Parte1Test {

    private Parte1 parte1;

    @BeforeEach
    public void setUp() {
        parte1 = new Parte1();
    }

    @Test
    public void testInvertirPalabrasCaso1() {
        String resultado = parte1.invertirPalabras("Hola Mundo");
        assertEquals("aloH odnuM", resultado);
    }

    @Test
    public void testInvertirPalabrasCaso2() {
        String resultado = parte1.invertirPalabras("Prueba Técnica");
        assertEquals("abeurP acincéT", resultado);
    }

    @Test
    public void testInvertirPalabrasCaso3() {
        String resultado = parte1.invertirPalabras("Java es genial");
        assertEquals("avaJ se laineg", resultado);
    }

    @Test
    public void testInvertirPalabrasCaso4() {
        String resultado = parte1.invertirPalabras("");
        assertEquals("", resultado);
    }

    @Test
    public void testInvertirPalabrasCaso5() {
        String resultado = parte1.invertirPalabras("Solo");
        assertEquals("oloS", resultado);
    }

    @Test
    public void testInvertirPalabrasCaso6() {
        String resultado = parte1.invertirPalabras("  Espacios   múltiples ");
        assertEquals("  soicapsE   selpitlúm ", resultado);
    }

    @Test
    public void testInvertirPalabrasCaso7() {
        String resultado = parte1.invertirPalabras("¡Hola, Mundo!");
        assertEquals("¡aloH, odnuM!", resultado);
    }

    @Test
    public void testInvertirPalabrasCaso8() {
        String resultado = parte1.invertirPalabras(null);
        assertEquals("", resultado);
    }
}
