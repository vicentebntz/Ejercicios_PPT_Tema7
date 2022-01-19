package Manejo.Wrapper;

public class Main {
    public static void main(String[] args) {
/**
 *  CLASES ENVOLTORIO PARA TIPOS PRIMITIVOS
 */

//Podemos procesar una cadena de caracteres
//para obtener un valor int
    int x = Integer.parseInt("12345");
    System.out.println(x);

//Podemos obtener el máximo entre dos enteros
    System.out.println(Integer.max(x, 12346));

//Podemos obtener la representación binaria, hexadecimal u ocatl de un número entero
    System.out.println(Integer.toBinaryString(x));

//Podemos obtener instancias de cualquier tipo con los métodos valueOf(...).
    Long l = Long.valueOf("34597623495729346");
    Long l1 = Long.valueOf(456);
    Double d = Double.valueOf(3.141592);
    Double d1= Double.valueOf("45879");
// los wrappers permiten trabajar directamente con el tipo primitivo, en los println siguientes
// se ve que no se imprime un tipo objeto: paquete.calse@referencia, sino directamente el número
    System.out.println("l = " + l);
    System.out.println("l1 = " + l1);
    System.out.println("d = " + d);
    System.out.println("d1 = " + d1);
//Podemos saber si un caracter es una letra o un número
    char c = 'a';
    System.out.println("a es un caracter? " + Character.isAlphabetic(c));
    System.out.println("a es un dígito? " + Character.isDigit(c));

//Podemos realizar operaciones lógicas con valores booleanos
    System.out.println(Boolean.logicalXor(true, true));

//Devuelve el valor equivalente
        Integer num = 30;
        int numInt = num.intValue();
        double numDouble = num.doubleValue();
        System.out.println(Character.isDigit(c));
        System.out.println("numInt = "+ numInt+ " numdouble = "+ numDouble);
}

        }
