package parte2;

import com.programandoenjava.parte2.Parte2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Parte2Test {

    private Parte2 parte2;

    @BeforeEach
    public void setUp() {
        parte2 = new Parte2();
    }

    @Test
    public void testAgregarYSumarNumeros() {

        parte2.agregarNumero(5);
        parte2.agregarNumero(10);
        parte2.agregarNumero(3);
        assertEquals(18, parte2.sumarNumeros());
    }

    @Test
    public void testSumarNumerosListaVacia() {
        assertEquals(0, parte2.sumarNumeros());
    }

    @Test
    public void testSumarNumerosNegativos() {
        parte2.agregarNumero(-2);
        parte2.agregarNumero(-8);
        assertEquals(-10, parte2.sumarNumeros());
    }

    @Test
    public void testSumarNumerosGrandes() {
        parte2.agregarNumero(1000);
        parte2.agregarNumero(2000);
        parte2.agregarNumero(3000);
        assertEquals(6000, parte2.sumarNumeros());
    }

    @Test
    public void testSumarNumerosMixtos() {
        parte2.agregarNumero(5);
        parte2.agregarNumero(-3);
        parte2.agregarNumero(8);
        parte2.agregarNumero(-2);
        assertEquals(8, parte2.sumarNumeros());
    }

    @Test
    public void testAgregarYSumarNumerosConInicializacion() {

        parte2.agregarNumero(5);
        assertEquals(5, parte2.sumarNumeros());

        parte2.agregarNumero(-3);
        assertEquals(2, parte2.sumarNumeros());
    }
}
