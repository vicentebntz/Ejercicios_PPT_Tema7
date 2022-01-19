package Cuenta.Visibilidad;

public class Main {
    public static void main(String[] args) {
        Cuenta cta = new Cuenta("pepe", 4500.50, "34576H");

        String nombre, dni;
        double saldo=0;
/**
 * puedo acceder a nombre porque es publico y a dni porque no tiene cualificador por lo que es visible
 * para esta clase que es vecina, pero me da error acceder a saldo porque está definido como privado
 * voy a acceder al nombre desde la clase main del poquete Cuadrado2.toString, a ver qué pasa
  */
        nombre= cta.nombre;
        dni= cta.dni;
//      saldo=cta.saldo;
        saldo=cta.getSaldo(); // esto sí funciona

        System.out.println("nombre de la cueenta = "+ nombre);
        System.out.println("dni de la cuenta = "+  dni);
        System.out.println("saldo de la cuenta = "+  saldo);
    }
}
