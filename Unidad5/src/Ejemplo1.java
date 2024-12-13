/*
Comprueba el día de la semana en el que naciste y cuantos días has vivido.
 */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;


public class Ejemplo1 {

    public static void main(String[] args) {

        LocalDate hoy = LocalDate.now();
        LocalDate cumple = LocalDate.of(1970, 1, 1);

        long transcurrido = ChronoUnit.DAYS.between(cumple, hoy);

        int dia = cumple.getDayOfMonth();
        Month month = cumple.getMonth();
        int year = cumple.getYear();
        DayOfWeek dayOfWeek = cumple.getDayOfWeek();

        String mes = traduceMes(month);
        String diaDeLaSemana = traduceDiaSemana(dayOfWeek);

        // El día 1 de enero de 1970 era jueves. Han transcurrido 20070 días

        System.out.printf("El día %d de %s de %d era %s. Han transcurrido %d días", dia, mes, year, diaDeLaSemana, transcurrido);

    }

    public static String traduceMes(Month month){

        String mes;

        HashMap<Month, String> meses = new HashMap<>();
        meses.put(Month.JANUARY, "enero");
        meses.put(Month.FEBRUARY, "febrero");
        meses.put(Month.MARCH, "marzo");
        meses.put(Month.APRIL, "abril");
        meses.put(Month.MAY, "mayo");
        meses.put(Month.JUNE, "junio");
        meses.put(Month.JULY, "julio");
        meses.put(Month.AUGUST, "agosto");
        meses.put(Month.SEPTEMBER, "septiembre");
        meses.put(Month.OCTOBER, "octubre");
        meses.put(Month.NOVEMBER, "noviembre");
        meses.put(Month.DECEMBER, "diciembre");

        return meses.get(month);

    }

    public static String traduceDiaSemana(DayOfWeek dayOfWeek){

        HashMap<DayOfWeek, String> diasSemana = new HashMap<>();

        diasSemana.put(DayOfWeek.MONDAY, "lunes");
        diasSemana.put(DayOfWeek.TUESDAY, "martes");
        diasSemana.put(DayOfWeek.WEDNESDAY, "miércoles");
        diasSemana.put(DayOfWeek.THURSDAY, "jueves");
        diasSemana.put(DayOfWeek.FRIDAY, "viernes");
        diasSemana.put(DayOfWeek.SATURDAY, "sábado");
        diasSemana.put(DayOfWeek.SUNDAY, "domingo");

        return diasSemana.get(dayOfWeek);

    }
}
