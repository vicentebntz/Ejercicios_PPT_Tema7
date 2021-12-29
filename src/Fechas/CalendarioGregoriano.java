package Fechas;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.SocketHandler;

public class CalendarioGregoriano {
    public static void main(String args []){
//"Extraer la información de la Fecha/hora actual”
        System.out.println("Extraer la información de la Fecha/hora actual");
        GregorianCalendar fecha = new GregorianCalendar();
        System.out.println("Año: "+ fecha.getWeekYear());
        System.out.println("Año: " + fecha.get(Calendar.YEAR));
        System.out.println("Mes: "+ fecha.get(Calendar.MONTH));
        System.out.println("Día: "+ fecha.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hora: "+ fecha.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minuto: "+ fecha.get(Calendar.MINUTE));
        System.out.println(("Segundo: "+ fecha.get(Calendar.SECOND)));

//Crea la fecha de 23 de noviembre del 2000 y muéstrala en formato dia-mes (en letras) - año
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MMMM-yyyy");
        System.out.println("\nCrea la fecha de 23 de noviembre del 2000");
        GregorianCalendar fecha2 = new GregorianCalendar(2000,10,23);
        System.out.println("Fecha 2: "+ formatoFecha.format(fecha2.getTime()));

//Suma 62 días a la fecha de hoy y muestro la fecha en formato dia-mes (en letras) - año
        GregorianCalendar fecha3= new GregorianCalendar();
        fecha3.add(Calendar.DAY_OF_MONTH,62);
        System.out.println("\nfecha de hoy:"+ formatoFecha.format(new GregorianCalendar().getTime()));
        System.out.println("sumo 62 días a la fecha de hoy: "+ formatoFecha.format(fecha3.getTime()));

//Muestra el día de hace 34 días a partir de hoy
        GregorianCalendar fecha4= new GregorianCalendar();
        fecha4.add(Calendar.DAY_OF_MONTH,-34);
        System.out.println("Resto 34 días a la fecha de hoy: "+ formatoFecha.format(fecha4.getTime()));
    }
}
