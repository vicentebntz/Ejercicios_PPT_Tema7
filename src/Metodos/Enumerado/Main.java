package Metodos.Enumerado;

import java.sql.SQLOutput;

enum DiasDeLaSemana {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO};

public class Main {
    public static void main (String[] args) {
// llenamos la tabla de dias con values()
// se puede hacer así
//        DiasDeLaSemana[] tablaDias = DiasDeLaSemana.values();
// o así
        DiasDeLaSemana tablaDias[];
        tablaDias = DiasDeLaSemana.values();

//recorremos el enumerado indicando la posición de dos maneras, con for o con foreach
        System.out.println("Recorremos la tabla con un for ");
        for (int i=0; i<tablaDias.length;i++){
            System.out.println(tablaDias[i] + " es el día del índice " + i );
        }
        System.out.println("\n Recorremos la tabla con un foreach ");
        for (DiasDeLaSemana dias : tablaDias){
        System.out.println( dias + " es el indice "+ dias.ordinal());
        }

//usando valueOf() devolvemos un valor de enumerado
        System.out.println("\n Sacamos el día de la semana con valueOf del enum indicando directamente" +
                " el valor de la constante enumerada");
        System.out.println(DiasDeLaSemana.valueOf("LUNES"));
// También podemos hacer esto y nos devolvería lo mismo
        DiasDeLaSemana miDia;
        miDia=DiasDeLaSemana.LUNES;
// nos devolvería también lunes
        System.out.println("\n Sacamos el día de la semana con valueOf del objeto definido como enum ");
        System.out.println(DiasDeLaSemana.valueOf(miDia.toString()));
// ahora vamos a obtener la posición del valor domingo
        miDia=DiasDeLaSemana.DOMINGO;
        System.out.println("\n Asignamos el valor domingo al objeto y mostramos su valor y el número de orden ");
        System.out.println(DiasDeLaSemana.valueOf(miDia.toString()));
        System.out.println(miDia.ordinal());
//vamos a jugar con ordinal() y compareTo(enum)
        DiasDeLaSemana dia1, dia2,dia3;
        dia1=DiasDeLaSemana.LUNES;
        dia2=DiasDeLaSemana.DOMINGO;
        dia3=DiasDeLaSemana.LUNES;
        if(dia1.compareTo(dia2)<0) {
            System.out.println(dia1.toString() + " es anterior a " + dia2.toString());
        }
        if(dia2.compareTo(dia1)>0) {
            System.out.println(dia2.toString() + " es poterior a " + dia1.toString());
        }
        if(dia1.compareTo(dia3)==0) {
            System.out.println(dia1.toString() + " es el mismo día que  " + dia3.toString());
        }

    }

}
