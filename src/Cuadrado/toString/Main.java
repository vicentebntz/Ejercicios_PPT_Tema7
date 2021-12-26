package Cuadrado.toString;

public class Main {
    public static void main(String[] args) {
        Cuadrado miCuadrado = new Cuadrado(5);
//invocación formal
        System.out.println(miCuadrado.toString());
// así también funcionaría porque println sabe que el parámetro ha de ser un String
        System.out.println(miCuadrado);



    }
}