package Tema7_Ejercicio_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre, numero;
        double tipo, importe;

        //se crea objeto cuenta1 sin parámetros
        //se ejecuta el constructor por defecto
        Cuenta cuenta1 = new Cuenta();

        System.out.print("Nombre : ");
        nombre = sc.nextLine();
        System.out.print("Número de cuenta : ");
        numero = sc.nextLine();
        System.out.print("Tipo de interes : ");
        tipo = sc.nextDouble();
        System.out.print("Saldo: ");
        importe = sc.nextDouble();

        cuenta1.setNombre(nombre);
        cuenta1.setNumeroCuenta(numero);
        cuenta1.setTipoInteres(tipo);
        cuenta1.setSaldo(importe);

        //se crea el objeto cuenta1 con los valores leidos por teclado
        //se ejecuta el constructor con parámetros y se crea la cuenta 2
        Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300.0);

        //se crea cuenta3 como copia de cuenta1
        //se ejecuta el constructor copia
        Cuenta cuenta3 = new Cuenta(cuenta1);

        //mostrar los datos de cuenta1
        System.out.println("Datos de la cuenta 1");
        System.out.println("Nombre del titular: " + cuenta1.getNombre());
        System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println();
        //mostrar los datos de cuenta3
        System.out.println("Datos de la cuenta 3 copia de la cuenta 1");
        System.out.println("Nombre del titular: " + cuenta3.getNombre());
        System.out.println("Número de cuenta: " + cuenta3.getNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta3.getTipoInteres());
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println();

        //se realiza un ingreso en cuenta1
        if (cuenta1.ingreso(4000))
            //mostrar el saldo de cuenta1 después del ingreso
            System.out.println("se han ingresado 4000 € a la cuenta 1, saldo cuenta1 = " + cuenta1.getSaldo());
        else
            System.out.println("no se ha podido hacer el ingreso");

        //mostrar los datos de cuenta2
        System.out.println("Datos de la cuenta 2");
        System.out.println("Nombre del titular: " + cuenta2.getNombre());
        System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta2.getTipoInteres());
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();



        //realizar una transferencia de 10€ desde cuenta3 a cuenta2
        if (cuenta3.transferencia(cuenta2, 10)) {

            //mostrar el saldo de cuenta2

            System.out.println("se ha realizado una transferencia de 10€ desde cuenta3 a cuenta2");
            System.out.println("Saldo de la cuenta 2");
            System.out.println("Saldo: " + cuenta2.getSaldo());
            System.out.println();

            //mostrar el saldo de cuenta3
            System.out.println("Saldo de la cuenta 3");
            System.out.println("Saldo: " + cuenta3.getSaldo());
            System.out.println();
        }
    }
}