package Local.Date.Time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjemplosLocalDateTime {
    public static void main(String[] args) {
/**
 * creamos objetos Localtime con la hora actual y otras dos horas que formateo con los métodos
 * .of y .parse
 */
        LocalDateTime fechahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd:hh:mm:ss.nn");
        LocalDateTime fechahora1 = LocalDateTime.of(2022, 01, 26, 22, 12, 23, 345);
        LocalDateTime fechahora2 = LocalDateTime.parse("2022-01-26T10:13:15.1254");
        System.out.println("fechahora actual,.now: " + fechahora);
        System.out.println("fechahora1 , .of: " + fechahora1);
        System.out.println("fechahora2 actual, .parse:" + fechahora2);
/**
 *Modificar un LocalTime sumando a las horas, minutos, sgunfos...
 */
/*        System.out.println();
        LocalTime hora3 = hora.plusHours(2);
        LocalTime hora4 = hora.plusMinutes(34);
        LocalTime hora5 = hora.plusSeconds(34);
        System.out.println("hora actual más dos horas " + hora3);
        System.out.println("hora actual más 34 min. " + hora4);
        System.out.println("hora actual más 34 seg. " + hora5);
/**
 * Comparar dos LocalTime con Before y After
 *
 */
        /*
        System.out.println();
        System.out.println("hora3: " + hora3);
        System.out.println("hora4: " + hora4);
        System.out.println("hora3 es anterior a hora4?: " + hora3.isBefore(hora4));
        System.out.println("hora3 es posterior a hora4?: " + hora3.isAfter(hora4));
/**
 * Extraemos las partes de una hora
 */
    /*    System.out.println();
        System.out.println("la hora de hora3 es: " + hora3.getHour());
        System.out.println("los minutos de hora3 son: " + hora3.getMinute());
        System.out.println("los segundos de hora3 son: " + hora3.getSecond());
        System.out.println("los nanoseg. de hora3 son: " + hora3.getNano());


//      Comparar dos local time con compareTo() y equals()
        System.out.println("comparamos hora3 y hora4 con compareTo: " + hora3.compareTo(hora4));
        System.out.println("comparamos hora3 y hora4 con equals: " + hora3.equals(hora4));
//      Período comprendido entre dos LocalTime
        System.out.println("perido entre hora4 y la hora actual en minutos= " +
                hora.until(hora4, ChronoUnit.MINUTES));

//        Crear una Local Date a partir de una cadena
        String miHora = "21:59:45.345";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss.nn");
        LocalTime horaFormateada = LocalTime.parse(miHora, formato);
        System.out.println("hora formateada: " + horaFormateada);

*/
    }
}
