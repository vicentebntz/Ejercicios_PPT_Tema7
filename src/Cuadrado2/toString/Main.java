package Cuadrado2.toString;

import Cuenta.Visibilidad.Cuenta;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado=new Cuadrado(6);
        System.out.println(cuadrado.toString());

/**
 * Voy a probar los atribitos de la clase Cuenta del paquete Cuenta.Visibilidad
 *
  */
        String nombre, dni="";
        double saldo=0;
        Cuenta cta=new Cuenta("juan", 4500.12, "76543R");
/**
 * voya a comprobar que puedo acceder a nombre porque es un atributo publico, y no puedo acceder a dni porque
 * esta clase no es vecina de Cuenta y dni no tiene cualificador y tampoco puedo acceder a saldo porque
 * es un atributo privado
  */
        nombre= cta.nombre;// ok
//      dni= cta.dni; -->KO
//      saldo=cta.saldo; --> KO
        saldo=cta.getSaldo(); //OK

        System.out.println("nombre de la cueenta = "+ nombre);
        System.out.println("dni de la cuenta = "+  dni);
        System.out.println("saldo de la cuenta = "+  saldo);


    }
}
