import org.junit.jupiter.api.Test;


import java.time.DateTimeException;

import static org.junit.jupiter.api.Assertions.*;

class ValidarEdadTest {

    @Test
    void esMayorDeEdad() {

    assertTrue(ValidarEdad.esMayorDeEdad(25));
    assertFalse(ValidarEdad.esMayorDeEdad(5));
    assertFalse(ValidarEdad.esMayorDeEdad(-5));

    }


    @Test
    void testEsMayorDeEdad() {

        assertTrue(ValidarEdad.esMayorDeEdad(12, 10, 1492));
        assertTrue(ValidarEdad.esMayorDeEdad(13, 1, 2007));
        assertTrue(ValidarEdad.esMayorDeEdad(12, 1, 2007));
        assertFalse(ValidarEdad.esMayorDeEdad(14, 1, 2007));
        assertFalse(ValidarEdad.esMayorDeEdad(3, 5, 2020));
        assertThrows(DateTimeException.class,()->ValidarEdad.esMayorDeEdad(29, 2, 2020));
    }
}