// Implementa una clase "ValidadorEdad" con un método
//  que determine si una persona es mayor de edad (18 años o más).
//  Escribe una prueba unitaria para comprobar que el método
//  funciona correctamente para diferentes edades.

import java.time.LocalDate;
import java.time.Period;

public class ValidarEdad {

    public static boolean esMayorDeEdad(int edad){

        return edad >= 18;

    }
    public static boolean esMayorDeEdad(LocalDate nacimiento){
        LocalDate ahora = LocalDate.now();

        Period transcurrido = Period.between(nacimiento, ahora);

        return (transcurrido.getYears() >= 18);
    }

    public static boolean esMayorDeEdad(int d, int m, int a){

        LocalDate nacimiento = LocalDate.of(a, m, d);

        return esMayorDeEdad(nacimiento);

    }

}
