package Fechas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateCalendar {
    public static void main (String args[]){
// fecha del día
        Date fecha1 = new Date();
        System.out.println("fecha1 (fecha hora actual): " + fecha1);

//fecha  1 de enero del 2000. Tenemos que poner 100 en el año porque java empieza en el año 1900 y el
// mes 0 porque enero es el mes 0 y diciembre es el mes 11
        Date fecha2 = new Date(100, 0,1);
        System.out.println("\nfecha2 (new Date (100,0,1)): " + fecha2);

// 28 de diciembre del 2021 a las 10 horas, 6 minutos y 56 segundos
        Date fecha3 = new Date(121, 11,28, 10,06,56);
        System.out.println("\nfecha3 (new Date (121,11,28,10,06,56)): " + fecha3);

//Extraemos cada parte de la fecha anterior
        System.out.println("extraemos cada parte de la fecha 3:");
        System.out.println("Año: "+ fecha3.getYear());
        System.out.println("Mes: "+ fecha3.getMonth());
        System.out.println("Día: "+ fecha3.getDate());
        System.out.println("día de la semana: "+ fecha3.getDay());
        System.out.println("Horas: "+ fecha3.getHours());
        System.out.println("Minutos: "+ fecha3.getMinutes());
        System.out.println("Segundos: "+ fecha3.getSeconds());
//uso de after, before y compareTo
//vamos a comparar fecha2 que es 1-1-2000 con fecha 1 que es 28-12-2021
        System.out.println("Vamos a comparar fecha1 y fecha2 con before y after");
        System.out.println("fecha1 " + fecha1);
        System.out.println("fecha2 " + fecha2);
        System.out.println("¿es fecha 1 anterior a fecha 2? "+ fecha1.before(fecha2));
        System.out.println("¿es fecha 1 posterior a fecha 2? "+ fecha1.after(fecha2));
        System.out.println("comparamos fecha 1 y 2 con compare: (fecha1.compareTo(fecha2))");
        switch (fecha1.compareTo(fecha2)){
            case -1:
                System.out.println("fecha 1 es menor que fecha2");
                break;
            case 1:
                System.out.println("fecha1 es mayor que fecha2");
                break;
            case 0:
                System.out.println("las fechas son siguales" );
                break;
            default:break;
        }

//vamos a dar formato a la fecha1
        System.out.println("formateamos fecha con la clase SimpleDateFormat");
        SimpleDateFormat fechaFormateada1 = new SimpleDateFormat("yyyy-mm-dd");
        SimpleDateFormat fechaFormateada2 = new SimpleDateFormat("YYYY-MM-DD");
        System.out.println("fecha 1 formateada como yyyy-mm-dd: "+fechaFormateada1.format(fecha1));
        System.out.println("fecha 1 formateada como YYYY-MM-DD: "+fechaFormateada2.format(fecha1));
//vamos a dar formato a la fecha1 en Español para que salga En Sevilla a 28 de diciembre de 2021
        System.out.println("\nAplicamos un nuevo formato a la fecha: ");
        SimpleDateFormat fechaSevilla = new SimpleDateFormat("'En Sevilla a' EEEE',' dd 'de' MMMM 'de' yyyy");
        System.out.println(fechaSevilla.format(fecha1));
    }
}
