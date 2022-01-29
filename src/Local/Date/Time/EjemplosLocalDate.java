package Local.Date.Time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

//Ejemplos de usi de la clase LocalDate
public class EjemplosLocalDate {
    public static void main(String[] args) {
//crear una fecha con el valor de 20020125 usando el método LocalDate.of y LocalDate.parse
        LocalDate fecha = LocalDate.of(2022, 01, 25);
        System.out.println("LocalDate.of. " + fecha);
        LocalDate fecha1 = LocalDate.parse("2022-01-25");
        System.out.println("LocalDate.parse " + fecha1);
// Creación de otra fecha pero indicand el mes concreto: enum Month
        LocalDate fecha2 = LocalDate.of(2022, Month.JANUARY, 25);
        System.out.println("LocalDate con Month.JANUARY " + fecha2);
//Creación de una fecha con el valor de hoy
        LocalDate fecha3 = LocalDate.now();
        System.out.println("LocalDate.now() " + fecha3);

//Manipulación de fechas (Sumar o restar días, meses, años, etc ):
//sumo 10 días a la fecha de hoy.
//ojo si solo hacemos fecha3.plusDays(10), fecha3 nose modifica. Los métodos son inmutables
        LocalDate fecha4 = fecha3.plusDays(10);
        System.out.println("fecha de hoy más 10 días = " + fecha4);


//sumo 5 días a la fecha anterior con otro método indicando en los argumentos las unidades y a la
// parte de la fecha a la que afecta
        LocalDate fecha5 = fecha4.plus(5, ChronoUnit.DAYS);
        System.out.println("fecha anterior más 5 días  = " + fecha5);

//sumo 12 meses la fecha anterior
        LocalDate fecha6 = fecha5.plusMonths(12);
        System.out.println("sumo 12 meses a la fecha anterior = " + fecha6);

//      resto 2 años a la fecha anterior
        LocalDate fecha7 = fecha6.minus(2, ChronoUnit.YEARS);
        System.out.println("resto 2 años a la fecha anterior = " + fecha7);
//Comparar fechas
//       comprueba si 20181030 es anterior a 20181031. Devuelve true o false
        System.out.println(LocalDate.of(2018, 10, 30)
                .isBefore(LocalDate.of(2018, 10, 31)));
// comparamos las fechas 1 y 2 usando compare y equals
        System.out.println("fecha1 " + fecha1);
        System.out.println("fecha2 " + fecha2);
        System.out.println("¿son iguales las fechas 1 y 2? " + fecha1.compareTo(fecha2));
        System.out.println("¿son iguales las fechas 1 y 2? " + fecha1.equals(fecha2));
// comprobar si un año es bisiesto. Método isLeapYear()
        System.out.println(LocalDate.parse("2018-10-30").isLeapYear());
// calcula periodo de tiempo que existe  entre dos fechas. Se obtiene un objeto tipo periodo
        System.out.println("fecha1 " + fecha1);
        System.out.println("fecha6 " + fecha6);
        Period periodo = fecha1.until(fecha6);
// métodos para obtener información del perido recién obtenido
        System.out.println("meses entre fecha1 y fecha6: " + periodo.getMonths());
        System.out.println("meses entre fecha1 y fecha6: " + periodo.get(ChronoUnit.MONTHS));
        System.out.println("dias entre fecha1 y fecha6: " + periodo.getDays());
        System.out.println("dias entre fecha1 y fecha6: " + periodo.get(ChronoUnit.DAYS));
        System.out.println("años entre fecha1 y fecha6: " + periodo.get(ChronoUnit.YEARS));
        System.out.println("total meses entre fecha1 y fecha6: " + periodo.toTotalMonths());

// Obtener información sobre alguna fecha
        System.out.println(LocalDate.parse("2019-08-19").getDayOfWeek());
        System.out.println(LocalDate.parse("2019-08-19").getMonth());

// Mostrar una fecha formateada. Usa la clase DateTimeFormatter y el método ofPatern() para pasar el formato (patrón) y
// el método format para realizar el formateo
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaFormateada = fecha1.format(formato1);
        System.out.println("fecha1: " + fecha1);
        System.out.println("fecha1 formateada: " + fechaFormateada);
// Se puede añadir cualquier texto que queramos al formato (similar al simpleDateFormat)
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd 'del mes' MM 'del año 'yyyy");
        String fechaFormateada1 = fecha1.format(formato2);
        System.out.println("fecha1 con otro formato: " + fechaFormateada1);
        System.out.println("fecha1 con otro formato: " + fecha1.format(formato2));

//      Aplicar formato adaptado al pais por defecto
        DateTimeFormatter formato3= DateTimeFormatter
                .ofLocalizedDate(FormatStyle.FULL)
                .withLocale (Locale.getDefault());
        System.out.println("fecha1 con formato adaptado al pais por defecto: " + fecha1.format(formato3));
        DateTimeFormatter formato4= DateTimeFormatter
                .ofLocalizedDate(FormatStyle.MEDIUM)
                .withLocale (Locale.getDefault());
        System.out.println("fecha1 con formato adaptado al pais por defecto " +
                "con menos detalle: " + fecha1.format(formato4));
//      Aplicar formato adaptado al un pais concreto, en este caso china
        DateTimeFormatter formato5= DateTimeFormatter
                .ofLocalizedDate(FormatStyle.FULL)
                .withLocale (Locale.TRADITIONAL_CHINESE);
        System.out.println("fecha1 con formato adaptado al china: " + fecha1.format(formato5));
//hacemos lo cotrario, de una cadena sacamos un objeto Local Date usamos uno de los formatos anteriores
//el formateador tiene que coincidir con el String si no da una excpoecion
        String cadena = "25-01-2022";
        LocalDate fechaConFormato= LocalDate.parse(cadena,formato1);
        System.out.println("la fecha reformateada de la cadena "+ cadena+ " es: "+ fechaConFormato);


    }


}
