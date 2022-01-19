package Ejercicio.cubo;

/**
 * PruebaCubo.java
 * Programa que prueba la clase Cubo
 */
public class Main {
    public static void main(String[] args) {
//Vamos a crear un cubo de metal, rojo, sin asas, con 2 litros de capacidad y vacío y lo pintamos
        Cubo cubo1 = new Cubo("metal", "rojo",false, 2, 0);
        System.out.println("Cubo1: ");
        cubo1.pinta();
//Vamos a crear un segundo cubo copia del primero
        Cubo cubo2=new Cubo(cubo1);

//Al segundo cubo le vamos a aumentar la capacidad a 5 litros y los pintamos también
        cubo2.setCapacidad(5);
        System.out.println("\n Cubo2:");
        cubo2.pinta();

// Vamos a llenar el cubo primero y lo vamos a pintar

        System.out.println("\nLleno el cubo1: ");
        cubo1.llena();
        cubo1.pinta();

        System.out.println("\nEl cubo2 sigue vacío: ");
        cubo2.pinta();
//Vamos a volcar el cubo primero en el segundo y vamos a pintar ambos cubos

        System.out.println("\nAhora vuelco lo que tiene el cubo1 en el cubo2.\n");
        cubo2.volcarCubo2(cubo1);
        System.out.println("Cubo1: ");
        cubo1.pinta();
        System.out.println("\nCubo2:");
        cubo2.pinta();
//Vamos a llenar el segundo cubo y lo vamos a volcar en el primero y vamos a pintar ambos cubos
        System.out.println("\nAhora lleno el cubo 2 y lo vuelco en el cubo1");
        cubo2.llena();
        cubo1.volcarCubo2(cubo2);
        System.out.println("Cubo1: ");
        cubo1.pinta();
        System.out.println("\nCubo2: ");
        cubo2.pinta();
        System.out.println("\nPinto Cubo2 con toString(): ");
        System.out.println(cubo2);
    }
}