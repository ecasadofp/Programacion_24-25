import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();

    @Test
    void resta() {


        assertEquals(3,calculadora.resta(8, 5));
        assertEquals(0, calculadora.resta(3,3));
        assertEquals(-4, calculadora.resta(10, 14));
        assertEquals(-4, calculadora.resta(-10,-6));

    }

    @Test
    void suma() {
        assertEquals(4, calculadora.suma(3, 1));
        assertEquals(0, calculadora.suma(3, -3));
        assertEquals(0, calculadora.suma(-3, 3));
        assertNotEquals(0, calculadora.suma(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }

    @Test
    void multiplicacion() {
        assertEquals(0, calculadora.multiplicacion(3, 0));
        assertEquals(0, calculadora.multiplicacion(0, Integer.MAX_VALUE));
        assertEquals(0, calculadora.multiplicacion(0, Integer.MIN_VALUE));
    }

    @Test
    void division() {

        assertEquals(1,calculadora.division(3,2));
    }

    @Test
    void esPar() {

        assertTrue(calculadora.esPar(2));
        assertFalse(calculadora.esPar(3));
    }
}